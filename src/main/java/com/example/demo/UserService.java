package com.example.demo;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Map<Integer, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }
    
    public User getUserById(int id) {
        if (!users.containsKey(id)) {
            throw new NoSuchElementException("User with ID " + id + " not found");
        }
        return users.get(id);
    }
    
    public void deleteUserById(int id) {
        if (!users.containsKey(id)) {
            throw new NoSuchElementException("User with ID " + id + " not found");
        }
        users.remove(id);
    }
    
    public void updateUser(int id, User updatedUser) {
        if (!users.containsKey(id)) {
            throw new NoSuchElementException("User with ID " + id + " not found");
        }
        User user = users.get(id);
        user.setName(updatedUser.getName());
        user.setAge(updatedUser.getAge());
    }



}
