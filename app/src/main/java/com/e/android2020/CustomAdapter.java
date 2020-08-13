package com.e.android2020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomAdapter extends BaseAdapter {

    String[] name;
    Integer[] image;
    Context con;
    LayoutInflater inflater;


    public CustomAdapter(Context con,String[] name,Integer[] image) {
        this.name = name;
        this.image = image;
        this.con = con;
        inflater = LayoutInflater.from(con);
    }

    @Override
    public int getCount() {
        return name.length;
    }


    public View getView(int position,View ConvertView,ViewGroup parent) {
        View v = inflater.inflate(R.layout.custom,null);
        ImageView im1 = v.findViewById(R.id.customimg1);
        TextView tv1 = v.findViewById(R.id.customtext1);
        im1.setImageResource(image[position]);
        tv1.setText(name[position]);
        return v;
    }

    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
