package com.example.mecapp;

import android.annotation.SuppressLint;
import android.content.Intent;
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

import java.util.Timer;

public class YearFragment extends Fragment {

    View view;
    Handler setDelay;

    Runnable startDelay;
    ImageButton btn1,btn2,btn3;
    String title="Year";
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_year, container, false);
        setDelay = new Handler();

        btn3 = v.findViewById(R.id.img_btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDelay = new Runnable() {
                    @Override
                    public void run() {
                        //this is method delay the procees of entering into next fragment for a while

                        Bundle bundle = new Bundle();
                        bundle.putString("key","year");
                        Fragment fragment = new semester_fragment();
                        fragment.setArguments(bundle);
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