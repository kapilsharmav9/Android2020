package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
    EditText Epizza, Esand, Eburger, Edrink;
    CheckBox Cpizza, Csand, Cburger, Cdrink;
    Button bprocced;
    String q1, q2, q3, q4;
    int price, qq1 = 0, qq2 = 0, qq3 = 0, qq4 = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Epizza = findViewById(R.id.EditPizza);

        Esand = findViewById(R.id.EditSand);

        Eburger = findViewById(R.id.EditBurger);
        Edrink = findViewById(R.id.EditDrink);
        Cpizza = findViewById(R.id.checkpizza);
        Csand = findViewById(R.id.checkSand);
        Cburger = findViewById(R.id.checkBurger);
        Cdrink = findViewById(R.id.checkDrink);
        bprocced = findViewById(R.id.Bproceed);
//        Epizza.setVisibility(View.INVISIBLE);
//        Esand.setVisibility(View.INVISIBLE);
//        Eburger.setVisibility(View.INVISIBLE);
//        Edrink.setVisibility(View.INVISIBLE);

        Cpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Cpizza.isChecked()) {
                    Epizza.setVisibility(View.VISIBLE);
                } else {
                    Epizza.setVisibility(View.INVISIBLE);


                }

            }
        });

        Csand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Csand.isChecked()) {
                    Esand.setVisibility(View.VISIBLE);
                } else {
                    Esand.setVisibility(View.INVISIBLE);


                }

            }
        });
        Cburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Cburger.isChecked()) {
                    Eburger.setVisibility(View.VISIBLE);
                } else {
                    Eburger.setVisibility(View.INVISIBLE);


                }
            }
        });
        Cdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Cdrink.isChecked()) {
                    Edrink.setVisibility(View.VISIBLE);
                } else {
                    Edrink.setVisibility(View.INVISIBLE);


                }
            }
        });

        bprocced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1 = Epizza.getText().toString();
                qq1 = Integer.parseInt(q1);
                q2 = Esand.getText().toString();
                qq2 = Integer.parseInt(q2);
                q3 = Eburger.getText().toString();
                qq3 = Integer.parseInt(q3);
                q4 = Edrink.getText().toString();
                qq4 = Integer.parseInt(q4);


                Intent i = new Intent(HomeActivity.this,Payment.class);

                i.putExtra("value1",qq1);
                i.putExtra("valu2",qq2);
                i.putExtra("value3",qq3);
                i.putExtra("value4",qq4);
                startActivity(i);





            }
        });
    }


}


