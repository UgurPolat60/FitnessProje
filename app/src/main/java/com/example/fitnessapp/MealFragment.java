package com.example.fitnessapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MealFragment extends Fragment {

    public MealFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meal, container, false);
        TextView mealText = view.findViewById(R.id.mealText);
        mealText.setText("Sağlıklı Yiyecekler" +
                "\n- Salata: 200 kcal" +
                "\n- Tavuk Göğsü: 165 kcal (100 gr protein: 31 gr)" +
                "\n- Tuzsuz Fıstık: 567 kcal (100 gr protein: 25.8 gr)" +
                "\n- Cici Bebe (bulk için): 436 kcal (100 gr protein: 8 gr)" +
                "\n- Ton Balığı: 132 kcal (100 gr protein: 29 gr)" +
                "\n- Haşlanmış Patates: 87 kcal (Anlık iyi enerji kaynağı)" +
                "\n- Haşlanmış Yumurta: 155 kcal (100 gr protein: 13 gr)" +
                "\n- Yulaf: 389 kcal" +
                "\n- Somon Balığı: 206 kcal (100 gr protein: 20 gr)" +
                "\n- Badem: 579 kcal (100 gr protein: 21.2 gr)" +
                "\n- Ceviz: 654 kcal (100 gr protein: 15.2 gr)" +
                "\n- Fındık: 628 kcal (100 gr protein: 15 gr)");

        return view;
    }
}
