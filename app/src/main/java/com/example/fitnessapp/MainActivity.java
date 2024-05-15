package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonWorkout = findViewById(R.id.buttonWorkout);
        buttonWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Fit Olma Zamanı", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(intent);
            }
        });

        Button getStartedButton = findViewById(R.id.getStartedButton);
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TipsActivity.class);
                startActivity(intent);
            }
        });

        Button buttonBasicActivities = findViewById(R.id.buttonBasicActivities);
        buttonBasicActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment bmiFragment = new BMIFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, bmiFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
