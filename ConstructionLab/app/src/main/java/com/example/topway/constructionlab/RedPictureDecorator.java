package com.example.topway.constructionlab;

/**
 * Created by Muhammad Siddique on 1/19/2018.
 */

public class RedPictureDecorator extends PictureDecorator {

    public RedPictureDecorator(Picture decoratePicture) {
        super(decoratePicture);
    }

    @Override
    public String color() {
        decoratePicture.color();
        return "Green ";
    }
}
