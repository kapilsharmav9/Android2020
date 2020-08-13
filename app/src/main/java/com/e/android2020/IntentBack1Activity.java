package com.e.android2020;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentBack1Activity extends AppCompatActivity {

    TextView txt;
    Button next;
    static  final int request1=101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_back1);
        txt=findViewById(R.id.txt1);
        next=findViewById(R.id.btnNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IntentBack1Activity.this,IntentBack2Activity.class);
                startActivityForResult(i,request1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);



    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,@Nullable Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode==request1 && resultCode==RESULT_OK && data!=null)
        {
            String name=data.getStringExtra("namedata");
            txt.setText("welcome "+name);



        }
    }

}
