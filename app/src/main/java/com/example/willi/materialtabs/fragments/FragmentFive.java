package com.example.willi.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.willi.materialtabs.R;

/**
 * Created by willi on 1/8/2016.
 */
public class FragmentFive extends Fragment {

    public FragmentFive() {
        Log.i("Fragment Check", "Fragment Two Checked");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_five, container, false);
    }
}
