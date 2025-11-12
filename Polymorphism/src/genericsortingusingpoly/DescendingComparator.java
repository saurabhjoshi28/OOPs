package genericsortingusingpoly;
/**
 * DescendingComparator
 *
 * This class implements the Comparator interface to sort elements in descending order.
 */
public class DescendingComparator implements Comparator{

    @Override
    public boolean compare(int a, int b){
        return a >= b;
    }
}
