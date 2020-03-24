package com.tosh.userspring.exceptions;

public class UserServiceException extends RuntimeException{
    public static final long serialVersionUID = 1l;

    public UserServiceException(String message) {
        super(message);
    }
}
