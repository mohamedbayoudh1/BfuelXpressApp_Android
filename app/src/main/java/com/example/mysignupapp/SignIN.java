package com.example.mysignupapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIN extends AppCompatActivity {
    private static final String TAG = "SignIN";
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        // Find the "REGISTER" button
        Button registerButton = findViewById(R.id.signupbtn);

        // Set an OnClickListener for the button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the email and password entered by the user
                String email = ((EditText) findViewById(R.id.email)).getText().toString();
                String password = ((EditText) findViewById(R.id.password)).getText().toString();

                // Call the createAccount() method
                createAccount(email, password);
            }
        });

        Button loginButton = findViewById(R.id.loginButton);

        // Set an OnClickListener for the button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                Intent intent = new Intent(SignIN.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }



    private void createAccount(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Registration success
                            Toast.makeText(SignIN.this, "Registration successful.", Toast.LENGTH_SHORT).show();
                            // Navigate to the login screen
                            Intent intent = new Intent(SignIN.this, LoginActivity.class);
                            intent.putExtra("email", email);
                            intent.putExtra("password", password);
                            startActivity(intent);
                        } else {
                            // Registration failure
                            Toast.makeText(SignIN.this, "Registration failed.", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Registration error
                        Toast.makeText(SignIN.this, "Registration error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        Log.e(TAG, "createUserWithEmailAndPassword:failure", e);

                    }
                });
    }
}
