package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout android = findViewById(R.id.androidLayout);
        final Button startQuizBtn = findViewById(R.id.startQuizBtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke);
                php.setBackgroundResource(R.drawable.round_background);
                html.setBackgroundResource(R.drawable.round_background);
                android.setBackgroundResource(R.drawable.round_background);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "php";

                php.setBackgroundResource(R.drawable.round_back_white_stroke);
                java.setBackgroundResource(R.drawable.round_background);
                html.setBackgroundResource(R.drawable.round_background);
                android.setBackgroundResource(R.drawable.round_background);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "html";

                html.setBackgroundResource(R.drawable.round_back_white_stroke);
                php.setBackgroundResource(R.drawable.round_background);
                java.setBackgroundResource(R.drawable.round_background);
                android.setBackgroundResource(R.drawable.round_background);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Java";

                android.setBackgroundResource(R.drawable.round_back_white_stroke);
                php.setBackgroundResource(R.drawable.round_background);
                html.setBackgroundResource(R.drawable.round_background);
                java.setBackgroundResource(R.drawable.round_background);
            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Select the Topic", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent  intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }
}