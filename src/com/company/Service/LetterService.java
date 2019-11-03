package com.company.Service;

import com.company.Model.LetterModel;

public class LetterService {


    public static String lettersComparison(LetterModel letterModelAB, LetterModel letterModelBC) {
        if (letterModelAB.compareTo(letterModelBC) > 0) {
            return (letterModelBC.toString() + " can invest " + letterModelAB.toString());
        } else {
            return (letterModelBC.toString() + " can not invest " + letterModelAB.toString());
        }
    }
    public static LetterModel letterCreate(String[] nameSide, double[] ValueSide)
    {
        LetterModel letterModel = new LetterModel(nameSide[0], ValueSide[0], nameSide[1], ValueSide[1]);
        return letterModel;

    }
}
