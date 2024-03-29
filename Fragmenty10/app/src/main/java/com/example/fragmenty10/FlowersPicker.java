package com.example.fragmenty10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FlowersPicker extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    Button flower1, flower2, flower3;

    private String mParam1;
    private String mParam2;

    public FlowersPicker() {}

    public static FlowersPicker newInstance(String param1, String param2) {
        FlowersPicker fragment = new FlowersPicker();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flowers_picker, container, false);

        flower1 = view.findViewById(R.id.flower1);
        flower2 = view.findViewById(R.id.flower2);
        flower3 = view.findViewById(R.id.flower3);


        DataViewModel dataVM = new ViewModelProvider(requireActivity()).get(DataViewModel.class);

        flower1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataVM.setSharedText("flower1.jpg");
            }
        });

        flower2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataVM.setSharedText("flower2.jpg");
            }
        });

        flower3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataVM.setSharedText("flower3.jpg");
            }
        });

        return view;
    }
}