package com.project.fsociety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.project.fsociety.registrationhelper.GoogleRegistration;

public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button googleRegistrationButton = findViewById(R.id.google_registration);
        googleRegistrationButton.setOnClickListener(v -> {
            // TODO: Find an alternative for startActivity (below).
            startActivity(new Intent(this, GoogleRegistration.class));
        });
    }
}