package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText nameField;
    String quizerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = (Button) findViewById(R.id.submit_btn);
        nameField = (EditText) findViewById(R.id.name_edit_text);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              quizerName=nameField.getText().toString();

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra(EXTRA_MESSAGE, quizerName);
                startActivity(intent);
            }
        });






    }
}
