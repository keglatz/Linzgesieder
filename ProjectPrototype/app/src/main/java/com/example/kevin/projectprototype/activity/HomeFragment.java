package com.example.kevin.projectprototype.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.kevin.projectprototype.R;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);



        ImageView whiteWine = (ImageView) v.findViewById(R.id.ivWhiteWine);
        whiteWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WhiteWineFlavour.class);
                startActivity(intent);
            }
        });

        ImageView redWine = (ImageView) v.findViewById(R.id.ivRedWine);
        redWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RedWineFlavour.class);
                startActivity(intent);
            }
        });

        ImageView roseWine = (ImageView) v.findViewById(R.id.ivRoseWine);
        roseWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RoseWineFlavour.class);
                startActivity(intent);
            }
        });

        return v;

    }
}
