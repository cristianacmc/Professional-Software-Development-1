package Week1.Lab2;

import java.text.DecimalFormat;

/**
 * Created by Cristiana Costa on 2019-02-23
 * COMMENTS ABOUT PROGRAM HERE
 * Program to calculate and print out the perimeter and area of a rectangle
 */

public class Rectangle1 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");

        double length;      //variable to hold length
        double breadth;     //variable to hold breadth
        double perimeter;   //variable to hold perimeter
        double area;        //variable to hold area

        length = 34.55;     //assign value to length
        breadth = 23.67;    //assign value to breadth

        area = length * breadth;    //calculate and store the area

        perimeter = (length + breadth) * 2;       //calculate the perimeter

        System.out.println("Rectangle length: " + df.format(length));
        System.out.println("Rectangle breadth: " + df.format(breadth));
        System.out.println("Rectangle area: " + df.format(area));
        System.out.println("Rectangle perimeter = " + df.format(perimeter));       //print out the perimiter


    } //main

} //class
