package KnowBasicMaths;
//Palindrome Number

import java.util.Scanner;

public class k3 {

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            rev = rem + (rev * 10);
            num = num / 10;
        }
        num = temp;
        if (num == rev)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Palindrome Number-----");
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();
    }

}
