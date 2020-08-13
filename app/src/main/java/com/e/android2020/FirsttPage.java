package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class FirsttPage extends AppCompatActivity implements View.OnClickListener {

    Button bPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstt_page);


        bPlay = findViewById(R.id.buttonPlay);

        //  Intent i = new Intent(getApplicationContext(),SecondPage.class);
        //startActivity(i);

        // Random r = new Random();
        //int val = r.nextInt(10) + 1;


        //  Bundle b = getIntent().getExtras();
        //String num = b.getString("value");


        //String num1 = getIntent().getStringExtra("value");

    }

    @Override
    public void onClick(View v) {
        bPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random r = new Random();
                int val = r.nextInt(10) + 1;


                Intent i = new Intent(getApplicationContext(),SecondPage.class);
                i.putExtra("value",val);
                startActivity(i);

            }
        });

    }
}
