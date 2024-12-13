package org.example;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music{

    {
        listOfMusic.add("SomeRock1");
        listOfMusic.add("SomeRock2");
        listOfMusic.add("SomeRock3");
    }

    @Override
    public List<String> getSong() {
        return listOfMusic;
    }

}
