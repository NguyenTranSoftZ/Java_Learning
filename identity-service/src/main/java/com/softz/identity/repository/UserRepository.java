package com.softz.identity.repository;

import com.softz.identity.entity.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username); // muốn tìm gì thì prefix là 'findby...'
    //findby... có thể apply với hầu hết syntax của các loại DB
}
