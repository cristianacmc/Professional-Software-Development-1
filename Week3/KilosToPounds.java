package Week3;

import java.text.DecimalFormat;

/**
 * Created by Cristiana Costa on 2019-03-05
 * COMMENTS ABOUT PROGRAM HERE
 * Program to print a table of kilograms from 5 to 100 and their equivalent pounds
 */

public class KilosToPounds {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");
        double pounds;

        System.out.print("Kilograms\t\t");
        System.out.println("Pounds");
        for (int i = 5; i <= 100; i += 5){
            System.out.print(i + "\t\t\t\t");

            System.out.println(df.format(pounds = i * 2.2));
        }

    } //main

} //class
