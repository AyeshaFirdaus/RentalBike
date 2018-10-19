package com.example.ayesha.bikerental;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ayesha on 30-11-2017.
 */

public class BikeActivity extends AppCompatActivity {
    CustomAdapter mCustomAdapter;
    ListView mListView;
    ArrayList<Data> mDataArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike);
        mListView=(ListView)findViewById(R.id.listview);
        mListView.setAdapter(mCustomAdapter);
        mDataArrayList=Dataadded.mlistBike;
        mCustomAdapter=new CustomAdapter(this,mDataArrayList);
        mListView.setAdapter(mCustomAdapter);

    }
}
