package com.example.ayesha.bikerental;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ayesha on 30-11-2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Data> mDataList;
    Data data;
    public CustomAdapter(Context ctx, ArrayList<Data> mylist){
        mContext=ctx;
        mDataList= mylist;
        data=new Data();
    }
    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        final View view=inflater.inflate(R.layout.customadapterlayout,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imagecustom);
        TextView title=(TextView) view.findViewById(R.id.headingtext);
        TextView details=(TextView)view.findViewById(R.id.detailstext);
        Button button=(Button)view.findViewById(R.id.bookbtn);
        imageView.setImageResource(mDataList.get(position).getImage(position));
        title.setText(mDataList.get(position).getTitle());
        details.setText(mDataList.get(position).getDetails());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,DetailActivity.class);
                mContext.startActivity(intent);
            }
        });

        return view;
    }
}
