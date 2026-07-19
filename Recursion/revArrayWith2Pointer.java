package Recursion;

import java.util.Scanner;

public class revArrayWith2Pointer {

    public static void rev(int l, int arr[], int r) {

        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        rev(l + 1, arr, r - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace (using two pointer).");

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of an Array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        rev(l, arr, r);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
