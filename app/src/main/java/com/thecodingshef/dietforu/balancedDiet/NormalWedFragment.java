package com.thecodingshef.dietforu.balancedDiet;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thecodingshef.dietforu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NormalWedFragment extends android.support.v4.app.Fragment {


    public NormalWedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_normal_wed, container, false);
    }

}
