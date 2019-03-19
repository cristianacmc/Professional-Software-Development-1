package Mock;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-03-19
 * Program to count the ocurrences of uppercase letters that lie out of a defined range
 */

public class StringOutOfRange {

    //prompt the user to enter a string
    public static String getASentence() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a String: ");
        String stringEntered = scan.nextLine();
        return stringEntered;
    }

    //get string out of the range
    public static int countOutsiders(String getString){
        int count = 0;

       for (int i = 0; i < getString.length(); i++){
           if ((getString.charAt(i) < 'E') || (getString.charAt(i) > 'R')){
               count++;
           }//if
       }//for
        return count;
    }

    public static void printOutcome(String getString, int getLieOut) {

        System.out.println("You tyoped in " + getString);
        System.out.println("It contains " + getString.length());
        System.out.println("The limits were E to R");
        System.out.println("Your string contains " + getLieOut + " characters outside this range");
    }



    public static void main(String[] args) {

        String stringGot = getASentence();
        int lieOut = countOutsiders(stringGot);
        printOutcome(stringGot, lieOut);

    } //main

} //class
