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
        //#1
        quizQst.setQuestion("Green #23 drives and the referee calls a foul on White #2. Is this a correct call?");
        quizQst.addAnswer("Yes, correct call.");
        quizQst.addAnswer("No, incorrect call.");
        quizQst.setMediaURL("https://youtu.be/tnVYMHIRWjg");
        quizQst.setCorrectIndex(0);
        //#2
        quizQst.setQuestion("Which team will be entitled to the next Alternating Possession?");
        quizQst.addAnswer("White");
        quizQst.addAnswer("Green");
        quizQst.setMediaURL("https://youtu.be/pDMnTnXZDi8");
        quizQst.setCorrectIndex(0);
        //#3
        quizQst.setQuestion("Alternating Possession Throw-In for Blue. Does Blue retain the arrow for next throw-in?");
        quizQst.addAnswer("Yes");
        quizQst.addAnswer("No");
        quizQst.setMediaURL("https://youtu.be/tPd7OClUFQ0");
        quizQst.setCorrectIndex(0);
        //#4
        quizQst.setQuestion("Ball enters basket, hits head of the defender, and comes out. What is the correct ruling?");
        quizQst.addAnswer("Basket interference");
        quizQst.addAnswer("Goaltending");
        quizQst.addAnswer("Unintentional. Therefore Legal. Play On.");
        quizQst.setMediaURL("https://youtu.be/un5baS36lTk?t=4");
        quizQst.setCorrectIndex(0);
        //#5
        quizQst.setQuestion("The official called a held ball. Is he correct?");
        quizQst.addAnswer("No. The player traveled first.");
        quizQst.addAnswer("Yes. The player did not travel first. Held ball is correct.");
        quizQst.setMediaURL("https://youtu.be/txZsPSYzfp4");
        quizQst.setCorrectIndex(0);
        //#6
        quizQst.setQuestion("Drive from Trail into Lead's primary. Held ball, travel, or foul?");
        quizQst.addAnswer("Held ball");
        quizQst.addAnswer("Travel");
        quizQst.addAnswer("Defensive Foul");
        quizQst.addAnswer("Offensive Foul");
        quizQst.setMediaURL("https://youtu.be/knhJscdEZXY");
        quizQst.setCorrectIndex(0);
        //#7
        quizQst.setQuestion("The Center official calls a travel violation. Is this a correct call?");
        quizQst.addAnswer("No. Should be a held ball");
        quizQst.addAnswer("Yes.  Travelling is correct");
        quizQst.addAnswer("No. Should be a defensive foul");
        quizQst.setMediaURL("https://youtu.be/5s3pXvL9d_A");
        quizQst.setCorrectIndex(0);
        //#8
        quizQst.setQuestion("This is a clear block or charge?");
        quizQst.addAnswer("Block");
        quizQst.addAnswer("Charge");
        quizQst.setMediaURL("https://youtu.be/ZA-sFktqBhw?t=22");
        quizQst.setCorrectIndex(0);
        //#9
        quizQst.setQuestion("Backcourt violation or legal play?");
        quizQst.addAnswer("Backcourt violation");
        quizQst.addAnswer("Legal Play");
        quizQst.setMediaURL("https://youtu.be/HiQ3-f1xeao?t=22");
        quizQst.setCorrectIndex(0);
        //#10
        quizQst.setQuestion("Is this footwork legal?");
        quizQst.addAnswer("No. This is traveling");
        quizQst.addAnswer("Yes. Legal play");
        quizQst.setMediaURL("https://youtu.be/li_jbe2wm1Y?t=22");
        quizQst.setCorrectIndex(0);
        //#11
        quizQst.setQuestion("Player passes back to a teammate in the backcourt. Legal play?");
        quizQst.addAnswer("Yes. Legal.");
        quizQst.addAnswer("No. Illegal backcourt violation.");
        quizQst.setMediaURL("https://youtu.be/gTSJaEexx9o?t=22");
        quizQst.setCorrectIndex(0);
        //#12
        quizQst.setQuestion("Above the rim action. Is this play legal?");
        quizQst.addAnswer("Yes. This is legal.");
        quizQst.addAnswer("No. This is a violation");
        quizQst.setMediaURL("https://youtu.be/G0BcuJga8Fs?t=22");
        quizQst.setCorrectIndex(0);
        //#13
        quizQst.setQuestion("What should be the correct call in this free throw scenario?");
        quizQst.addAnswer("Lane violation only. Re-shoot the free throw.");
        quizQst.addAnswer("Goaltending only. Count the 1 point, shoot the next shot.");
        quizQst.addAnswer("Technical foul");
        quizQst.setMediaURL("https://youtu.be/YSaYhQouxN8?t=28");
        quizQst.setCorrectIndex(0);
        //#14
        quizQst.setQuestion("Last second shot of the half, is this a shooting foul or not?");
        quizQst.addAnswer("Yes. Shooting foul.");
        quizQst.addAnswer("No. Not a shooting foul.");
        quizQst.setMediaURL("https://youtu.be/QfC0iCkFlf0?t=5");
        quizQst.setCorrectIndex(0);
        //#15
        quizQst.setQuestion("The official ruled the screen by Yellow #40 to be legal. Is he correct?");
        quizQst.addAnswer("No. This is an illegal screen.");
        quizQst.addAnswer("Yes. This screen is legal.");
        quizQst.setMediaURL("https://youtu.be/dgShsCgzKTQ?t=69");
        quizQst.setCorrectIndex(0);
        //#16
        quizQst.setQuestion("Does the dribbler violate and go backcourt?");
        quizQst.addAnswer("Yes. Both feet and ball were in the frontcourt.");
        quizQst.addAnswer("No. Both feet and the ball were not in the frontcourt.");
        quizQst.setMediaURL("https://youtu.be/Z3lJi96rHHw?t=22");
        quizQst.setCorrectIndex(0);
        //#17
        quizQst.setQuestion("Does team black establish team control? If so, when?");
        quizQst.addAnswer("A");
        quizQst.addAnswer("B");
        quizQst.addAnswer("C");
        quizQst.addAnswer("D");
        quizQst.setMediaURL("https://youtu.be/YSH3yfvDwmw?t=22");
        quizQst.setCorrectIndex(0);
        //#18
        quizQst.setQuestion("Is this a backcourt violation?");
        quizQst.addAnswer("Yes. Violation.");
        quizQst.addAnswer("No. Legal Play");
        quizQst.setMediaURL("https://youtu.be/f7e5O5lPiCs?t=22");
        quizQst.setCorrectIndex(0);
        //#19
        quizQst.setQuestion("A1 completes a throw-in to A2. Does A2 violate?");
        quizQst.addAnswer("Yes");
        quizQst.addAnswer("No");
        quizQst.setMediaURL("https://youtu.be/pyjVidF45P0?t=22");
        quizQst.setCorrectIndex(0);
        //#20
        quizQst.setQuestion("Can you ignore this contact on the shooter because of a great blocked shot?");
        quizQst.addAnswer("Yes. Shot was blocked before contact. Ignore the contact.");
        quizQst.addAnswer("No. This should be a foul. Too much contact to ignore");
        quizQst.setMediaURL("https://youtu.be/aC0tbzn8IE4?t=12");
        quizQst.setCorrectIndex(0);
    }

    static public boolean hasNext(){
        return currIndex + 1 < questions.size();
    }

    static public QuizQuestion getNext(){
        currIndex ++;
        return questions.get(currIndex);
    }
}
