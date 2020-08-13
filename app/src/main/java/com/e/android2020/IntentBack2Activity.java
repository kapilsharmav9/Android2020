package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentBack2Activity extends AppCompatActivity {
EditText edit;
Button get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_back2);
        edit= findViewById(R.id.getname);
        get=findViewById(R.id.btngetname);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edit.getText().toString();
                Intent i=new Intent();
                i.putExtra("namedata",name);
                setResult(RESULT_OK,i);
                finish();
               // startActivityForResult(getParentActivityIntent(),101);
            }
        });
    }
}
