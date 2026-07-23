package Arrays;

import java.util.Scanner;

public class DiagonalSum2DArray {
    public static long sumof2Diagonal(int[][] arr) {
        long leftsum = sumofLeftDiagonal(arr);
        long rigthsum = sumofRightDiagonal(arr);
        long sum = leftsum + rigthsum;
        if (arr.length % 2 != 0) {
            int ind = arr.length / 2;
            sum = sum - arr[ind][ind];
        }
        return sum;
    }

    public static long sumofLeftDiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i][i];
            i++;
        }

        return sum;
    }

    public static long sumofRightDiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int col = arr.length - 1 - i;
            sum = sum + arr[i][col];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to diagonal sum");
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols.: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("Element at row:" + i + " and column:" + j + " is: ");
                arr[i][j] = sc.nextInt();
                j++;
            }
            System.out.println();
            i++;
        }

        long sum = sumof2Diagonal(arr);
        System.out.println("Sum of diagonals: " + sum);

        sc.close();

    }

}