package com.example.quizapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignUpActivity extends AppCompatActivity {
    EditText edEmailAddress,edPassword,edConfirmPassword;
    Button btnSignUp;
    TextView textLogIn;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edEmailAddress = findViewById(R.id.edEmailAddress);
        edPassword = findViewById(R.id.edPassword);
        edConfirmPassword = findViewById(R.id.edConfirmPassword);
        btnSignUp = findViewById(R.id.btnSignUp);
        textLogIn = findViewById(R.id.textLogIn);
        auth = FirebaseAuth.getInstance();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edEmailAddress.getText().toString();
                String password = edPassword.getText().toString();
                String cPassword = edConfirmPassword.getText().toString();

                if(email.isEmpty())
                {
                    edEmailAddress.setError("Email cannot be Empty!");
                }
                if(password.isEmpty())
                {
                    edPassword.setError("Password must be required!");
                }
                if(cPassword.isEmpty())
                {
                    edConfirmPassword.setError("Please re-write the password for confirmation");
                }
                else
                {
                    auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(SignUpActivity.this, "Sign Up Successfully!", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUpActivity.this,MainActivity.class));
                            }
                            else
                            {
                                Toast.makeText(SignUpActivity.this, "Sign Up Failed!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });

        textLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
                finish();
            }
        });
    }

}