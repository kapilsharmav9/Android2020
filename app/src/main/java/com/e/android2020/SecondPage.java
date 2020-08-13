package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondPage extends AppCompatActivity {
    EditText Etxt;
    TextView Ecount;
    Button bcheck;
    String mynum;
    boolean Becheck;
    int num, num2;
    int count = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Etxt = findViewById(R.id.EditNUmber);
        Ecount = findViewById(R.id.EditCount);
        bcheck = findViewById(R.id.buttonCheck);
        num = getIntent().getIntExtra("value",0);


        bcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mynum = Etxt.getText().toString();
                num2 = Integer.parseInt(mynum);

                if (num == num2) {


                    Intent i = new Intent(getApplicationContext(),FourthPage.class);

                    startActivity(i);

                } else {
                    Etxt.setText("");
                    count--;
                    Ecount.setText("" + count);

                    if (count == 0) {
                        Intent i = new Intent(getApplicationContext(),ThirdPage.class);

                        startActivity(i);


                    }
                }


            }


        });
    }


}
