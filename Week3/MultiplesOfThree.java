package Week3;

import java.util.Scanner;

/**
 * Created by Cristiana Costa on 2019-03-20
 * COMMENTS ABOUT PROGRAM HERE
 * Program to check if the number is multiple of three
 */

public class MultiplesOfThree {

    public static int getNumber(){
        Scanner scan = new Scanner(System.in);
        final int TERMINATOR = -999;

        System.out.println("Enter an integer number or " + TERMINATOR + " to quit: ");
        int n = scan.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int num = getNumber();
        int noOfMultiples = 0; //variable to count the number of multiple of three
        int count = 0;

        while (num != -999) {
            if (num % 3 == 0){
                System.out.println(num + " is a multiple of 3");
                noOfMultiples++;
            } else {
                System.out.println(num + " is not a multiple of 3");
            }//if
            count++;
            num = getNumber();
        }//while
        System.out.println(count + " numbers were entered");
        System.out.println(noOfMultiples + " numbers were multiples of 3");
    } //main

} //class
