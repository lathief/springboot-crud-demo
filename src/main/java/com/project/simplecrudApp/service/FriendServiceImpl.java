package com.project.simplecrudApp.service;

import com.project.simplecrudApp.model.Friends;
import com.project.simplecrudApp.repository.FriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FriendServiceImpl implements FriendService{
    @Autowired
    FriendRepo friendRepo;

    public Iterable<Friends> findAll() {
        return friendRepo.findAll();
    }

    public Iterable<Friends> searchByFirstName(String firstname) {
        return friendRepo.findByFirstName(firstname);
    }

    public Iterable<Friends> searchByLastName(String lastname) {
        return friendRepo.findByLastName(lastname);
    }

    public Iterable<Friends> searchByBothNames(String firstname, String lastname) {
        return friendRepo.findByBothName(firstname, lastname);
    }


    @Override
    public Optional<Friends> findByID(Long id) {
        return friendRepo.findById(id);
    }

    public Friends save(Friends friend) {
        return friendRepo.save(friend);
    }

    public void edit(Friends friend) {
        friendRepo.save(friend);
    }

    public void delete(Long id) {
        friendRepo.deleteById(id);
    }

}
