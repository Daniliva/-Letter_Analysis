package com.company.Controller;

import com.company.Model.LetterModel;


import static com.company.Controller.EnterOutController.*;
import static com.company.Service.LetterService.*;

public class Controller {


    private static void lettersOperation() {
        String[] nameSide = new String[]{"a", "b", "c", "d"};
        double[] ValueSide = valueLetter(nameSide);
        LetterModel letterModelAB = letterCreate(nameSide, ValueSide);
        nameSide = new String[]{"c", "d"};
        ValueSide = new double[]{ValueSide[2], ValueSide[3]};
        LetterModel letterModelBC = letterCreate(nameSide, ValueSide);
        outputStr(lettersComparison(letterModelAB, letterModelBC));
    }

    private static void whileForLetter() {
        boolean cal = true;
        while (cal) {
            lettersOperation();
            cal = answerAboutContinue();
        }
    }

    public void run() {
        whileForLetter();
    }


}
