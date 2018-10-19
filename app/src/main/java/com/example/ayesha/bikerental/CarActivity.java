package com.example.ayesha.bikerental;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ayesha on 30-11-2017.
 */

public class CarActivity extends AppCompatActivity {
    CustomAdapter mCustomAdapter;
    ListView mListView;
    ArrayList<Data> mDataArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        mListView=(ListView)findViewById(R.id.listview1);
        mListView.setAdapter(mCustomAdapter);
        mDataArrayList=Dataadded.mlistCar;
        mCustomAdapter=new CustomAdapter(this,mDataArrayList);
        mListView.setAdapter(mCustomAdapter);
    }
}

