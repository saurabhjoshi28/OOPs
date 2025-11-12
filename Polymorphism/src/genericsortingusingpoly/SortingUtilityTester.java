package genericsortingusingpoly;

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
        * This is called as anonymous class
        * we see that it is better that creating whole other class here*/
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
