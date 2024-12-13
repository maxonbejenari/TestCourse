package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(GenreOfMusic genreOfMusic) {
        Random rand = new Random();

        int randomNum = rand.nextInt(3);

        if (genreOfMusic == GenreOfMusic.ROCK) {
            System.out.println(rockMusic.getSong().get(randomNum));
        } else {
            System.out.println(classicalMusic.getSong().get(randomNum));
        }

    }

}
