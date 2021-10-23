package com.abc.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {"The letter H is between letters G and J on a keyboard",
    "There are five zeros in one hundred thousand",
    "It takes a sloth two weeks to digest its food",
    "You can sneeze during sleep",
    "Watching horror movies has no reaction to body",
    "Tasting is never determined by what you’re smelling",
    "A snail can sleep for three months",
    "A rhinoceros' horn is made of hair"};


    private boolean[] answers = {true,true,true,false,false,false,false,true};
    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length -1)
                {
                    if(answers[index])
                    {
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is:"+ score, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart this app for play again", Toast.LENGTH_LONG).show();

                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length -1)
                {
                    if(!answers[index])
                    {
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is:"+ score, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart this app for play again", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}