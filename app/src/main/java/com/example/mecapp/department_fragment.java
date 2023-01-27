package com.example.mecapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class department_fragment extends Fragment {


    ImageButton btn1;
    Handler setDelay;
    Runnable startDelay;
    String str;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_department_fragment, container, false);
        btn1 = v.findViewById(R.id.img_btn1);
        setDelay = new Handler();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDelay = new Runnable() {
                    @Override
                    public void run() {
                        //this is method delay the procees of entering into next fragment for a while
                        Fragment fragment = new YearFragment();
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.framelayout,fragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();

                    }
                };
                setDelay.postDelayed(startDelay,1000);


            }
        });
        return v;
    }
}
