package com.example.bmimodel;

import org.junit.Test;

import ca.roumani.i2c.Utility;

public class BMIModelTest {

    @Test
    public void getBMITest()
    {
        double w, h;
        System.out.println("Testing BMI.getBMI");

        w = 90; h = 0.5 + 2.5 * Math.random();
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w, h));
        System.out.println(Utility.repeat(21,'-'));
        w = 90; h = 0.5 + 2.5 * Math.random();
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w, h));
        System.out.println(Utility.repeat(21,'-'));
        w = 90; h = 0.5 + 2.5 * Math.random();
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w, h));
    }

    @Test
    public void toDoubleTest()
    {
        String word;
        System.out.println("Testing BMI.toDouble");

        word = "90.1";
        System.out.println(word);
        System.out.println(BMIModel.toDouble(word));
        System.out.println(Utility.repeat(21,'-'));
        word = "2.78";
        System.out.println(word);
        System.out.println(BMIModel.toDouble(word));
        System.out.println(Utility.repeat(21,'-'));
        word = "436.091";
        System.out.println(word);
        System.out.println(BMIModel.toDouble(word));
    }

    @Test
    public void formatBMI()
    {
        double r;
        System.out.println("Testing BMI.formatBMI");

        r = 0 + 100 * Math.random();
        System.out.println(r);
        System.out.println(BMIModel.formatBMI(r));
        System.out.println(Utility.repeat(21,'-'));
        r = 0 + 100 * Math.random();
        System.out.println(r);
        System.out.println(BMIModel.formatBMI(r));
        System.out.println(Utility.repeat(21,'-'));
        r = 0 + 100 * Math.random();
        System.out.println(r);
        System.out.println(BMIModel.formatBMI(r));

    }

}
