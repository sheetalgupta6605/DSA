package Arrays;

import java.util.Scanner;

public class mergedsortedarrays {

    public static int[] merge(int arr1[], int arr2[], int size1, int size2) {
        int newSize = arr1.length + arr2.length;
        int newArr[] = new int[newSize];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {

                newArr[k] = arr1[i];
                k++;
                i++;

            } else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a program to merge two sorted arrays");

        System.out.print("Enter size for array 1:");
        int size1 = sc.nextInt();
        System.out.print("Enter elements for arrays 1: ");
        int arr1[] = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size for array 2:");
        int size2 = sc.nextInt();
        System.out.print("Enter elements for arrays 1: ");
        int arr2[] = new int[size2];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int mergedArr[] = merge(arr1, arr2, size1, size2);
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.println(mergedArr[i] + " ");

        }

        sc.close();
    }
}
