package com.mingyin.serviceB;

import com.mingyin.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ServiceB/user")
public class ServiceBController {

    @Autowired
    private ServiceAClient serviceA;

    @RequestMapping(value = "/sayHello/{id}", method = RequestMethod.GET)
    public String greeting(@PathVariable("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age) {
        return serviceA.sayHello(id, name, age);
    }

    @RequestMapping(value = "/wowotou/{id}", method = RequestMethod.GET)
    public String runng(@PathVariable("id") Long id,
                        @RequestParam("name") String name,
                        @RequestParam("age") Integer age) {
        return serviceA.wowotou(id, name, age);
    }

}
