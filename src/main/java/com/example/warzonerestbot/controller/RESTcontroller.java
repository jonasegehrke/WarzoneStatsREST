package com.example.warzonerestbot.controller;

import com.example.warzonerestbot.model.Profile;
import com.example.warzonerestbot.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class RESTcontroller {

    @Autowired
    ProfileRepository profileRepository;

    @PostMapping(value="/profile", consumes = "application/json")
    public ResponseEntity<Profile> newProfile(@RequestBody Profile profile){
        profileRepository.save(profile);
        return new ResponseEntity<>(profile, HttpStatus.CREATED);
    }

    @GetMapping("/profile/{id}")
    public List<Profile> profileSearch(@PathVariable Integer id){
        return profileRepository.findProfileByActivisionId(id);
    }

    @GetMapping("/profiles")
    public List<Profile> getProfiles(){
        return profileRepository.findAll();
    }

    @PutMapping(value="/profile/update", consumes = "application/json")
    public ResponseEntity<Profile> updateProfile(@RequestBody Profile profile){
        Optional<Profile> data = profileRepository.findById(profile.getActivisionId());
        if(data.isPresent()){
            Profile updatedProfile = data.get();
            updatedProfile.setKd(profile.getKd());
            updatedProfile.setWins(profile.getWins());
            profileRepository.save(updatedProfile);
        }
        return new ResponseEntity<>(profile,HttpStatus.OK);
    }

}
