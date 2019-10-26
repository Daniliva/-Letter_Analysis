package com.company.Controller;

import com.company.Model.Letter;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {

    private static String inputStr() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }

    private static double inputDouble() {
        Scanner in = new Scanner(System.in);
        double str = in.nextDouble();
        return str;
    }

    private static void outputStr(String str) {
        System.out.println(str);
    }

    private static double ValueSide(String side) {
        outputStr("Input value for letter external " + side + ": ");
        double a = inputDouble();
        return a;
    }

    private static boolean answerAboutContinue() {
        outputStr("Will you continue?:\n");
        String s2 = "Y";
        String answer = inputStr();
        if (Pattern.compile(Pattern.quote("yes"), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;
        } else if (Pattern.compile(Pattern.quote(s2), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;
        } else {
            return false;
        }

    }

    private static double[] valueLetter(String[] nameSide) {
        double[] ValueSide = new double[4];
        String letterNumber = "first";
        for (int i = 0; i < nameSide.length; i++) {
            if (i > 2) {
                letterNumber = "second";
            }
            ValueSide[i] = ValueSide(letterNumber + nameSide[i]);
        }
        return ValueSide;
    }

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

    private static void WhileForLetter() {
        boolean cal = true;
        while (cal) {
            lettersCreate();
            cal = answerAboutContinue();
        }
    }

    public void run() {
        WhileForLetter();
    }


}
