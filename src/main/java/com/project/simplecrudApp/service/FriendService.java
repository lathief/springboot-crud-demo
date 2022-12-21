package com.project.simplecrudApp.service;

import com.project.simplecrudApp.model.Friends;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FriendService {
    Iterable<Friends> findAll();
    Optional<Friends> findByID(Long id);
    Friends save(Friends friend);
    void edit(Long id, Friends friend);
    void delete(Long id);
}
