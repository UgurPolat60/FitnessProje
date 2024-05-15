package com.example.fitnessapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PhysicalActivitiesFragment extends Fragment {

    public PhysicalActivitiesFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_physical_activities, container, false);

        TextView physicalActivitiesText = view.findViewById(R.id.physicalActivitiesText);


        String physicalActivities = "Yüzme\n" +
                "Koşu\n" +
                "Yürüyüş\n" +
                "Ip Atlama\n" +
                "Spor";

        physicalActivitiesText.setText(physicalActivities);

        return view;
    }
}
