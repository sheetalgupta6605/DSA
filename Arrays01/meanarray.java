package Arrays01;

import java.util.Scanner;

public class meanarray {
    public static void meanarr(int n, int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int mean = sum / arr.length;
        System.out.print("Mean is: " + mean);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        meanarr(n, arr);
        sc.close();
    }
}
