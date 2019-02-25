package com.example.banner_slider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

public class DeliverySliderAdapter extends FragmentPagerAdapter {
    int imagelist[];

    ArrayList<Integer> imagelist2;
    ArrayList<ImageView.ScaleType> scale;

    int size;
    boolean withScaleType=false;
    int position=0;
    public DeliverySliderAdapter(FragmentManager fm,int[] imageList) {
        super(fm);
        this.imagelist=imageList;
        this.size=imageList.length;

    }

    public DeliverySliderAdapter(FragmentManager fm, ArrayList<Integer> image, ArrayList<ImageView.ScaleType> scale)
    {
        super(fm);
        withScaleType=true;
        this.imagelist2=image;
        this.scale=scale;
        this.size=imagelist2.size();
    }

    @Override
    public Fragment getItem(int i) {



        BlankFragment b=new BlankFragment();
        if(withScaleType)
            b.setRawImageWithScale(imagelist2.get(i),scale.get(i));
        else
            b.setRawImage(imagelist[i]);
//        Bundle bundle=new Bundle();
//
//        Log.e("adapter","image loaded"+imagelist[position]);
//        b.setArguments(bundle);

        return b;
    }

    @Override
    public int getCount() {
        return size;
    }


}
