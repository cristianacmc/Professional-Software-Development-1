package Week3;

/**
 * Created by Cristiana Costa
 * on 2019-03-20
 * Program to print out a multiplication table in 3 rows and 4 columns
 */

public class Multiplication {

    public static void main(String[] args) {

        for(int i = 3; i <= 5; i ++){
            for (int j = 1; j <= 4; j++){
                System.out.print("\t" + j*i);
            }
            System.out.println();
        }
    } //main

} //class
