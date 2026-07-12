package Patterns;

import java.util.Scanner;

public class p20 {

    public static void upper(int n) {
        for (int l = 1; l <= n; l++) {

            for (int j = 1; j <= l; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - l); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= l; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void lower(int n) {
        for (int u = 0; u < n; u++) {

            for (int j = n; j > u; j--) {
                System.out.print("*");
            }

            for (int j = n - (u * 2); j < n; j++) {
                System.out.print(" ");
            }

            for (int j = u; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        upper(n);
        lower(n);
        sc.close();

    }

}
