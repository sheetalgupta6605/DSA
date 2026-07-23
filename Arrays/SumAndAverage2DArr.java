package Arrays;

import java.util.Scanner;

public class SumAndAverage2DArr {
    public static long sum(int arr[][]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];

            }

        }
        return sum;
    }

    public static double avg(int[][] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        double size = rows * cols;
        return sum(arr) / size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the Sum and Average of 2D Arrays");
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
        long sum = sum(arr);
        double average = avg(arr);
        System.out.println("Your Sum is: " + sum);
        System.out.println("Your average is : " + average);
        sc.close();
    }

}
