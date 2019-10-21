package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static String inputStr() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
    private static Double inputDouble() {
        Scanner in = new Scanner(System.in);
        Double str = in.nextDouble();
        return str;
    }

    private static void outputStr(String str) {
        System.out.println(str);
    }

    private static double Value(String side) {
        outputStr("Input value for letter external " + side + ": ");
        double a = inputDouble();
        return a;
    }

    private static boolean answer() {
        String s2 = "Y";
        outputStr("You will continue?:\n");
        String answer  = inputStr();
        if (Pattern.compile(Pattern.quote("yes"), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;
        } else if (Pattern.compile(Pattern.quote(s2), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;
        } else {
            return false;
        }

    }

    private static void letterWhile() {
        Letter letterAB= new Letter(1, 1);
        Letter letterBC=new Letter("c", 1, "b", 1);
        boolean cal = true;
        while (cal) {
            letterAB.setA(Value("a"));
            letterAB.setB(Value("b"));
            letterBC.setA(Value("c"));
            letterBC.setB(Value("d"));
            if (letterAB.compareTo(letterBC)>0) {
                outputStr(letterBC.toString() + " can invest " + letterAB.toString());
            } else {
                outputStr(letterBC.toString() + " can not invest " + letterAB.toString());
            }
            cal = answer();
        }
    }

    public static void main(String[] args) {
        letterWhile();
    }
}
