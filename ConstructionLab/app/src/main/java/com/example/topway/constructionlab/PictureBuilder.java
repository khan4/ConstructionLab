package com.example.topway.constructionlab;

import android.content.Context;

/**
 * Created by Muhammad Siddique on 1/19/2018.
 */

public class PictureBuilder {

     ShowPictures callBack;
     int flag;

     public PictureBuilder(ShowPictures callBack){
         this.callBack=callBack;
     }

    public Gallery colorShowFullFrame(){
        Gallery gallery=new Gallery();
        gallery.addPictures(new TopFullFrame());
        gallery.addPictures(new BottomFullFrame());
        callBack.pictures(1);
        return gallery;
    }


   public Gallery colorShowHalfFrame(){
        Gallery gallery=new Gallery();

        gallery.addPictures(new TopHalfFrame());
        gallery.addPictures(new BottomHalfFrame());
        callBack.pictures(2);

        return gallery;
   }

    public interface ShowPictures{
        public void pictures(int num);
    }
}
