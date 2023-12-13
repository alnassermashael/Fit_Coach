package com.example.FitCoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class dailyWorkout extends AppCompatActivity {

Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_workout);

        findViewById(R.id.imageButton8).setOnClickListener(new Back9());

        
    }

    class Back9 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), ChooseWorkoutActivity.class));
            Intent intent = new Intent(dailyWorkout.this, ChooseWorkoutActivity.class);
            startActivity(intent);

        }
    }

}