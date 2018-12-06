package com.cognizant.introtospringboot.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final class HomeController {

    @GetMapping("/")
    String index(){
        return "Learning Spring Boot";
    }


}
