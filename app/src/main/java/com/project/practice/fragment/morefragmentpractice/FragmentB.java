package com.project.practice.fragment.morefragmentpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentB extends Fragment {
    TextView text;
    String data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        if(savedInstanceState == null) {

        } else {
            data = savedInstanceState.getString("text");
            TextView text = (TextView) v.findViewById(R.id.textView);
            text.setText(data);
        }

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
         text = (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    public void changeText(String data) {
        this.data = data;
        text.setText(data);
    }
}
