package com.company.Model;

import javafx.util.Pair;

public class LetterModel implements Comparable<LetterModel> {


    private Pair<String, Double> sideA;
    private Pair<String, Double> sideB;

    public LetterModel(String name_1, double a, String name_2, double b) {
        sideA = new Pair<>(name_1, a);
        sideB = new Pair<>(name_2, b);
    }

    @Override
    public String toString() {
        return "side_1=" + sideA.getKey() + " " + sideA.getValue() +
                ", side_2=" + sideB.getKey() + " " + sideB.getValue();
    }

    private Double Area() {
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

    public Double getDiagonal() {
        return Math.pow(getSideAValue(), 2) + Math.pow(getSideBValue(), 2);
    }

    @Override
    public int compareTo(LetterModel o) {
        int result = this.Area().compareTo(o.Area());
        if (result >= 0)
            return result;
        else {

            if (o.getDiagonal() < getDiagonal()) {
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
