package KnowBasicMaths;

//Check for Prime Number

import java.util.Scanner;

public class k7 {

    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check for Prime Number");
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        boolean output = prime(num);
        System.out.println(output);
        sc.close();
    }

}
