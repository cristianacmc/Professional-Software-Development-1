package Week1.Lab1;

import javax.swing.*;

/**
 * Created by Cristiana Costa on 2019-02-20
 * COMMENTS ABOUT PROGRAM HERE
 * Program to outout the countdown program result using use JOptionPane
 */

public class CountdownJOptionPane {
    JFrame f;

    CountdownJOptionPane(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Three");
        JOptionPane.showMessageDialog(f,"Twoo...");
        JOptionPane.showMessageDialog(f,"One...");
        JOptionPane.showMessageDialog(f,"Zero...");
        JOptionPane.showMessageDialog(f,"Liftoff!...");
        JOptionPane.showMessageDialog(f,"\tHouston, we have a problem!");
    }
    public static void main(String[] args) {
        new CountdownJOptionPane();

    }//main

}//class
