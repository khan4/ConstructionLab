package com.example.topway.constructionlab;

/**
 * Created by Muhammad Siddique on 1/19/2018.
 */

public abstract class PictureDecorator implements Picture {

    protected Picture decoratePicture;

    public PictureDecorator(Picture decoratePicture){
        this.decoratePicture=decoratePicture;
    }


    @Override
    public String name() {
        return "Picture Decorator";
    }

    @Override
    public String color() {
        decoratePicture.color();
        return "Orange ";
    }
}
