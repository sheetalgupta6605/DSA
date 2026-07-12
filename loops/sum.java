package loops;
import java.util.Scanner;

public class sum {
    static int fun(int a, int b) {
        int c = a + b;
        // return a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
        int result = fun(a, b);

        System.out.println(result);
        sc.close();

    }
}
