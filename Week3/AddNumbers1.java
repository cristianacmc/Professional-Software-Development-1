package Week3;

import java.util.Scanner;

/**
 * Created by Cristiana Costa on 2019-03-05
 * Program to read in 3 numbers and print out their total
 */

public class AddNumbers1 {

    public static void main(String[] args) {
        int total = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.print("Enter a number: ");
            total += scan.nextInt();
        }
        System.out.println("The total of the numbers is: " + total);
    } //main

} //class
