package loops;
// Given two integers low and high, return the sum of all integers from low to high inclusive.
// Example 1
// Input: low = 1, high = 5
// Output: 15
// Explanation: 1 + 2 + 3 + 4 + 5 = 15




import java.util.*;

public class forloop {
    public static int fun(int low, int high) {
        // Your code goes here

        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = sc.nextInt();

        System.out.println("Enter high: ");
        int high = sc.nextInt();

        int result = fun(low, high);
        System.out.println("Sum = " + result);

        sc.close();
    }
}