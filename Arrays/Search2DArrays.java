package Arrays;

import java.util.Scanner;

public class Search2DArrays {

    public static boolean search(int[][] numArr, int num) {
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                if (numArr[i][j] == num) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2D search array");

        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter no. of cols: ");
        int cols = sc.nextInt();

        int[][] numArr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at row:" + i + ",column:" + j + "-> ");
                numArr[i][j] = sc.nextInt();

            }

        }

        System.out.print("Enter number to be searched: ");
        int num = sc.nextInt();
        boolean isFound = search(numArr, num);

        if (isFound) {
            System.out.println("Your number is found");
        } else {
            System.out.println("Your number isn't found");
        }

        sc.close();
    }
}