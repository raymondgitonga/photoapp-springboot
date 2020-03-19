package com.tosh.userspring.service;

import com.tosh.userspring.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
