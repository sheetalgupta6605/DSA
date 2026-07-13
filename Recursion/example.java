package Recursion;

import java.util.Scanner;

public class example {
    public static void f1(int num) {

        // Base Condition
        if (num == 4) {
            return;
        }
        System.out.println(num);
        num++;
        f1(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Recursion Example");

        int num = 1;
        f1(num);
        sc.close();
    }
}
