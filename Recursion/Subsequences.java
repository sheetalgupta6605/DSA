package Recursion;

import java.util.ArrayList;

public class Subsequences {

    public static void printSubsequences(int index, ArrayList<Integer> ds, int[] arr, int n) {

        // Base Case
        if (index == n) {
            if (ds.size() == 0) {
                System.out.println("[]");
            } else {
                System.out.println(ds);
            }
            return;
        }

        // Take the current element
        ds.add(arr[index]);
        printSubsequences(index + 1, ds, arr, n);

        // Backtrack
        ds.remove(ds.size() - 1);

        // Not Take the current element
        printSubsequences(index + 1, ds, arr, n);
    }

    public static void main(String[] args) {

        int[] arr = { 3, 1, 2 };
        int n = arr.length;

        ArrayList<Integer> ds = new ArrayList<>();

        printSubsequences(0, ds, arr, n);
    }
}