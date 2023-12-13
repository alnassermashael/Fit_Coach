package com.example.FitCoach;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class ChooseWorkoutActivity extends AppCompatActivity {
private FirebaseAuth mAuth;
private TextView signout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_workout);

        mAuth = FirebaseAuth.getInstance();
        signout = findViewById(R.id.signout);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Intent intent = new Intent(ChooseWorkoutActivity.this, WelcomePage.class);
                startActivity(intent);
                finish();
                Toast.makeText(ChooseWorkoutActivity.this, "Sign-out Successful  ", Toast.LENGTH_SHORT).show();

            }
        });


        Button legday = findViewById(R.id.button);
        legday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Nz5PM-W1qdc"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });


        Button UpperBody = findViewById(R.id.button2);
        UpperBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nh4xnduWDSs"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });

        Button ChestBack = findViewById(R.id.button3);
        ChestBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Ooy5jLo5PjA"));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setPackage("com.google.android.youtube");
                    startActivity(intent);

                }
            });

       Button AB = findViewById(R.id.button4);
        AB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Fh0bFwBY-zo"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });
       // Button Dworkout = findViewById(R.id.button5);
        //  Dworkout.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View view) {
        //        Intent intent = new Intent(ChooseWorkoutActivity.this, dailyWorkout.class);
               // startActivity(intent);
         //   }
       // });

        Button button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5BwlDW0CAuU"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });

        Button cardio = findViewById(R.id.button6);
        cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4KGz9uzkpIM"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });


    }
}