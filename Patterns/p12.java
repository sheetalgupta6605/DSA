package Patterns;

import java.util.*;

public class p12 {
    public static void p(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("*");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        p(n);

        sc.close();
    }
}