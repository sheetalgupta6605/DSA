package Recursion;

import java.util.Scanner;

public class isPalin {
    public static boolean p(int i, String name, int n) {
        if (i >= n / 2) {
            return true;
        }
        if (name.charAt(i) != name.charAt(n - i - 1)) {
            return false;
        }
        return p(i + 1, name, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if a String is Palindrome or not.");
        System.out.print("Take Input of String: ");
        String name = sc.next();
       
        int n = name.length();

        boolean s = p(0, name, n);
        System.out.println("Is_Palindrome: "+s);

        sc.close();
    }

}
