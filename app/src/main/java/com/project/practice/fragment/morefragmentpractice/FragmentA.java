package com.project.practice.fragment.morefragmentpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int count = 0;
    int MAX = 10;
    int anticount = 0;
    TextView text;
    Bridge bridge;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bridge = (Bridge) getActivity();
        button = (Button)getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
        text = (TextView) getActivity().findViewById(R.id.textView2);
    }

    @Override
    public void onClick(View view) {
        count++;
        if (count >= MAX + 1) {
            count = 0;
            anticount = MAX;
        }
        anticount= Math.abs(count - MAX);
        text.setText(""+anticount);
        bridge.getText(""+count);

    }
}
