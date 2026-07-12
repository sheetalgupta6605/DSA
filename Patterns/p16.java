package Patterns;

import java.util.Scanner;

public class p16 {
    public static void fun(int n) {

        for (int i = 1; i <= n; i++) {

            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
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
