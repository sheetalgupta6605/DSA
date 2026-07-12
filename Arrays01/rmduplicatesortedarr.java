package Arrays01;

import java.util.Scanner;

public class rmduplicatesortedarr {

    public static void rmdsarr(int n, int arr[]) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
                // System.out.println(arr[i]);
            }
        }
        // printing
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < n; i++) {
            // Print without duplicates

            if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        // ========================================================================================
        // // rd stores the index of the last unique element
        // int rd = 0;
        // // Start checking from the second element
        // for (int i = 1; i < arr.length; i++) {
        // // If the current element is different from the last unique element
        // if (arr[rd] != arr[i]) {
        // // Move rd to the next position
        // rd++;

        // // Store the new unique element at rd
        // arr[rd] = arr[i];
        // // Print the unique element

        // }

        // }
        // System.out.print("Array without duplicates: ");
        // for (int i = 0; i <= rd; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // ==================================================================================

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rmdsarr(n, arr);
        sc.close();
    }

}
