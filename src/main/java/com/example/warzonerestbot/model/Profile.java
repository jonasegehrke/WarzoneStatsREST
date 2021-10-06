package com.example.warzonerestbot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Profile {

    @Id
    private Integer activisionId;
    private String name;
    private double kd;
    private int wins;

    public Profile() {
    }

    @Override
    public String toString() {
        return "Profile{" +
                "activisionId=" + activisionId +
                ", name='" + name + '\'' +
                ", kd=" + kd +
                ", wins=" + wins +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(activisionId, profile.activisionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activisionId);
    }

    public Integer getActivisionId() {
        return activisionId;
    }

    public void setActivisionId(Integer activisionId) {
        this.activisionId = activisionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKd() {
        return kd;
    }

    public void setKd(double kd) {
        this.kd = kd;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
