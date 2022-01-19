package com.example.bmimodel;

import static java.lang.Double.parseDouble;
import static java.lang.String.format;

public class BMIModel {
    public static double getBMI(double weight, double height){
        double result = weight/Math.pow(height,2);
        return result;
    }

    public static double toDouble(String s){
        return parseDouble(s);
    }

    public static String formatBMI(double bmi){
        return format("%.2f",bmi);
    }

}
