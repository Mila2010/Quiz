package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CheatActivity extends QuizActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_quiz);

        Button button = (Button) findViewById(R.id.cheatButton);
        button.setVisibility(View.GONE);

        TextView questionTV = (TextView) findViewById(R.id.question_text_view);
        Intent intent = getIntent();
        String myQuestion= intent.getExtras().getString("CURRENT QUESTION");
        questionTV.setText(myQuestion);
        boolean myAnswer = intent.getExtras().getBoolean("CURRENT ANSWER");
        Toast.makeText(this, "The right answer is: " + myAnswer, Toast.LENGTH_SHORT).show();

        int myCurrentIndax = intent.getExtras().getInt("CURRENT INDEX");

    }


}
