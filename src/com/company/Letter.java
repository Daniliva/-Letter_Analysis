package com.company;

import javafx.util.Pair;

public class Letter implements Comparable<Letter> {


    private Pair<String, Double> sideA;
    private Pair<String, Double> sideB;

    public Letter(String name_1, double a, String name_2, double b) {
        sideA = new Pair<String, Double>(name_1, a);
        sideB = new Pair<String, Double>(name_2, b);
    }

    public Letter(double a, double b) {
        this("a", a, "b", b);
    }

    @Override
    public String toString() {
        return "side_1=" + sideA.getKey() + " " + sideA.getValue() +
                ", side_2=" + sideB.getKey() + " " + sideB.getValue();
    }

     public Double Area() {
        final double v;
        v = sideB.getValue() * sideA.getValue();
        return v;
    }

    public Double getSideBValue() {
        return sideB.getValue();
    }

    public Double getSideAValue() {
        return sideA.getValue();
    }

    public String getSideBKey() {
        return sideB.getKey();
    }

    public String getSideAKey() {
        return sideA.getKey();
    }

    public void setA(double a) {
        sideA = new Pair<String, Double>(sideA.getKey(), a);
    }

    public void setB(double b) {
        sideB = new Pair<String, Double>(sideB.getKey(), b);
    }

    @Override
    public int compareTo(Letter o) {
        int result = this.Area().compareTo(o.Area());
        if (result >= 0)
            return result;
        else {
            if (o.getSideAValue() < getSideAValue()) {
                if (o.getSideBValue() < getSideBValue()) {
                    return 1;
                }
            } else if (o.getSideAValue() < getSideBValue())
                if (o.getSideBValue() < getSideAValue()) {
                    return 1;
                }
        }
        return 0;
    }
}
