package Recursion;

import java.util.Scanner;

public class print1ToNbacktracking {
    public static void backtrack(int i, int n) {
        if (i < 1) {
            return;
        }
        backtrack(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Linearly from 1 to N using Backtracking");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        backtrack(n, n);
        sc.close();
    }
}
