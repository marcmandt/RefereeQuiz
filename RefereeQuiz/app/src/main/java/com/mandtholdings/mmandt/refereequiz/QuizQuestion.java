package com.mandtholdings.mmandt.refereequiz;

import java.util.ArrayList;

/**
 * Created by mmandt on 2/17/2017.
 */

public class QuizQuestion {
    private String question;
    private ArrayList<String> answers = new ArrayList<String>();
    private int correctIndex;
    private String mediaURL;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public void addAnswer(String answer){
        answers.add(answer);
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }

    public String getMediaURL() {
        return mediaURL;
    }

    public void setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
    }
}
