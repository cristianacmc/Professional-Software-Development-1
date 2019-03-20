package Week3;
import java.util.Scanner;

/**
 * Created by Cristiana Costa on 2019-03-20
 * COMMENTS ABOUT PROGRAM HERE
 * Program to output how many numbers were entered and the average of the numbers
 */

public class AddNumbers4 {

    public static int getNumber(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number or -999 to quit: ");
        int n = scan.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int num = getNumber();
        final int TERMINATOR = -999;
        int total = 0;
        int cont = 0;

        while (num != TERMINATOR){
            total += num;
            cont++;
            num = getNumber();
        }
        System.out.println("The total of the numbers is " + total);
        System.out.println("The average of the numbers entered are " + total/cont);

    } //main

} //class
