package com.ms.user.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.dtos.UserRecordDto;
import com.ms.user.models.UserModel;

import jakarta.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@ResquestBody @Valid UserRecordDto userRecordDto) {
        var UserModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto, UserModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

}
