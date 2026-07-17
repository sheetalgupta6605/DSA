package Recursion;

import java.util.Scanner;

public class revAnArrUsingRecusrion2Pointer {

    public static void rev(int i, int arr[], int n) {

        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        rev(i + 1, arr, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.");

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of an Array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rev(0, arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
