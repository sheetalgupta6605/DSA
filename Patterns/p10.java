package Patterns;

import java.util.*;

public class p10 {

    public static void upper(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lower(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = (n - 1); j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        upper(n);
        lower(n);
        sc.close();
    }

}
