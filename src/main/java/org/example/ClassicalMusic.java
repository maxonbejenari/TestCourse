package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{

    {
        listOfMusic.add("someClassic");
        listOfMusic.add("someClassic2");
        listOfMusic.add("someClassic3");
    }

    @Override
    public List<String> getSong() {
        return listOfMusic;
    }
}
