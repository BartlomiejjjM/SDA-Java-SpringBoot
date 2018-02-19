package com.kchmielewski.sda.java.springboot.security.application;

import com.kchmielewski.sda.java.springboot.security.application.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String username);
}
