package com.mandtholdings.mmandt.refereequiz;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.pierfrancescosoffritti.youtubeplayer.AbstractYouTubeListener;
import com.pierfrancescosoffritti.youtubeplayer.YouTubePlayerView;

public class ShowQuestionActivity extends AppCompatActivity {

    QuizQuestion currentQuestion = null;
    YouTubePlayerView videoView = null;
    TextView questionTitle = null;
    Button videoButton = null;
    RadioGroup answerGroup = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_question);

        videoView = (YouTubePlayerView) findViewById(R.id.questionVideo);
        questionTitle = (TextView) findViewById(R.id.questionTitle);
        videoButton = (Button) findViewById(R.id.videoButton);
        answerGroup = (RadioGroup) findViewById(R.id.answerGroup);

        if (savedInstanceState == null) {
            if (loadNextQuestion()) {
                displayQuestion();
            }
        }else{
            currentQuestion = QuizQuestionCollection.getCurrentQuestion();
            displayQuestion();
        }
        queueVideo();
    }

    private void displayQuestion(){
        int questionNum = QuizQuestionCollection.getCurrentQuestionNumber();
        videoView.setVisibility(View.GONE);
        questionTitle.setVisibility(View.VISIBLE);
        videoButton.setVisibility(View.VISIBLE);
        questionTitle.setText(questionNum + ") " + currentQuestion.getQuestion());
    }

    private void displayAnswerOptions(){
        answerGroup.setVisibility(View.VISIBLE);
        videoButton.setVisibility(View.VISIBLE);
        videoButton.setText(R.string.rewatch_video_button);
        AnswerOption answerOption = null;
        RadioGroup.LayoutParams rprms;

        for(int i = 0; i < currentQuestion.getAnswers().size(); i++){
            answerOption = new AnswerOption(this, currentQuestion.getAnswers().get(i), i == currentQuestion.getCorrectIndex());
            rprms = new RadioGroup.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            answerGroup.addView(answerOption,rprms);
        }

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
        Log.d("Loaded:", "" + loaded);
        return loaded;
    }

    public void queueVideo(){
        videoView.initialize(new AbstractYouTubeListener() {
            @Override
            public void onReady() {
                videoView.loadVideo(currentQuestion.getMediaURL(), 0);
                videoView.pauseVideo();
            }

            @Override
            public void onStateChange(int state) {
                super.onStateChange(state);
                if (state == 0){
                    displayQuestion();
                    displayAnswerOptions();
                }else if (state == 3){
                    if (videoView.getVisibility() == View.VISIBLE){
                        videoView.playVideo();
                    }
                }
                Log.d("STATE:", state + "");
            }
        }, true);
    }

    public void showVideoPressed(View view){
        videoView.setVisibility(View.VISIBLE);
        questionTitle.setVisibility(View.GONE);
        videoButton.setVisibility(View.GONE);
        videoView.playVideo();
    }

    public void showAnswer(boolean isCorrect) {
        currentQuestion.setAnsweredCorrect(isCorrect);
        Intent intent = new Intent(this,ShowAnswerActivity.class);
        startActivity(intent);
    }

    public class AnswerOption extends RadioButton{
        boolean isRightAnswer = false;

        public AnswerOption(Context context, String answer, boolean isCorrect){
            super(context);
            isRightAnswer = isCorrect;
            this.setText(answer);
            this.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    showAnswer(isRightAnswer);
                }
            });
        }
    }
}
