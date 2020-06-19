package com.example.demo.hello;

import com.example.demo.hello.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(path="/hello-world/", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping(path="/hello-world-bean/")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello world");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello %s", name));
    }
}
