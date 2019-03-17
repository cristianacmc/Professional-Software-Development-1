package Week1.Lab2;

import java.text.DecimalFormat;

import static java.lang.Math.PI;

/**
 * Created by Cristiana Costa on 2019-02-24
 * COMMENTS ABOUT PROGRAM HERE
 * Program to calculate and prints out the diameter, circumference and area of a circle
**/

public class Circle1 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");

        double radius = 4.50;   //initialise and hold the radius value
        double diameter = 2 * radius; //initialise and calculate the diameter value
        double circumference = 2 * PI * radius;
        double area = PI * Math.pow(radius,2);

        System.out.println("The radius is " + radius + " units");
        System.out.println("The diameter is " + diameter + " units");
        System.out.println("The circumference is " + df.format(circumference) + " units");
        System.out.println("The area is " + df.format(area) + " units");

    } //main

} //class
