package com.example.FitCoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cardioDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_day);

        findViewById(R.id.imageButton2).setOnClickListener(new Back6());


    }
    class Back6 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), ChooseWorkoutActivity.class));
            Intent intent = new Intent(cardioDay.this, ChooseWorkoutActivity.class);
            startActivity(intent);

        }
    }
}