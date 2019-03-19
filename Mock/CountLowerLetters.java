package Mock;
import java.util.Scanner;

/**
 * Created by Cristiana Costa on 2019-03-19
 * COMMENTS ABOUT PROGRAM HERE
 * Program to prompt the user to enter a string and prints the number of lowercase letters from the first half of the alphabet
 */

public class CountLowerLetters {

    //method to receive an input and return what was entered by the user
    public static String getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String receivedInput = scan.nextLine();
        return receivedInput;
    }

    //method to count how many letters from the alphabet
    public static int countLower(String newName) {

        int countString = 0;
        for (int i=0; i < newName.length(); i++){
            if ((newName.charAt(i) >= 'a') && (newName.charAt(i) <= 'm')) {
                countString ++;
            }//if
        }//for

        return countString;
    }

    //method to print the results
    public static void printResults(String inputGot, int countLower) {

        System.out.println("This string has " + inputGot.length() + " characters");
        System.out.println("It contains " + countLower + " lowercase letters from the first half of the alphabet");

    }

    public static void main(String[] args) {

            String inputReceived = getInput();
            int numLower = countLower(inputReceived);
            printResults(inputReceived, numLower);

    } //main

} //class
