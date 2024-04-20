package com.upendra.rai.repositories;

import java.util.Optional;

import com.upendra.rai.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
