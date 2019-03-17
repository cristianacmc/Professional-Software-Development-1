package Week1.Lab2;

/**
 * Created by Cristiana Costa on 2019-02-20
 * COMMENTS ABOUT PROGRAM HERE
 * Program to
 */

public class Box {

    public static void main(String[] args) {
        // dclare the variables of the box
        int height = 2;
        int width = 3;
        int depth = 4;

        int volume = height * width * depth;
        int perimeter = 4 * height + 4 * width + 4 * depth;

        System.out.println("The box is " + height + "cm high, " + width + "cm wide and " + depth + "cm deep");
        System.out.println("The volume of the box is " + volume + "cms cubed");
        System.out.println("The perimeter of the box is " + perimeter + "cms");
        System.out.println();

        System.out.println("The box is " + (height=3) + "cm high, " + (width=4) + "cm wide and " + (depth=5)  + "cm deep");
        System.out.println("The volume of the box is " + (height * width * depth) + "cms cubed");
        System.out.println("The perimeter of the box is " + (4 * height + 4 * width + 4 * depth) + "cms");
        System.out.println();

        System.out.println("The box is " + (height=4) + "cm high, " + (width=4) + "cm wide and " + (depth=4)  + "cm deep");
        System.out.println("The volume of the box is " + (height * width * depth) + "cms cubed");
        System.out.println("The perimeter of the box is " + (4 * height + 4 * width + 4 * depth) + "cms");
        System.out.println();

        System.out.println("The box is " + (height=20) + "cm high, " + (width=25) + "cm wide and " + (depth=30)  + "cm deep");
        System.out.println("The volume of the box is " + (height * width * depth) + "cms cubed");
        System.out.println("The perimeter of the box is " + (4 * height + 4 * width + 4 * depth) + "cms");
    } //main

} //class
