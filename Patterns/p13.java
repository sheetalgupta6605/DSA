package Patterns;

import java.util.*;

public class p13 {
    public static void oneto15(int n, int num) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int num = 1;
        oneto15(n, num);
        sc.close();
    }

}
