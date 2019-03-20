package Week3;

/**
 * Created by Cristiana Costa
 * on 2019-03-20
 * Program to print out a table of 'x' in 3 rows and 4 columns
 */

public class NestedForX {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j ++){
                System.out.print("\tX");
            }//for i
            System.out.println();
        }//forj

    } //main

} //class
