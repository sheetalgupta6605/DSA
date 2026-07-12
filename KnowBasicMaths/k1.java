package KnowBasicMaths;

import java.util.Scanner;

//Count all Digits of a Number
public class k1 {
    public static int fun(int digit) {

        int count = 0;
        while (digit > 0) {
            count++;
            int rem = digit % 10;
            digit = digit / 10;
            System.out.println(rem);
        }

        System.out.print("Count is: " + count);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Count all Digits of a Number----");
        System.out.print("Enter the digit: ");
        int digit = sc.nextInt();
        fun(digit);

        sc.close();
    }
}
