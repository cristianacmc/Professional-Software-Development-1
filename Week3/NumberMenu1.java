package Week3;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
/**
 * Created by Cristiana Costa on 2019-03-05
 * COMMENTS ABOUT PROGRAM HERE
 * Program to prompt the user to enter a number then display a menu
 */

public class NumberMenu1 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");

        Scanner scan= new Scanner(System.in);
        int choice;

        System.out.print("Number:  ");
        int number = scan.nextInt();
        System.out.println();

        do {
            System.out.println("1. Test if zero");
            System.out.println("2. Find square root");
            System.out.println("3. Test if odd or even");
            System.out.println("4. Enter another number or exit \n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    if (number == 0) {
                        System.out.println("The number is zero \n");
                    } else {
                        System.out.println("The number is not zero \n");
                    }
                    break;

                case 2:
                    System.out.println(df.format(Math.sqrt(number)));
                    System.out.println();
                    break;

                case 3:
                    if (number % 2 == 0) {
                        System.out.println("The number is even \n");
                    } else {
                        System.out.println("The number is odd \n");
                    }
                    break;
                case 4:
                    System.out.println("Enter -1 for exit or enter another number to continue");
                    if (number != -1) {
                        number = scan.nextInt();
                    }
                    break;
            }//switch

        } while (number != -1);
    }//main

} //class


