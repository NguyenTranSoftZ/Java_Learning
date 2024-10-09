package com.softz.identity.controller;

import com.softz.dto.UserDto;
import com.softz.dto.request.NewUserRequest;
import com.softz.identity.entity.User;
import com.softz.identity.service.UserService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public UserDto createUser(@RequestBody NewUserRequest user) {
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable("id") String userId) {
        return userService.getUserById(userId);
    }

    // @GetMapping("/user/filter")
    // public UserDto getUserByUsername(@Param("username") String username) {
    // return userService.getUserByUsername(username);
    // }

    @GetMapping("/username/{username}")
    public UserDto getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

}
