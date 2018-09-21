package com.walmart.dao;

import org.springframework.stereotype.Component;

/* Spring autoload */
@Component
public class HelloDaoImpl implements HelloDao{
    public String hello(){
        return "hello";
    }
}