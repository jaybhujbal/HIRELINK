package com.example.signupapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize fields
        TextInputEditText mobileNumberField = findViewById(R.id.mobile_number);
        TextInputEditText emailField = findViewById(R.id.email);
        TextInputEditText passwordField = findViewById(R.id.password);
        Button proceedButton = findViewById(R.id.proceed_button);

        // Handle button click
        proceedButton.setOnClickListener(v -> {
            String mobileNumber = mobileNumberField.getText().toString();
            String email = emailField.getText().toString();
            String password = passwordField.getText().toString();

            if (mobileNumber.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Sign-Up Successful!", Toast.LENGTH_SHORT).show();
                // Add logic for proceeding to the next screen
            }
        });
    }
}
