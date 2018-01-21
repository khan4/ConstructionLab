package com.example.topway.constructionlab;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.topway.constructionlab.fragments.FragmentBottom;
import com.example.topway.constructionlab.fragments.LeftFragment;
import com.example.topway.constructionlab.fragments.RightFragment;
import com.example.topway.constructionlab.fragments.TopFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PictureBuilder.ShowPictures {
   TextView textView;
   List<Picture> arrayList;
   Button fullFrame,halfFrame,decorator,iterator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullFrame=findViewById(R.id.btnFullFrame);
        halfFrame=findViewById(R.id.btnHalfFrame);
        decorator=findViewById(R.id.decorator);
        iterator=findViewById(R.id.btnIterator);
        textView=findViewById(R.id.textView);
        String n="";

        PictureRepository pictureRepository=new PictureRepository();
        for(Iterator iterator = pictureRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            n+="\n"+name;
            textView.setText(n);
        }



        ////decorator
        final Picture shape=new Frames();

        ///PictureRepository


        Picture redTopFrame=new RedPictureDecorator(new TopFrame());
        Picture redBottomFrame=new RedPictureDecorator(new BottomFrame());

        ////Picture Builder
        final PictureBuilder pictureBuilder=new PictureBuilder(this);

        arrayList=new ArrayList<Picture>();


        iterator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // textView.setText();
            }
        });

        fullFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                Gallery fullFrame=pictureBuilder.colorShowFullFrame();
                arrayList=fullFrame.ShowItems();

                textView.setText("\n"+arrayList.get(0).name()+"\n"+arrayList.get(0).color()+"\n"
                        +arrayList.get(1).name()+"\n"+arrayList.get(1).color());
               // for (Picture items:arrayList){
               //     textView.setText(String.valueOf(items.name()+"\n"+items.color()));
              //  }
                arrayList=null;
            }
        });



        halfFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                Gallery halfFrame=pictureBuilder.colorShowHalfFrame();
                arrayList=halfFrame.ShowItems();


                textView.setText("\n"+arrayList.get(0).name()+"\n"+arrayList.get(0).color()+"\n"
                        +arrayList.get(1).name()+"\n"+arrayList.get(1).color());
              //  for (Picture items:arrayList){
             //       textView.setText();
               // }
                arrayList=null;
            }
        });


        decorator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                Picture redTopFrame=new RedPictureDecorator(new TopFrame());
                Picture redBottomFrame=new RedPictureDecorator(new BottomFrame());
                textView.setText("\n"+shape.name()+"\n"+redTopFrame.name()+"\n"+redBottomFrame.name());

               // textView.setText("\n"+redTopFrame.name());

                //textView.setText("\n"+redBottomFrame.name());
            }
        });


    }

    @Override
    public void pictures(int num) {

        FragmentManager fragmentManager=getSupportFragmentManager();

        FragmentBottom fragmentBottom=new FragmentBottom();
        LeftFragment leftFragment=new LeftFragment();

        if (num==1){
           // RightFragment rightFragment=new RightFragment();
            //TopFragment topFragment=new TopFragment();
            fragmentManager.beginTransaction().add(R.id.bottomFrame,fragmentBottom).commit();
            fragmentManager.beginTransaction().add(R.id.leftFrame,leftFragment).commit();


        }
        if (num==2){
            fragmentManager.beginTransaction().add(R.id.rightFrame,fragmentBottom).commit();
            fragmentManager.beginTransaction().add(R.id.topFrame,leftFragment).commit();
        }
    }
}
