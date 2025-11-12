package genericsortingusingpoly;
/**
 * Comparator Interface
 *
 * This interface defines a single method `compare` that is used to compare two integers.
 * Different implementations of this interface will define various comparison strategies.
 *
 * This is an example of **Compile-Time Polymorphism** (Interface-based design)
 * because multiple comparator implementations (Ascending, Descending, etc.)
 * can be used interchangeably at runtime through method overloading or implementation.
 */
public interface Comparator {

    boolean compare(int a, int b);
}
