package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        final AppCompatButton startNewQuizBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswers = findViewById(R.id.correctAnswers);
        final TextView inCorrectAnswers = findViewById(R.id.inCorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("Correct",0);
        final int getInCorrectAnswers = getIntent().getIntExtra("Incorrect",0);

        correctAnswers.setText(String.valueOf(getCorrectAnswers));
        inCorrectAnswers.setText(String.valueOf(getInCorrectAnswers));

        startNewQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizResult.this,MainActivity.class));
                finish();
            }
        });
    }

    public void onBackPressed()
    {
        startActivity(new Intent(QuizResult.this,MainActivity.class));
        finish();
    }
}