import java.util.*;

class UpperBoundFinder {
    // Linear search method to find upper bound
    public int upperBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                return i; // Return index of first element > x
            }
        }
        return arr.length; // Return length if no such element found
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19}; // Sorted array
        int x = 9;

        UpperBoundFinder finder = new UpperBoundFinder();
        int ind = finder.upperBound(arr, x); // Call function

        System.out.println("The upper bound is the index: " + ind); // Output result
    }
}
