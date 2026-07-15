package Recursion;

import java.util.Scanner;

public class sumOfFirstNNumbers {
    public static void num(int i, int sum) {
        if (i < 1) {
            System.out.print("Sum is: " + sum);
            return;
        }
        num(i - 1, sum + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of First n Numbers using Parameters");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        num(n, 0);
        sc.close();
    }
}
