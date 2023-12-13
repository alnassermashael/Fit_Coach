package com.example.FitCoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab);

        findViewById(R.id.imageButton1).setOnClickListener(new Back());

    }
    class Back implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), ChooseWorkoutActivity.class));
            Intent intent = new Intent(AB.this, ChooseWorkoutActivity.class);
            startActivity(intent);

        }
    }
}