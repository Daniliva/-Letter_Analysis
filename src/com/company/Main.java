package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
   static Scanner in = new Scanner(System.in);
     private static double Value(String side)
    { System.out.print("Input value for letter external "+side+": ");
     //   Scanner in = new Scanner(System.in);
    double a = in.nextDouble();
   // in.close();

    return  a;
    }
    private static  boolean answer()
    { // Scanner in = new Scanner(System.in);
        String answer="y";
        String s2 = "Y";
         in.nextLine();

        answer = in.nextLine();
      //  in.close();
        if (Pattern.compile(Pattern.quote("yes"), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;


        } else if (Pattern.compile(Pattern.quote(s2), Pattern.CASE_INSENSITIVE).matcher(answer).find()) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {

        Letter letter_ab;
        Letter letter_bc;
        letter_ab = new Letter(1, 1);
        letter_bc = new Letter("c", 1, "b", 1);
      //  Scanner in = new Scanner(System.in);
        boolean cal = true;

        while (cal) {
            letter_ab.setA(Value("a"));
            letter_ab.setB(Value("b"));
            letter_bc.setA(Value("c"));
            letter_bc.setB(Value("d"));
            if (letter_ab.Envelope_Analysis(letter_bc)) {
                System.out.println(letter_bc.toString() + " can invest " + letter_ab.toString());
            } else {
                System.out.println(letter_bc.toString() + " can not invest " + letter_ab.toString());
            }
            System.out.println("You will continue?:\n");
            cal= answer();

        }
in.close();

    }
}
