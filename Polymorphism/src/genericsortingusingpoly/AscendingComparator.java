package genericsortingusingpoly;
/**
 * AscendingComparator
 *
 * This class implements the Comparator interface to sort elements in ascending order.
 */
public class AscendingComparator implements Comparator{

    @Override
    public boolean compare(int a, int b){
        return a <= b;
    }
}
