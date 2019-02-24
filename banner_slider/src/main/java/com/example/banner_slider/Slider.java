package com.example.banner_slider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Slider.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Slider#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Slider extends Fragment {

    public Slider() {
        // Required empty public constructor
    }



    ViewPager pager;
    DeliverySliderAdapter adapter;
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
        pager.setAdapter(adapter);
    }



}
