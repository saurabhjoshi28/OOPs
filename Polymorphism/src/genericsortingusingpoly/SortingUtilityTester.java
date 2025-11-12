package genericsortingusingpoly;
/**
 * This class demonstrates the use of polymorphism and generic sorting
 * using different comparator strategies (Ascending, Descending, and Custom).
 * It tests the SortingUtility class by sorting an array with various comparators.
 *
 */
public class SortingUtilityTester {
    public static void main(String[] args){

        int[] arr = new int[]{1, 2, -99, 968, -104, -6, 52, 56, 9};

        SortingUtility.sort(arr, new AscendingComparator());
        for (int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();

        SortingUtility.sort(arr, new DescendingComparator());
        for (int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
        /*
         * --- Sort array based on absolute values ---
         * Here, we use an anonymous inner class that implements the Comparator interface.
         * Instead of creating a separate class, we directly define the comparison logic here.
         * This approach is concise and demonstrates polymorphism with inline comparator definition.
         */
        SortingUtility.sort(arr, new Comparator() {
            @Override
            public boolean compare(int a, int b) {
                return Math.abs(a) > Math.abs(b);
            }
        });
        for (int num : arr){
            System.out.print(num + " ");
        }


    }
}
