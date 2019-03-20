package Mock;

import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * 2019-03-19
 * Program to count the occurrence of the uppercase letters from the second half of the alphabet
 */

public class CountUpperLetters {

    // prompt the user to enter a string
    public static String getASentence() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringEntered = scan.nextLine();
        return stringEntered;
    }

    //count the occurrence of uppercase letters in the String on the second half of the alphabet
    public static int countUppers(String name){
        int count = 0;
        for(int i = 0; i < name.length(); i++){
            if ((name.charAt(i) >= 'N') && (name.charAt(i) <= 'Z')) {
                count++;
            }//i
        }//for

        return count;
    }

    public static void printResults(String sentenceGot, int sentenceUpper){

        System.out.println("You typed in: " + sentenceGot);
        System.out.println("This string has " + sentenceGot.length() + " characters");
        System.out.println("It contains " + sentenceUpper + " uppercase letters from the second half of the alphabet");
    }

    public static void main(String[] args) {

        String stringEntered = getASentence();
        int stringUppers = countUppers(stringEntered);
        printResults(stringEntered, stringUppers);

    } //main

} //class
