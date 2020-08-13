package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CustomDialogActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);


        btn = findViewById(R.id.btnshowdb);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(CustomDialogActivity.this);
                dialog.setContentView(R.layout.custom_dialog_design);
                dialog.setTitle("");

                ImageView imgcross =  dialog.findViewById(R.id.imagecancel11);

                imgcross.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                Button dialogbutton = (Button) dialog.findViewById(R.id.btnset11);
                dialogbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(CustomDialogActivity.this,"you press ok",Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });
    }


}

