package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AppUser;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Long> {

	Optional<AppUser> findByUsername(String username);
}
