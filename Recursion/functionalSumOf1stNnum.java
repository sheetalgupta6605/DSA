package Recursion;

import java.util.Scanner;

public class functionalSumOf1stNnum {

    public static int fun(int n) {
        if (n == 0) {
            return 0;
        }
        return n + fun(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of first N numbers with functional return");
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum is: " + fun(n));

        sc.close();
    }

}
