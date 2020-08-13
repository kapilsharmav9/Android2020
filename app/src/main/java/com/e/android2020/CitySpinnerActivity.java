package com.e.android2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class CitySpinnerActivity extends AppCompatActivity {
    String[] country = {"INDIA","PAKISTAN","USA"};
    String[] Indstate = {"PUNJAB","GUJARAT","KERALA","DELHI","MUMBAI"};
    String[] Pakstate = {"Baluchistan","Sindh"};
    String[] Usastate = {"California","New York"};


    String[] Pcities = {"ludiana","khanna","jalandhar","ambala"};
    String[] Gcities = {"Gujarat1","Gujarat2","Gujarat3","Gujarat4"};
    String[] Kcities = {"kerla1","kerla2","kerla3","kerla4"};
    String[] Dcities = {"delhi1","delhi2","delhi3","delhi4"};
    String[] Mcities = {"mumbai1","mumbai2","mumbai3","mumbai4"};
    String[] Bcities = {"bal1","bal2","bal3","bal4"};
    String[] Scities = {"Sind1","Sind2","Sind3","Sind4"};
    String[] Calicities = {"Cal1","Cal2","Cal3","Cal4"};
    String[] Newcities = {"New1","New2","New3","New4"};


    ArrayAdapter<String> adapterCountry, adapterState, adapterCity;
    android.widget.Spinner spinnerC, spinnerS, spinnerCi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PakistanCity p = new PakistanCity();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_spinner);
        spinnerC = findViewById(R.id.SCountry);
        spinnerS = findViewById(R.id.SState);
        spinnerCi = findViewById(R.id.SCity);

        adapterCountry = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,country);
        spinnerC.setAdapter(adapterCountry);


        spinnerC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent,View view,int position,long id) {


                // String countri = country[position];
                if (position == 0) {
                    adapterState = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Indstate);
                    spinnerS.setAdapter(adapterState);
                } else if (position == 1) {
                    adapterState = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Pakstate);
                    spinnerS.setAdapter(adapterState);
                } else if (position == 2) {
                    adapterState = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Usastate);
                    spinnerS.setAdapter(adapterState);
                }
                //  Toast.makeText(CitySpinnerActivity.this,country + "",Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent,View view,int position,long id) {

                String Indstates = Indstate[position];

                if (position == 0) {
                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Pcities);
                    spinnerCi.setAdapter(adapterCity);

                } else if (position == 1) {

                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Gcities);
                    spinnerCi.setAdapter(adapterCity);


                } else if (position == 2) {

                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Kcities);
                    spinnerCi.setAdapter(adapterCity);


                } else if (position == 3) {

                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Dcities);
                    spinnerCi.setAdapter(adapterCity);


                }

                String Pakstates = Pakstate[position];


                if (position == 0) {

                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Bcities);
                    spinnerCi.setAdapter(adapterCity);


                } else if (position == 1) {

                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Scities);
                    spinnerCi.setAdapter(adapterCity);


                }
                String UsaStates = Usastate[position];
                if (position == 0) {

                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Calicities);
                    spinnerCi.setAdapter(adapterCity);


                } else if (position == 1) {

                    adapterCity = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Newcities);
                    spinnerCi.setAdapter(adapterCity);


                }


                // Toast.makeText(CitySpinnerActivity.this,indstate + "",Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
