package com.kchmielewski.sda.java.springboot.player.web;

import com.kchmielewski.sda.java.springboot.player.application.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {
    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @GetMapping("")
    public String display(Model model) {
        model.addAttribute("players", service.findAll());

        return "players";
    }
}
