package com.kchmielewski.sda.java.springboot.player.application;

import com.kchmielewski.sda.java.springboot.player.application.dto.PlayerDto;
import com.kchmielewski.sda.java.springboot.player.application.entity.PlayerEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {
    private final PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public List<PlayerDto> findAll() {
        return repository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    private PlayerDto toDto(PlayerEntity entity) {
        return new PlayerDto(entity.getId(), entity.getName(), entity.getSurname(), entity.getTeam().getName());
    }
}
