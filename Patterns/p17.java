package Patterns;

import java.util.Scanner;

public class p17 {
    public static void fun(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
                System.out.print(ch);
            }

            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        fun(n);

        sc.close();
    }

}
