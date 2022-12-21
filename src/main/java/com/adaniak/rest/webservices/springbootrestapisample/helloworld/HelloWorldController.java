package com.adaniak.rest.webservices.springbootrestapisample.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello-World";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!!!");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-path-param/{name}")
    public HelloWorldBean helloWorldPathParam(@PathVariable String name) {
        return new HelloWorldBean("Welcome Dear " + name);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-path-param/{name}/message/{message}")
    public HelloWorldBean helloWorldMultiplePathParam(@PathVariable String name, @PathVariable String message) {
        return new HelloWorldBean("Welcome Dear " + name + " and your message is " + message);
    }
}
