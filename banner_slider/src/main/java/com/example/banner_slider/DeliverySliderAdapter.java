package com.example.banner_slider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class DeliverySliderAdapter extends FragmentPagerAdapter {
    int imagelist[];
    int position=0;
    public DeliverySliderAdapter(FragmentManager fm,int[] imageList) {
        super(fm);
        this.imagelist=imageList;
    }

    @Override
    public Fragment getItem(int i) {
        position++;
        if(position==imagelist.length)
            position=0;
        BlankFragment b=new BlankFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("image",imagelist[position]);

        Log.e("adapter","image loaded"+imagelist[position]);
        b.setArguments(bundle);
        return b;
    }

    @Override
    public int getCount() {
        return imagelist.length;
    }

    public void setImageList(int[] imageList)
    {
        this.imagelist=imageList;
    }
}
