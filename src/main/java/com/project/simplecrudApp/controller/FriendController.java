package com.project.simplecrudApp.controller;

import com.project.simplecrudApp.model.Friends;
import com.project.simplecrudApp.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@RestController
public class FriendController {
    @Autowired
    FriendService friendService;

    @GetMapping("/friends")
    Iterable<Friends> read(){
        return friendService.findAll();
    }

    @PostMapping("/friend")
    Friends create(@RequestBody Friends friend){
        return friendService.save(friend);
    }

    @PutMapping("/friend/{id}")
    void edit(@PathVariable Long id, @RequestBody Friends friend){
        friendService.edit(id ,friend);
    }
    @DeleteMapping("/friend/{id}")
    void delete(@PathVariable Long id){
         friendService.delete(id);
    }
}
