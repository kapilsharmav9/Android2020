package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {
    EditText etxtphonenumber;
    Button btnselectphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        etxtphonenumber = findViewById(R.id.etxtnumber);
        btnselectphone = findViewById(R.id.btnslectnumber);
        final String number="8146264528";
        etxtphonenumber.setText(number);
        btnselectphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));

                if (ActivityCompat.checkSelfPermission(CallActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);

            }
        });

    }

}