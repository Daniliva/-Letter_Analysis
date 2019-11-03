package com.company.Controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EnterOutController {
    public static String inputStr() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }

    public static double inputDouble() {
        Scanner in = new Scanner(System.in);
        try {
            double str = in.nextDouble();
            return str;
        } catch (InputMismatchException ex) {
            outputStr("Try again");
            return inputDouble();
        }

    }

    public static void outputStr(String str) {
        System.out.println(str);
    }

    public static double valueSide(String side) {
        outputStr("Input value for letter external " + side + ": ");
        double a = inputDouble();
        return a;
    }

    public static boolean answerAboutContinue() {
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

    public static double[] valueLetter(String[] nameSide) {
        double[] ValueSide = new double[4];
        String letterNumber = "first letter";
        for (int i = 0; i < nameSide.length; i++) {
            if (i >= 2) {
                letterNumber = "second letter";
            }
            ValueSide[i] = valueSide(letterNumber + nameSide[i]);
        }
        return ValueSide;
    }
}
