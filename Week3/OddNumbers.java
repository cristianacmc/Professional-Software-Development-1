package Week3;

/**
 * Created by Cristiana Costa on 2019-03-05
 * Program to print out all of the odd numbers between 1 and 50
 */

public class OddNumbers {

    public static void main(String[] args) {
        int total = 0;
        int cont = 0;
        for (int n = 1; n <= 50; n ++){
            if(n % 2 !=0){
                System.out.println(n);
                total += n;
                cont ++;
            }
        }
        System.out.println("The total of these numbers is: " +total);
        System.out.println("The average of theese numbers is " + total/cont);

    } //main

} //class
