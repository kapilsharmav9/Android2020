package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {
Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=getLayoutInflater();
                View layout=inflater.inflate(R.layout.toast1,(ViewGroup)findViewById(R.id.toastlayout));

                Toast t=new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL,0,0);
                t.setView(layout);
                t.show();

            }
        });




    }
}
