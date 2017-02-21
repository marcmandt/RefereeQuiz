package com.mandtholdings.mmandt.refereequiz;

import java.util.ArrayList;

/**
 * Created by mmandt on 2/17/2017.
 */

public class QuizQuestionCollection {
    private static boolean isInit = false;
    private static ArrayList<QuizQuestion> questions;
    private static int currIndex = -1;
    public static boolean isInitialized(){
        return isInit;
    }

    public static void doInitialization(){
        questions = new ArrayList<QuizQuestion>();

        //this will later be driven by JSON
        QuizQuestion quizQst = new QuizQuestion();
        //#1c
        quizQst.setQuestion("Green #23 drives and the referee calls a foul on White #2. Is this a correct call?");
        quizQst.addAnswer("Yes, correct call.");
        quizQst.addAnswer("No, incorrect call.");
        quizQst.setMediaURL("tnVYMHIRWjg");
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("No. Incorrect Call.");
        questions.add(quizQst);
        //#2
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Which team will be entitled to the next Alternating Possession?");
        quizQst.addAnswer("White");
        quizQst.addAnswer("Green");
        quizQst.setMediaURL("pDMnTnXZDi8");
        quizQst.setCorrectIndex(0);
        quizQst.setAnswerExplanation("White");
        questions.add(quizQst);
        //#3
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Alternating Possession Throw-In for Blue. Does Blue retain the arrow for next throw-in?");
        quizQst.addAnswer("Yes");
        quizQst.addAnswer("No");
        quizQst.setMediaURL("tPd7OClUFQ0");
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("No");
        questions.add(quizQst);
        //#4
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Ball enters basket, hits head of the defender, and comes out. What is the correct ruling?");
        quizQst.addAnswer("Basket interference");
        quizQst.addAnswer("Goaltending");
        quizQst.addAnswer("Unintentional. Therefore Legal. Play On.");
        quizQst.setMediaURL("un5baS36lTk");
        quizQst.setMediaStartSeconds(4);
        quizQst.setCorrectIndex(0);
        quizQst.setAnswerExplanation("Basket interference");
        questions.add(quizQst);
        //#5
        quizQst = new QuizQuestion();
        quizQst.setQuestion("The official called a held ball. Is he correct?");
        quizQst.addAnswer("No. The player traveled first.");
        quizQst.addAnswer("Yes. The player did not travel first. Held ball is correct.");
        quizQst.setMediaURL("txZsPSYzfp4");
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("Yes. The player did not travel first. Held ball is correct.");
        questions.add(quizQst);
        //#6
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Drive from Trail into Lead's primary. Held ball, travel, or foul?");
        quizQst.addAnswer("Held ball");
        quizQst.addAnswer("Travel");
        quizQst.addAnswer("Defensive Foul");
        quizQst.addAnswer("Offensive Foul");
        quizQst.setMediaURL("knhJscdEZXY");
        quizQst.setCorrectIndex(2);
        quizQst.setAnswerExplanation("Offensive Foul");
        questions.add(quizQst);

        //#7
        quizQst = new QuizQuestion();
        quizQst.setQuestion("The Center official calls a travel violation. Is this a correct call?");
        quizQst.addAnswer("No. Should be a held ball");
        quizQst.addAnswer("Yes. Travelling is correct");
        quizQst.addAnswer("No. Should be a defensive foul");
        quizQst.setMediaURL("5s3pXvL9d_A");
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("Yes. Travelling is correct");
        questions.add(quizQst);
        //#8
        quizQst = new QuizQuestion();
        quizQst.setQuestion("This is a clear block or charge?");
        quizQst.addAnswer("Block");
        quizQst.addAnswer("Charge");
        quizQst.setMediaURL("ZA-sFktqBhw");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("Charge");
        questions.add(quizQst);
        //#9
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Backcourt violation or legal play?");
        quizQst.addAnswer("Backcourt violation");
        quizQst.addAnswer("Legal Play");
        quizQst.setMediaURL("HiQ3-f1xeao");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(0);
        quizQst.setAnswerExplanation("Backcourt violation");
        questions.add(quizQst);
        //#10
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Is this footwork legal?");
        quizQst.addAnswer("No. This is traveling");
        quizQst.addAnswer("Yes. Legal play");
        quizQst.setMediaURL("li_jbe2wm1Y");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("Yes. Legal play");
        questions.add(quizQst);
        //#11
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Player passes back to a teammate in the backcourt. Legal play?");
        quizQst.addAnswer("Yes. Legal.");
        quizQst.addAnswer("No. Illegal backcourt violation.");
        quizQst.setMediaURL("gTSJaEexx9o");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(0);
        quizQst.setAnswerExplanation("Yes. Legal.");
        questions.add(quizQst);
        //#12
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Above the rim action. Is this play legal?");
        quizQst.addAnswer("Yes. This is legal.");
        quizQst.addAnswer("No. This is a violation");
        quizQst.setMediaURL("G0BcuJga8Fs");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("No. This is a violation");
        questions.add(quizQst);
        //#13
        quizQst = new QuizQuestion();
        quizQst.setQuestion("What should be the correct call in this free throw scenario?");
        quizQst.addAnswer("Lane violation only. Re-shoot the free throw.");
        quizQst.addAnswer("Goaltending only. Count the 1 point, shoot the next shot.");
        quizQst.addAnswer("Technical foul");
        quizQst.setMediaURL("YSaYhQouxN8");
        quizQst.setMediaStartSeconds(28);
        quizQst.setCorrectIndex(2);
        quizQst.setAnswerExplanation("Technical foul");
        questions.add(quizQst);
        //#14
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Last second shot of the half, is this a shooting foul or not?");
        quizQst.addAnswer("Yes. Shooting foul.");
        quizQst.addAnswer("No. Not a shooting foul.");
        quizQst.setMediaURL("QfC0iCkFlf0");
        quizQst.setMediaStartSeconds(5);
        quizQst.setCorrectIndex(0);
        quizQst.setAnswerExplanation("Yes. Shooting foul.");
        questions.add(quizQst);
        //#15
        quizQst = new QuizQuestion();
        quizQst.setQuestion("The official ruled the screen by Yellow #40 to be legal. Is he correct?");
        quizQst.addAnswer("No. This is an illegal screen.");
        quizQst.addAnswer("Yes. This screen is legal.");
        quizQst.setMediaURL("dgShsCgzKTQ");
        quizQst.setMediaStartSeconds(69);
        quizQst.setCorrectIndex(0);
        quizQst.setAnswerExplanation("No. This is an illegal screen.");
        questions.add(quizQst);
        //#16
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Does the dribbler violate and go backcourt?");
        quizQst.addAnswer("Yes. Both feet and ball were in the frontcourt.");
        quizQst.addAnswer("No. Both feet and the ball were not in the frontcourt.");
        quizQst.setMediaURL("Z3lJi96rHHw");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("No. Both feet and the ball were not in the frontcourt.");
        questions.add(quizQst);
        //#17
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Does team black establish team control? If so, when?");
        quizQst.addAnswer("A");
        quizQst.addAnswer("B");
        quizQst.addAnswer("C");
        quizQst.addAnswer("D");
        quizQst.setMediaURL("YSH3yfvDwmw");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(2);
        quizQst.setAnswerExplanation("C");
        questions.add(quizQst);
        //#18
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Is this a backcourt violation?");
        quizQst.addAnswer("Yes. Violation.");
        quizQst.addAnswer("No. Legal Play");
        quizQst.setMediaURL("f7e5O5lPiCs");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(0);
        quizQst.setAnswerExplanation("Yes. Violation.");
        questions.add(quizQst);
        //#19
        quizQst = new QuizQuestion();
        quizQst.setQuestion("A1 completes a throw-in to A2. Does A2 violate?");
        quizQst.addAnswer("Yes");
        quizQst.addAnswer("No");
        quizQst.setMediaURL("pyjVidF45P0");
        quizQst.setMediaStartSeconds(22);
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("No");
        questions.add(quizQst);
        //#20
        quizQst = new QuizQuestion();
        quizQst.setQuestion("Can you ignore this contact on the shooter because of a great blocked shot?");
        quizQst.addAnswer("Yes. Shot was blocked before contact. Ignore the contact.");
        quizQst.addAnswer("No. This should be a foul. Too much contact to ignore");
        quizQst.setMediaURL("aC0tbzn8IE4?t=12");
        quizQst.setMediaStartSeconds(12);
        quizQst.setCorrectIndex(1);
        quizQst.setAnswerExplanation("No. This should be a foul. Too much contact to ignore");
        questions.add(quizQst);
    }

    static public boolean hasNext(){
        return getCurrentQuestionNumber() < getTotalQuestionCount();
    }

    static public QuizQuestion getNext(){
        currIndex ++;
        return questions.get(currIndex);
    }

    static QuizQuestion getCurrentQuestion(){
        return questions.get(currIndex);
    }
    static public int getCurrentQuestionNumber(){
        return currIndex + 1;
    }

    static public int getTotalQuestionCount(){
        return questions.size();
    }
}
