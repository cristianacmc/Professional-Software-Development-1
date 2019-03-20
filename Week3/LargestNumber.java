package Week3;
import java.util.Scanner;
/**
 * Created by Cristiana Costa
 * on 2019-03-20
 * Program to find the largest number in a list of numbers entered
 */

public class LargestNumber {

    public static int getNumber(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number or -999 to quit: ");
        int n = scan.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int largestNumber = 0;
        int num = getNumber();

        while(num != -999){
            if (largestNumber < num){
                largestNumber = num;
            }//if

            num = getNumber();
        }//while
        System.out.println("the largest number is: " + largestNumber);
    } //main

} //class
