package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdPage extends AppCompatActivity {
    Button bplayagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        bplayagain = findViewById(R.id.buttonPlayAgainlose);
        bplayagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdPage.this,FirsttPage.class);
                startActivity(i);
            }
        });
    }
}
