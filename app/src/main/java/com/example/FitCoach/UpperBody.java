package com.example.FitCoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpperBody extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body);

        findViewById(R.id.imageButton7).setOnClickListener(new Back3());


    }
class Back3 implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(), ChooseWorkoutActivity.class));
        Intent intent = new Intent(UpperBody.this, ChooseWorkoutActivity.class);
        startActivity(intent);

    }
}
}