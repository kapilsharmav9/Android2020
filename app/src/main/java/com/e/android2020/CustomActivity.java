package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.ListView;


public class CustomActivity extends AppCompatActivity {
    ListView listView2;
    String[] name = {"salman","Akshay","katrina","priyanka","kareena","sharadha"};
    Integer[] images = {R.mipmap.girl,
            R.mipmap.girl,
            R.mipmap.girl,
            R.mipmap.girl,
            R.mipmap.girl,
            R.mipmap.girl};


CustomAdapter custom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        listView2= findViewById(R.id.lv1);
        custom = new CustomAdapter(CustomActivity.this,name,images);
        listView2.setAdapter( custom);


    }
}
