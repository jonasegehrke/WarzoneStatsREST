package com.example.warzonerestbot.repository;

import com.example.warzonerestbot.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    List<Profile> findProfileByActivisionId(Integer id);
}
