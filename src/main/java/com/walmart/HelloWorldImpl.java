package com.walmart;

import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import com.walmart.dao.HelloDao;

/* Spring autoload */
@Component
public class HelloWorldImpl implements HelloWorld {

    @Autowired /* Spring autoinit */
    private HelloDao helloDao;

    public String sayHi(String text) {
        System.out.println("sayHi called");
        return helloDao.hello() + " " + text;
    }

    public String hello(String text) {
        return this.sayHi(text);
    }

    public TestObject test() {
        return new TestObject("test");
    }

}