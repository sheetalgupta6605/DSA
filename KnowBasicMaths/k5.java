package KnowBasicMaths;

import java.util.Scanner;

public class k5 {
    public static int arm(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;

        }
        return count;
    }

    public static void pow(int num, int count) {
        int sum = 0;
        int original = num;

        while (num > 0) {
            int rem = num % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * rem;
            }

            sum = sum + power;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Armstrong Nmber----------");
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int count = arm(num);
        pow(num, count);
        sc.close();

    }

}
