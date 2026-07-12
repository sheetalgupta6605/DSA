package Patterns;

import java.util.Scanner;

public class p18 {

    public static void fun(int n) {

        for (int i = 1; i <= n; i++) {

            for (char ch = (char) ('A' + (n - i)); ch <= ('A' + (n - 1)); ch++) {
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
