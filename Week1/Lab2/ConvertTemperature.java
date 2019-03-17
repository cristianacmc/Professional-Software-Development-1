package Week1.Lab2;

import java.text.DecimalFormat;

/**
 * Created by Cristiana Costa on 2019-02-25
 * COMMENTS ABOUT PROGRAM HERE
 * Program to convert the temperature from centigrade to fahrenheit
 */

public class ConvertTemperature {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".00");
        double centigrade = 100.00;   //initialise and hold the temperature in centigrade
        double fahrenheit = (9.0 / 5 * centigrade) + 32;

        //outout the temperature convertion
        System.out.println(df.format(centigrade) + " degrees centigrade = " + df.format(fahrenheit) + " Fahrenheit");
    } //main

} //class
