package com.example.c4q.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(this, QuizActivity.class);
//        Intent intent1 = new Intent(getApplicationContext(), QuizActivity.class);
//        Intent intent2 = new Intent(SplashActivity.this, QuizActivity.class);
        startActivity(intent);
    }
}
