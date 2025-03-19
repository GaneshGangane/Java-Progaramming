import java.util.*;
import java.io.*;
import java.lang.Math;

public class J_Problem1 {
    public static int craftworksOrder(int N, int[] A) {
        // Create a sorted copy of A
        int[] sortedA = A.clone();
        Arrays.sort(sortedA);

        // Resultant binary number
        int result = 0;

        // Compare original array with sorted array
        for (int i = 0; i < N; i++) {
            if (A[i] == sortedA[i]) {
                result = result * 10 + 1; // Append 1
            } else {
                result = result * 10 + 0; // Append 0
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        // Output
        System.out.println(craftworksOrder(N, A));
    }
}