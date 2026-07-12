package KnowBasicMaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class k6 {
    public static List<Integer> div(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Divisor of a number: ");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        List<Integer> result = div(num);

        System.out.println(result);

        sc.close();
    }
}
