package com.example.FitCoach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button Signin;
    private FirebaseAuth mAuth;
    //private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        findViewById(R.id.imageButton11).setOnClickListener(new Back1());




        mAuth = FirebaseAuth.getInstance();



        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        Signin = findViewById(R.id.Signin);


        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(SignInActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    Toast.makeText(SignInActivity.this, "User Sign-in Successfully", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(SignInActivity.this, ChooseWorkoutActivity.class);
                                    startActivity(intent);


                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(SignInActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        TextView fp = findViewById(R.id.forgetPassword);
        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, forgetPassword.class);
                startActivity(intent);
            }
        });

    }


class Back implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(), WelcomePage.class));
        Intent intent = new Intent(SignInActivity.this, WelcomePage.class);
        startActivity(intent);

    }
}
    class Back1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), WelcomePage.class));
            Intent intent = new Intent(SignInActivity.this, WelcomePage.class);
            startActivity(intent);

        }
    }
}
