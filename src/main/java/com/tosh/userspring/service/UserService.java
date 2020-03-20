package com.tosh.userspring.service;

import com.tosh.userspring.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {
    UserDto createUser(UserDto user);
}
