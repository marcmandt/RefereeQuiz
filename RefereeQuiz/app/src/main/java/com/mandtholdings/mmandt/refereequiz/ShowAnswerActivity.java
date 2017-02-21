package com.mandtholdings.mmandt.refereequiz;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ShowAnswerActivity extends AppCompatActivity {

    boolean isCorrect = false;
    TextView answerText = null;
    TextView isCorrectText = null;
    QuizQuestion currQuestion = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_answer);

        currQuestion = QuizQuestionCollection.getCurrentQuestion();
        answerText = (TextView) findViewById(R.id.answerText);
        isCorrectText = (TextView) findViewById(R.id.isCorrectText);
        showAnswer();
    }

    private void showAnswer(){
        if (isCorrect){
            isCorrectText.setText("Correct!");
            isCorrectText.setTextColor(Color.parseColor("#006400"));
        }else{
            isCorrectText.setText("Incorrect");
            isCorrectText.setTextColor(Color.parseColor("#ff0000"));
        }
        answerText.setText(currQuestion.getAnswerExplanation());
    }

    public void doNext(View view){
        Intent intent = new Intent(this,ShowQuestionActivity.class);
        startActivity(intent);
    }
}
