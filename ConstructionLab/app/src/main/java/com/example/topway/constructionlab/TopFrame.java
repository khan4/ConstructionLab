package com.example.topway.constructionlab;

/**
 * Created by Muhammad Siddique on 1/19/2018.
 */

public class TopFrame implements Picture {
    @Override
    public String name() {
        System.out.println("Top Frame Coloured");
        return "Top Frame";
    }

    @Override
    public String color() {
        return "Red";
    }
}
