package KnowBasicMaths;

import java.util.Scanner;

//GCD of Two Numbers
public class k4 {
    public static int gcd(int num1, int num2, int max) {
        for (int i = max; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int maximum(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------GCD of Two Numbers-----");
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        int max = maximum(num1, num2);
        System.out.print(gcd(num1, num2, max));
        sc.close();

    }
}
