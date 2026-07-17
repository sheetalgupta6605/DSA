package Arrays;

import java.util.Scanner;

public class arraysum {
    public static void sums(int n, int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        System.out.print("Sum is: " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sums(n, arr);
        sc.close();
    }
}
