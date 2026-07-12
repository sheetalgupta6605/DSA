package loops;

// Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
// A number ends with digit d if its last digit is d.
// Example 1
// Input: d = 1
// Output: 12300
// Explanation:
// The first 50 positive integers ending with 1 are: 1, 11, 21, 31, ..., 491
// Their sum is 12300.

import java.util.*;

public class whileloop {

    public static int fun(int d) {
        int count = 1;
        int num = 1;
        int sum = 0;
        while (count <= 50) {
            if (num % 10 == d) {
                sum = sum + num;
                count++;
            }
            num++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("d: ");
        int d = sc.nextInt();

        int result = fun(d);

        System.out.println("Sum " + result);
        sc.close();
    }
}
