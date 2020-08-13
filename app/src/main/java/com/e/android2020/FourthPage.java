package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthPage extends AppCompatActivity {
    Button bplayAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);
        bplayAgain = findViewById(R.id.buttonPlayAgainwin);
        bplayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthPage.this,FirsttPage.class);
                startActivity(i);
            }
        });
    }
}
