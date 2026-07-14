package Recursion;

import java.util.Scanner;

public class printLinearly {
    public static void N(int i, int n) {

        if (i > n) {
            return;
        }
        System.out.println(i);

        N(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Linearly from 1 to N");
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        N(1, n);
        sc.close();
    }
}
