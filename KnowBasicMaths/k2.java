package KnowBasicMaths;

import java.util.Scanner;

//Reverse a number
public class k2 {
    public static int number(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rem + (rev * 10);
            num = num / 10;
        }
        System.out.print("Reversed Number is: ");
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Reverse a number----");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result = number(num);
        System.out.print(result);
        sc.close();
    }
}
