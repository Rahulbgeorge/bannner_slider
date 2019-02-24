package com.example.banner_slider;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("blank frag","fragment triggered");
        View view=inflater.inflate(R.layout.fragment_blank,container,false);
        int image=getArguments().getInt("image");
        Log.e("image added","added image is"+image);
        ImageView iv=view.findViewById(R.id.imageView);
         iv.setImageResource(image);

        //View v=inflater.inflate(R.layout.circular_button,null,false);


        return view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
