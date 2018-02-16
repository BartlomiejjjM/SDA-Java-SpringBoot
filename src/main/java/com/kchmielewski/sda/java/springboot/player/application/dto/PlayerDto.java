package com.kchmielewski.sda.java.springboot.player.application.dto;

public class PlayerDto {
    private Integer id;
    private String name;
    private String surname;
    private String teamName;

    public PlayerDto() {
    }

    public PlayerDto(Integer id, String name, String surname, String teamName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.teamName = teamName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
