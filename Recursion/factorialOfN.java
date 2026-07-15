package Recursion;

import java.util.Scanner;

public class factorialOfN {

    public static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fun(n - 1);
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
