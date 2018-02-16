package com.kchmielewski.sda.java.springboot.player.application;

import com.kchmielewski.sda.java.springboot.player.application.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
}
