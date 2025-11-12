package genericsortingusingpoly;
/**
 * SortingUtility
 *
 * This utility class provides a generic sorting function that can sort
 * integer arrays based on different comparator strategies.
 *
 * Demonstrates **Runtime Polymorphism**:
 * - The method `sort()` calls the `compare()` method on the Comparator reference.
 * - At runtime, the JVM determines which comparator's `compare()` implementation to execute
 *   (AscendingComparator, DescendingComparator, or any custom one).
 *
 * Hence, the decision of which comparison logic to use is made at runtime.
 */
public class SortingUtility {
    public static void sort(int[] arr, Comparator comparator){
        for (int i = 0; i < arr.length; i++){
            int j = i;
            while (j > 0 && !comparator.compare(arr[j - 1], arr[j])){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
