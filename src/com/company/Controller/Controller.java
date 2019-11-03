package com.company.Controller;

import com.company.Model.Letter;


import static com.company.Controller.EnterOutController.*;

public class Controller {


    private static void lettersCreate() {
        String[] nameSide = new String[]{"a", "b", "c", "d"};
        double[] ValueSide = valueLetter(nameSide);
        Letter letterAB = new Letter(nameSide[0], ValueSide[0], nameSide[1], ValueSide[1]);
        Letter letterBC = new Letter(nameSide[2], ValueSide[2], nameSide[3], ValueSide[3]);
        if (letterAB.compareTo(letterBC) > 0) {
            outputStr(letterBC.toString() + " can invest " + letterAB.toString());
        } else {
            outputStr(letterBC.toString() + " can not invest " + letterAB.toString());
        }
    }

    private static void whileForLetter() {
        boolean cal = true;
        while (cal) {
            lettersCreate();
            cal = answerAboutContinue();
        }
    }

    public void run() {
        whileForLetter();
    }


}
