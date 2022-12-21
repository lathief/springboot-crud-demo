package com.project.simplecrudApp.repository;

import com.project.simplecrudApp.model.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepo extends JpaRepository<Friends, Long> {
}
