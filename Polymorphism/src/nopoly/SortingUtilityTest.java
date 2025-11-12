package nopoly;

public class SortingUtilityTest {
    public static void main(String[] args){
        int[] arr = {1, 3, -7, 9, -22, -45};
        SortingUtility.sort(arr, true);
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
