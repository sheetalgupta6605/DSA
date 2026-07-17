package Arrays;

import java.util.Scanner;

public class largestinarr {
    public static void large(int n, int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];

            }
        }
        System.out.println("Maximum element in array is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        large(n, arr);
        sc.close();
    }

}

// public class largestinarr {
// public static int large(int n, int arr[]) {
// int max = arr[0];
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {

// max = arr[i];

// }
// }
// return max;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter size: ");
// int n = sc.nextInt();

// int[] arr = new int[n];

// System.out.print("Enter Array elements: ");
// for (int i = 0; i < arr.length; i++) {
// arr[i] = sc.nextInt();
// }

// int maximum = large(n, arr);

// System.out.println("Maximum element in array is: " + maximum);

// sc.close();
// }

// }