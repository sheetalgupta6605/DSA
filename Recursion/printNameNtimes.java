package Recursion;

import java.util.Scanner;

public class printNameNtimes {
    public static void N(int i, int n) {

        if (i > n) {
            return;
        }
        System.out.println("Sheetal");

        N(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Name n times using Recursion");
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        N(1, n);
        sc.close();
    }
}
