package com.tosh.userspring.security;

import com.tosh.userspring.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPERATION_DATE = 864000000;
    public static final String TOKEN_PREFIX = "Bearer: ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";


    public  static String getTokenSecret(){
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");

        return appProperties.getTokenSecret();
    }
}
