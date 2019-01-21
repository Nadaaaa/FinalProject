package com.example.jokesandroidlibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JokeFragment extends Fragment {


    public JokeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke, container, false);

        //String joke = getActivity().getIntent().getStringExtra("joke");
        String joke = getActivity().getIntent().getStringExtra("asyncTaskData");
        TextView textView = view.findViewById(R.id.textView_joke);
        textView.setText(joke);

        return view;
    }

}
