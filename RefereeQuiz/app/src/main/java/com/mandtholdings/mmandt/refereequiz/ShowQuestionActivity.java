package com.mandtholdings.mmandt.refereequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShowQuestionActivity extends AppCompatActivity {

    QuizQuestion currentQuestion = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_question);

        if (loadNextQuestion()){
            displayQuestion();
        }
    }

    private void displayQuestion(){

    }

    private boolean loadNextQuestion(){
        boolean loaded = false;

        if (!QuizQuestionCollection.isInitialized()){
            QuizQuestionCollection.doInitialization();
        }

        if (QuizQuestionCollection.hasNext()){
            currentQuestion = QuizQuestionCollection.getNext();
            loaded = true;
        }

        return loaded;
    }
}
