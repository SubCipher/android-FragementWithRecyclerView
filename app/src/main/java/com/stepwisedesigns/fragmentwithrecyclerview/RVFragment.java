package com.stepwisedesigns.fragmentwithrecyclerview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RVFragment extends Fragment {
    String[] strings = {"1", "2", "3", "4", "5", "6", "7", "2", "3", "4", "5", "6", "7"};

    public RVFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new SimpleRVAdapter(strings));
        return recyclerView;
    }

}