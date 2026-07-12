package Patterns;

import java.util.Scanner;

public class p9fun {

    public static void upperstar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void lowerstar(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (n - i) + 1; k++) {
                System.out.print("*");
            }

            for (int l = (n - 1); l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        upperstar(n);
        lowerstar(n);
        sc.close();
    }
}
