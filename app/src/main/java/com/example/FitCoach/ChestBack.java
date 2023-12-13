package com.example.FitCoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChestBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_back);

        findViewById(R.id.imageButton3).setOnClickListener(new Back8());
    }
    class Back8 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), ChooseWorkoutActivity.class));
            Intent intent = new Intent(ChestBack.this, ChooseWorkoutActivity.class);
            startActivity(intent);

        }
    }
}