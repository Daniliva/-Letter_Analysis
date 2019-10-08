package com.company;

import javafx.util.Pair;

public class Letter {


    private Pair<String, Double> side_a;
    private Pair<String, Double> side_b;

    public Letter(String name_1, double a, String name_2, double b) {
        side_a = new Pair<String, Double>(name_1, a);
        side_b = new Pair<String, Double>(name_2, b);
    }

    public Letter(double a, double b) {
        this("a", a, "b", b);
    }

    @Override
    public String toString() {
        return "side_1=" + side_a.getKey() + " " + side_a.getValue() +
                ", side_2=" + side_b.getKey() + " " + side_b.getValue();
    }

    public boolean Envelope_Analysis(Letter in_convert) {
        if (in_convert.Area() < Area()) {
            if (in_convert.getSide_a_value() < getSide_a_value()) {
                if (in_convert.getSide_b_value() < getSide_b_value()) {
                    return true;
                }
            } else if (in_convert.getSide_a_value() < getSide_b_value())
                if (in_convert.getSide_b_value() < getSide_a_value()) {
                    return true;
                }
        } else {
            return false;
        }
        return false;
    }

    public Double Area() {
        final double v;
        v = side_b.getValue() * side_a.getValue();
        return v;
    }

    public Double getSide_b_value() {
        return side_b.getValue();
    }

    public Double getSide_a_value() {
        return side_a.getValue();
    }

    public String getSide_b_Key() {
        return side_b.getKey();
    }

    public String getSide_a_Key() {
        return side_a.getKey();
    }
    public void setA(double a) {
        side_a= new Pair<String, Double>(side_a.getKey(), a);
    }

    public void setB(double b) {
        side_b= new Pair<String, Double>(side_b.getKey(), b);
    }
}
