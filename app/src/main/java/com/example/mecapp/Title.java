package com.example.mecapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Title extends Fragment {

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_title, container, false);
        textView = v.findViewById(R.id.Title_view);
        assert this.getArguments() != null;
        textView.setText(this.getArguments().getString("key"));
        return  v ;
    }
}