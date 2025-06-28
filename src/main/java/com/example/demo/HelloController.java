package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Map<String, String> addUser(@RequestBody User user) {
        userService.addUser(user);
        Map<String, String> response = new HashMap<>();
        response.put("message", "User " + user.getName() + " aged " + user.getAge() + " added!");
        return response;
    }

    @GetMapping("/users")
    public Collection<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }
    
    @DeleteMapping("/user/{id}")
    public Map<String, String> deleteUser(@PathVariable int id) {
        userService.deleteUserById(id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "User with ID " + id + " deleted successfully");
        return response;
    }
    
    @PutMapping("/user/{id}")
    public Map<String, String> updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        userService.updateUser(id, updatedUser);
        Map<String, String> response = new HashMap<>();
        response.put("message", "User with ID " + id + " updated successfully");
        return response;
    }


    
    @ExceptionHandler(NoSuchElementException.class)
    public Map<String, String> handleUserNotFound(NoSuchElementException ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", ex.getMessage());
        return error;
    }

}
