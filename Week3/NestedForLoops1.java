package Week3;


/**
 * Created by Cristiana Costa on 2019-03-12
 * COMMENTS ABOUT PROGRAM HERE
 * Program to output nested numbers
 */

public class NestedForLoops1 {

    public static void main(String[] args) {

            for (int j = 1; j < 6; j++) {
                int k = 1;
                while (k <= j) {
                    System.out.print(k + "\t");
                    k++;
                }//while
                System.out.println();
            }//for j

    } //main
} //class
