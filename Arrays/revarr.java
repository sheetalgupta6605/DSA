package Arrays;

import java.util.Scanner;

// public class revarr {

//     public static void rev(int n, int arr[]) {
//         // Create a new array to store the reversed elements
//         int newarr[] = new int[arr.length];

//         // Start from the last index of the original array
//         int j = arr.length - 1;

//         // -------- Loop 1 --------
//         // Copy elements from the original array to the new array in reverse order
//         for (int i = 0; i < arr.length; i++) {
//             newarr[i] = arr[j];
//             j--;
//         }

//         // -------- Loop 2 --------
//         // Print the reversed array
//         System.out.print("Reversed array is: ");
//         for (int i = 0; i < newarr.length; i++) {
//             System.out.print(newarr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.print("Elements of array: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();

//         }
//         rev(n, arr);
//         sc.close();

//     }

// }

//==============================================================================================================================================//

public class revarr {

    public static void rev(int n, int arr[]) {
        int newarr[] = new int[n];
        int last = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[last];
            last--;
        }
        System.out.println("Reversed Array: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        rev(n, arr);
        sc.close();
    }
}