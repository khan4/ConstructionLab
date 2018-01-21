package com.example.topway.constructionlab;

/**
 * Created by Muhammad Siddique on 1/19/2018.
 */

public class PictureRepository implements Container {
    public String names[] = {"Siddique" , "Salman" ,"Amar" , "Khial"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
