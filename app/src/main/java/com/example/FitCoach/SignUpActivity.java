package com.example.FitCoach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.PublicKey;

public class SignUpActivity extends AppCompatActivity {
private FirebaseAuth mAuth;
private DatabaseReference mDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.imageButton).setOnClickListener(new Back4());

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        EditText username = findViewById(R.id.username);
        EditText email = findViewById(R.id.email);
        Spinner gender = findViewById(R.id.gender);
        EditText password = findViewById(R.id.password);
        Button signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().isEmpty()){
                    username.setError("Enter Username");
                }else if(email.getText().toString().isEmpty()){
                    email.setError("Enter email");
                }else if(!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
                    email.setError("Enter valid email");
                }else if(gender.getSelectedItem().toString().isEmpty()){
                    username.setError("Enter your gender");
                }else if(password.getText().toString().isEmpty()){
                    password.setError("Enter password");
                }else if(password.getText().toString().length() < 8){
                    password.setError("Enter password 8 char");
                }else {

                    mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                            .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {

                                        Toast.makeText(SignUpActivity.this, "User Sign-up Successfully", Toast.LENGTH_SHORT).show();
                                        User user = new User(mAuth.getCurrentUser().getUid(), username.getText().toString(), email.getText().toString(), gender.getSelectedItem().toString());
                                        mDatabase.child("users").child(mAuth.getCurrentUser().getUid()).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if (task.isSuccessful()) {
                                                    Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                                                    startActivity(intent);

                                                } else {
                                                    Toast.makeText(SignUpActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        });

                                    } else {

                                        Toast.makeText(SignUpActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });






    }
    class Back4 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), WelcomePage.class));
            Intent intent = new Intent(SignUpActivity.this, WelcomePage.class);
            startActivity(intent);

        }
    }

}
