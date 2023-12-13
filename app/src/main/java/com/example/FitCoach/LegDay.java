package com.example.FitCoach;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LegDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_day);

        findViewById(R.id.imageButton).setOnClickListener(new Back());



    }
    class Back implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), ChooseWorkoutActivity.class));
            Intent intent = new Intent(LegDay.this, ChooseWorkoutActivity.class);
            startActivity(intent);

        }
    }
}