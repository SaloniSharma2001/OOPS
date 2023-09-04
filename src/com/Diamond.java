

import java.util.Scanner;

public class Diamond {
    //Recursive approach to print diamond xD
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        // Starting with the upper half
        printPattern(rows, 1);
    }

    public static void printPattern(int rows, int currentRow) {
        //Base case
        if (currentRow > rows) {
            return;
        }

        printSpaces(rows - currentRow, 1);
        printStars(currentRow, 1);
        System.out.println();

        printPattern(rows, currentRow + 1);

        if (currentRow < rows) {
            printSpaces(rows - currentRow, 1);
            printStars(currentRow , 1);
            System.out.println();
        }
    }

    public static void printSpaces(int count, int currentCount) {
        if (currentCount <= count) {
            System.out.print(" ");
            printSpaces(count, currentCount+1);
        }
    }

    public static void printStars(int count, int currentCount) {
        if (currentCount <= count) {
            System.out.print("*");
            printStars(count, currentCount + 1);
        }
    }

}
