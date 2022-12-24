package com.project.simplecrudApp.repository;

import com.project.simplecrudApp.model.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepo extends JpaRepository<Friends, Long> {
    @Query(value = "SELECT * FROM friends WHERE firstname = ?1", nativeQuery = true)
    Iterable<Friends> findByFirstName(String first);

    @Query(value = "SELECT * FROM friends WHERE lastname = ?1", nativeQuery = true)
    Iterable<Friends> findByLastName(String last);

    @Query(value = "SELECT * FROM friends WHERE firstname = ?1 AND lastname = ?2", nativeQuery = true)
    Iterable<Friends> findByBothName(String first, String last);
}
