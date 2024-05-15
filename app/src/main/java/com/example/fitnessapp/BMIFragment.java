package com.example.fitnessapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIFragment extends Fragment {

    public BMIFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_m_i, container, false);

        EditText editTextWeight = view.findViewById(R.id.editTextWeight);
        EditText editTextHeight = view.findViewById(R.id.editTextHeight);
        Button buttonCalculate = view.findViewById(R.id.buttonCalculate);
        TextView textViewResult = view.findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = editTextWeight.getText().toString();
                String heightStr = editTextHeight.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    float weight = Float.parseFloat(weightStr);
                    float height = Float.parseFloat(heightStr) / 100;

                    float bmi = weight / (height * height);
                    String bmiCategory;

                    if (bmi < 18.5) {
                        bmiCategory = "NormalAltı";
                    } else if (bmi < 25) {
                        bmiCategory = "Normal Kilo";
                    } else if (bmi < 30) {
                        bmiCategory = "Fazla Kilolu";
                    } else {
                        bmiCategory = "Obez";
                    }

                    textViewResult.setText("BMI ınız " + String.format("%.2f", bmi) + "\nCategory: " + bmiCategory);
                } else {
                    textViewResult.setText("Lütfen Boyunuzu Ve Kilonuzu Giriniz");
                }
            }
        });

        return view;
    }
}
