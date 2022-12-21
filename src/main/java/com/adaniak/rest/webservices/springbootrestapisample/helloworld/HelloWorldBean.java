package com.adaniak.rest.webservices.springbootrestapisample.helloworld;

public class HelloWorldBean {
    private String message;
    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }
    public HelloWorldBean(String message)
    {
        super();
        this.message = message;
    }
}
