package Week1.Lab2;

/**
 * Created by Cristiana Costa on 2019-02-26
 * COMMENTS ABOUT PROGRAM HERE
 * Program to calculate the time in minutes and seconds
 */

public class DisplayTime {

    public static void main(String[] args) {
        int seconds = 5000;              //initialise and hold the time in seconds
        int minutes = seconds / 60;      //hold the time in minutes
        int secondsLeft = seconds % 60;  //hold the seconds left of the time

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + secondsLeft + " seconds");

    } //main

} //class
