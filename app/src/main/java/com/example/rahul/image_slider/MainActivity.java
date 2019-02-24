package com.example.rahul.image_slider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity{

    ViewPager pager;
    DeliverySliderAdapter adapter;
    int []imagelist={R.drawable.one,R.drawable.two,R.drawable.three};
    View slidbuttons[];
    int previousSelection=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* pager=findViewById(R.id.imgslider);
        adapter=new DeliverySliderAdapter(getSupportFragmentManager(),imagelist);
        pager.setAdapter(adapter);
        final LinearLayout sliderbutton=findViewById(R.id.sliderbutton);
        slidbuttons=new View[imagelist.length];
        for(int i=0;i<imagelist.length;i++)
        {
            View view=View.inflate(this,R.layout.circular_button,null);
            slidbuttons[i]=view;
            sliderbutton.addView(view);
        }

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                Log.e("value of ","data "+i);
                View view=slidbuttons[i];
                LinearLayout layout=view.findViewById(R.id.circle);
                layout.setBackgroundResource(R.drawable.solid_circle);

                slidbuttons[previousSelection].findViewById(R.id.circle).setBackgroundResource(R.drawable.circle);
                previousSelection=i;
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });*/
        FragmentManager mngr=getSupportFragmentManager();
        Slider frag=(Slider) mngr.findFragmentById(R.id.testfragment);
        int imageList[]={R.drawable.poster1,R.drawable.poster2,R.drawable.poster3};
        frag.setDrawableImages(imageList);
    }
}
