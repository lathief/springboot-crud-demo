package com.project.simplecrudApp.service;

import com.project.simplecrudApp.model.Friends;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FriendService {
    Iterable<Friends> findAll();
    Iterable<Friends> searchByBothNames(String firstname, String lastname);
    Iterable<Friends> searchByLastName(String lastname);
    Iterable<Friends> searchByFirstName(String firstname);
    Optional<Friends> findByID(Long id);
    Friends save(Friends friend);
    void edit(Friends friend);
    void delete(Long id);
}
