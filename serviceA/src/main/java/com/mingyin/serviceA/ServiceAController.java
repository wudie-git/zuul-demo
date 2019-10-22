package com.mingyin.serviceA;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mingyin.api.ServiceAInterface;
import com.mingyin.api.User;

@RestController
public class ServiceAController implements ServiceAInterface {

    public String sayHello(@PathVariable("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age) {
        System.out.println("打招呼，id=" + id + ", name=" + name + ", age=" + age);
        return "{'msg': 'hello, " + name + "'}";
    }

    public String wowotou(@PathVariable("id") Long id,
                         @RequestParam("name") String name,
                         @RequestParam("age") Integer age) {
        System.out.println("说再见，id=" + id + ", name=" + name + ", age=" + age);
        return "{'msg': 'bye, " + name + "'}";
    }

}
