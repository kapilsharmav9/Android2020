package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Payment extends AppCompatActivity {
    TextView q1, q2, q3, q4, price1, price2, price3, price4, total, tax, totalpay;
    int qt1 = 0, qt2 = 0, qt3 = 0, qt4 = 0, p1, p2, p3, p4;
    double total1 = 0, tax1 = 0, totalpay1 = 0, gst;
    String qts1;
    String qts2;
    String qts3;
    String qts4;
    String ps11;
    String ps2;
    String ps3;
    String ps4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        q1 = findViewById(R.id.qp);
        q2 = findViewById(R.id.qb);
        q3 = findViewById(R.id.qs);
        q4 = findViewById(R.id.qd);
        price1 = findViewById(R.id.Epprice1);
        price2 = findViewById(R.id.Ebprice2);
        price3 = findViewById(R.id.Esprice3);
        price4 = findViewById(R.id.Edprice4);
        total = findViewById(R.id.Etotal);
        tax = findViewById(R.id.Etax);

        totalpay = findViewById(R.id.Etotalpayable);

        qt1 = getIntent().getIntExtra("value1",0);
        qt2 = getIntent().getIntExtra("value2",0);
        qt3 = getIntent().getIntExtra("value3",0);
        qt4 = getIntent().getIntExtra("value4",0);

        p1 = 100 * qt1;
        p2 = 80 * qt2;
        p3 = 50 * qt3;
        p4 = 60 * qt4;
        total1 = p1 + p2 + p3 + p4;
        gst = total1 * 18 / 100;
        tax1 = gst;
        totalpay1 = total1 + tax1;


        q1.setText("" + qt1);
        q2.setText("" + qt2);
        q3.setText("" + qt3);
        q4.setText("" + qt4);

        price1.setText("" + p1);
        price2.setText("" + p2);
        price3.setText("" + p3);
        price4.setText("" + p4);
        total.setText("" + total1);
        tax.setText("" + tax1);
        totalpay.setText("" + totalpay1);


    }
}
