package Week3;

/**
 * Created by Cristiana Costa on 2019-03-05
 * COMMENTS ABOUT PROGRAM HERE
 * Program to print the numbers up to 10 in separate line
 */

public class TestFoorLoop {

    public static void main(String[] args) {
        System.out.println("Nmubers 15 to 25\n");
        for(int i = 15; i <= 25; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Nmubers 10 to 1\n");
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Nmubers 2 to 20\n");
        for(int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Multiples of 3 from 30 to 12\n");
        for(int i = 30; i >= 12; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Multiples of 5 from 35 to 75\n");
        for(int i = 35; i <= 75; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    } //main

} //class
