package Week1.Lab2;

import javax.swing.*;

/**
 * Created by Cristiana Costa on 2019-02-26
 * COMMENTS ABOUT PROGRAM HERE
 * Program to convert the time in minutes and output the result in a window
 */

public class DisplayTimeJOptionPane {

    public static void main(String[] args) {
        JFrame f;
        f = new JFrame();
        int seconds = 5000;              //initialise and hold the time in seconds
        int minutes = seconds / 60;      //hold the time in minutes
        int secondsLeft = seconds % 60;  //hold the seconds left of the time

        JOptionPane.showMessageDialog(f,seconds + " seconds is " + minutes + " minutes and " + secondsLeft + " seconds");
    } //main

} //class
