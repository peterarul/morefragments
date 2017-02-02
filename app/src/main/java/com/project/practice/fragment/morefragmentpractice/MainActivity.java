package com.project.practice.fragment.morefragmentpractice;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;


public class MainActivity extends Activity implements Bridge{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getText(String data) {
        FragmentManager manager = getFragmentManager();
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment_two);
        fragmentB.changeText(data);
    }
}
