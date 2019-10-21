package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
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
     private static double Value(String side)
    { System.out.print("Input value for letter external "+side+": ");
    double a = inputDouble();
    return  a;
    }
    private static  boolean answer()
    {
        String s2 = "Y";
        String  answer = inputStr();
        if (Pattern.compile(Pattern.quote("yes"), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;
        } else if (Pattern.compile(Pattern.quote(s2), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;
        } else {
            return false;
        }

    }
    private static void letterWhile(){
        Letter   letter_ab = new Letter(1, 1);
        Letter  letter_bc = new Letter("c", 1, "b", 1);
        boolean cal = true;
        while (cal) {
            letter_ab.setA(Value("a"));
            letter_ab.setB(Value("b"));
            letter_bc.setA(Value("c"));
            letter_bc.setB(Value("d"));
            if (letter_ab.compareTo(letter_bc)>0) {
                System.out.println(letter_bc.toString() + " can invest " + letter_ab.toString());
            } else {
                System.out.println(letter_bc.toString() + " can not invest " + letter_ab.toString());
            }
            System.out.println("You will continue?:\n");
            cal= answer();
        }
    }
    public static void main(String[] args) {
        letterWhile();
    }
}
