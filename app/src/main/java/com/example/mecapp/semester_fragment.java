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
import android.widget.Button;

public class semester_fragment extends Fragment {


    Handler setDelay;
    Runnable startDelay;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_semester_fragment, container, false);
        setDelay = new Handler();
        btn5 = v.findViewById(R.id.sem5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDelay = new Runnable() {
                    @Override
                    public void run() {
                        Fragment fragment = new subject_fragment();
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.framelayout,fragment);
                        fragmentTransaction.addToBackStack(null).commit();
                    }
                };
                setDelay.postDelayed(startDelay,1000);

            }
        });

        return v;
    }
}