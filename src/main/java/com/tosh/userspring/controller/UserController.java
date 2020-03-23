package com.tosh.userspring.controller;

import com.tosh.userspring.model.request.UserDetailsRequest;
import com.tosh.userspring.model.response.UserRest;
import com.tosh.userspring.service.UserService;
import com.tosh.userspring.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequest userDetails){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);

        UserRest returnValue = new UserRest();
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
