package Recursion;

import java.util.Scanner;

public class printNto1Backtrack {
    public static void reversePrintPsingBacktrack(int i, int n) {
        if (i > n) {
            return;
        }
        reversePrintPsingBacktrack(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print from N to 1 using Backtrack");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        reversePrintPsingBacktrack(1, n);
        sc.close();
    }
}
