package com.example.ayesha.bikerental;

import java.util.ArrayList;

/**
 * Created by Ayesha on 30-11-2017.
 */

public class Dataadded {
    public static ArrayList<Data> mlistCar;
    public static ArrayList<Data> mlistBike;
    public static ArrayList<Data> mlistTour;

    static {
        mlistCar=new ArrayList<>();
        mlistBike=new ArrayList<>();
        mlistTour=new ArrayList<>();
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        additem(new Data(1,"Title1","Details1",R.drawable.ic_launcher_background));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));
        addbikeitem(new Data(1,"title","Details",R.drawable.andoidlogo));

        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));
        addtouritem(new Data(1,"title","Details tis are",R.drawable.ic_menu_gallery));

    }
    public static void additem(Data item){
        mlistCar.add(item);
    }
    public static void addbikeitem(Data item){
        mlistBike.add(item);
    }
    public static void addtouritem(Data item){
        mlistTour.add(item);
    }


}