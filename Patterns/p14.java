package Patterns;

import java.util.*;

public class p14 {
    public static void fun(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        fun(n);
        sc.close();
    }

}
