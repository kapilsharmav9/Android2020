package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class ListView extends AppCompatActivity {
    String [] fruits={"apple","orange","mango","grapes",};
    ArrayAdapter<String>adapter;
  android.widget.ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        list=findViewById(R.id.listview);
        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,fruits);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position,long id) {
              String fruit=fruits[position];
                Toast.makeText(ListView.this,fruits+"",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
