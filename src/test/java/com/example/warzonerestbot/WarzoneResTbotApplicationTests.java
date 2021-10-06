package com.example.warzonerestbot;

import com.example.warzonerestbot.model.Profile;
import com.example.warzonerestbot.repository.ProfileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WarzoneResTbotApplicationTests {


    @Autowired
    ProfileRepository profileRepository;

    @Test
    void contextLoads() throws Exception{
        Profile profile = new Profile();
        profile.setActivisionId(5366452);
        profile.setName("Gehrke");
        profile.setKd(2.20);
        profile.setWins(24);
        profileRepository.save(profile);
    }

}
