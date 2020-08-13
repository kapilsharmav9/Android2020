package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText outE;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, minusb, plusb, divb, eqalb, clearb, delb, multib, dotb;
    float num1, num2;

    int result;
    boolean plusB, minusB, divB, multiB, equalB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        outE = findViewById(R.id.outputE);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        minusb = findViewById(R.id.minusb);
        plusb = findViewById(R.id.plusb);
        divb = findViewById(R.id.divB);
        eqalb = findViewById(R.id.eqalB);
        clearb = findViewById(R.id.clearB);
        delb = findViewById(R.id.delB);
        multib = findViewById(R.id.multib);
        dotb = findViewById(R.id.dotb);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "0");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText(outE.getText().toString() + "9");
            }
        });
        minusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(outE.getText() + "-");

                outE.setText("");
                minusB = true;
            }
        });
        plusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(outE.getText() + "+");
                plusB = true;
                outE.setText("");

            }
        });
        divb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(outE.getText() + "/");

                outE.setText("");
                divB = true;
            }
        });
        eqalb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Integer.parseInt(outE.getText() + "");
                if (plusB == true) {


                    int result = (int) (num1 + num2);
                    outE.setText(result + "");
                    plusB = false;


                } else if (minusB == true) {


                    int result = (int) (num1 - num2);
                    outE.setText(result + "");
                    minusB = false;


                } else if (multiB == true) {


                    int result = (int) (num1 * num2);
                    outE.setText(result + "");
                    multiB = false;


                } else if (divB == true) {


                    int result = (int) (num1 / num2);
                    outE.setText(result + "");
                    divB = false;


                }


            }
        });
        multib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    num1 = Float.parseFloat(outE.getText() + "*");
                    outE.setText("");
                    multiB = true;
                } catch (NumberFormatException e) {


                    System.out.println(e);
                    e.printStackTrace();
                }

            }
        });

        clearb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outE.setText("");

            }
        });
        delb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1 / 10;
                outE.setText(num1 + "");
                num2 = num2 / 10;
                outE.setText(num1 + "");
//                outE.setText(result + "");


            }
        });

    }
}
