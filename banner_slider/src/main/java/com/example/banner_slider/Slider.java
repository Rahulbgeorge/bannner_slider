package com.example.banner_slider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;



public class Slider extends Fragment {

    public Slider() {
        // Required empty public constructor
    }


    ArrayList<Integer> image;
    ArrayList<ImageView.ScaleType> scale;
    ViewPager pager;
    DeliverySliderAdapter adapter;
    boolean withScale=false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_slider, container, false);
        pager=view.findViewById(R.id.pager);
        return view;
    }

    public void setDrawableImages(int imageList[])
    {
        adapter=new DeliverySliderAdapter(getFragmentManager(),imageList);
    }

    public Slider load()
    {
        if(withScale)
        {adapter=new DeliverySliderAdapter(getFragmentManager(),this.image,this.scale);
        }

        pager.setAdapter(adapter);
        return this;
    }
    public Slider setDrawableImageWithScale(int image, ImageView.ScaleType type)
    {
        withScale=true;
        if(this.image==null)
        {this.image=new ArrayList<Integer>();
        this.scale=new ArrayList<ImageView.ScaleType>();}
        this.image.add(image);
        this.scale.add(type);
        return this;
    }



}
