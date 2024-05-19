package com.guddu.demoproduct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloName(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/hello/{name}/{times}")
    public String sayHelloNameNTimes(@PathVariable("name") String name, @PathVariable("times") int times) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < times; i++) {
            sb.append("Hello " + name + " " + (i+1));
            sb.append("<br>");
        }
        return sb.toString();
    }
}
