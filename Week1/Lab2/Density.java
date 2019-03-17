package Week1.Lab2;

import java.text.DecimalFormat;

/**
 * Created by Cristiana Costa on 2019-02-26
 * COMMENTS ABOUT PROGRAM HERE
 * Program to calculate the density of an object
 */

public class Density {

    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat(".00");
        DecimalFormat df1 = new DecimalFormat(".0");

        double mass = 500;
        double volume = 24.2;
        double density = mass / volume;

        System.out.println("Mass = " + df1.format(mass) + " kg");
        System.out.println("Volume = " + df1.format(volume) + " metres cubed");
        System.out.println("Density = " + df2.format(density) + " kg per metre cubed");

    } //main

} //class
