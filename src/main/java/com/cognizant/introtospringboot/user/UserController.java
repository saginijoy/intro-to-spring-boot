package com.cognizant.introtospringboot.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final List<UserModel> users = new ArrayList<>();

    {
        users.add(new UserModel("Default User"));
        users.add(new UserModel("Fred","fred@gmail.com","0"));
        users.add(new UserModel("Alex","alex@gmail.com","2"));
    }

    @GetMapping("/")
    List<UserModel> list() {
        return users;
    }

    @GetMapping("/{index}")
    UserModel getUser(@PathVariable("index") final int index) {
        return users.get(index);
    }

    @GetMapping(value = {"/me/","/me/{index}"})
    UserModel getMyProperty(@PathVariable("index") final Optional<Integer> index) {
        return users.get(index.orElse(0));
    }
}
