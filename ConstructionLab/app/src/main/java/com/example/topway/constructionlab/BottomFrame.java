package com.example.topway.constructionlab;

/**
 * Created by Muhammad Siddique on 1/19/2018.
 */

public class BottomFrame implements Picture {
    @Override
    public String name() {

        System.out.println("Bottom Frame coloured");
        return "Bottom Frame";
    }

    @Override
    public String color() {
        return "Orange";
    }
}
