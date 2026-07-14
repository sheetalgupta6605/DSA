package Recursion;

import java.util.Scanner;

public class printNto1 {
    public static void printN(int n, int i) {

        if (n < i) {
            return;
        }
        System.out.println(n);

        printN(n - 1, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Linearly from N to 1");
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        printN(n, 1);
        sc.close();
    }
}
