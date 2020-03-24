package com.tosh.userspring.service;

import com.tosh.userspring.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto updateUser(String id, UserDto user);
    UserDto getUser(String email);
    UserDto getUserByUserId(String id);
}
