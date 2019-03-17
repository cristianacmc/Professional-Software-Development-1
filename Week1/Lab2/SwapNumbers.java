package Week1.Lab2;

/**
 * Created by Cristiana Costa on 2019-02-20
 * COMMENTS ABOUT PROGRAM HERE
 * Program to swap two numbers
 */

public class SwapNumbers {

    public static void main(String[] args) {
        int n1 = 25;    //declare the first int variable and store a value
        int n2 = 39;    //declare the second int variable and store a value
        int temp;       //declare a temporary variable

        //print out initial values to the screen
        System.out.println("The value of the variable n1 is: " + n1);
        System.out.println("The value of the variable n2 is: " + n2);
        System.out.println();

        temp = n1;

        //swap the values between n1 and n2
        n1 = n2;
        n2 = temp;

        //print out the new values
        System.out.println("The value of the variable n1 is: " + n1);
        System.out.println("The value of the variable n2 is: " + n2);

    } //main

} //class
