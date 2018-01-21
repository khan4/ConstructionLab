package com.example.topway.constructionlab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Siddique on 1/19/2018.
 */

public class Gallery {

    private List<Picture> arrayList=new ArrayList<Picture>();

    public void addPictures(Picture items){
        arrayList.add(items);
    }


    public List<Picture> ShowItems(){
        return arrayList;
    }
}
