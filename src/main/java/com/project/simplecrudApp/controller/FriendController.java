package com.project.simplecrudApp.controller;

import com.project.simplecrudApp.model.Friends;
import com.project.simplecrudApp.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.Optional;

@RestController
public class FriendController {
    @Autowired
    FriendService friendService;

    @GetMapping("/friends")
    Iterable<Friends> read(){
        return friendService.findAll();
    }

    @GetMapping("/friend/{id}")
    Optional<Friends> read(@PathVariable Long id){
        return friendService.findByID(id);
    }

    @GetMapping("/friend/search")
    Iterable<Friends> search(@RequestParam(required = false) String first, @RequestParam(required = false) String last){
        if (first != null && last != null){
            return friendService.searchByBothNames(first, last);
        } else if (first != null){
            return friendService.searchByFirstName(first);
        } else if (last != null){
            return friendService.searchByLastName(last);
        } else {
            return friendService.findAll();
        }
    }

    @PostMapping("/friend")
    Friends create(@RequestBody Friends friend){
        return friendService.save(friend);
    }

    @PutMapping("/friend")
    void edit(@RequestBody Friends friend){
        friendService.edit(friend);
    }
    @DeleteMapping("/friend/{id}")
    void delete(@PathVariable Long id){
         friendService.delete(id);
    }
}
