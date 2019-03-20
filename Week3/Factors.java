package Week3;
import java.util.Scanner;
/**
 * Created by Cristiana Costa on 2019-03-20
 * COMMENTS ABOUT PROGRAM HERE
 * Program to print out the factors of an input value
 */

public class Factors {

    public static int getInput(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scan.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int num = getInput();
        for (int i = 1; i <= num; i ++){
            if (num % i == 0){
                System.out.println(i);
            }//for
        }
    } //main

} //class
