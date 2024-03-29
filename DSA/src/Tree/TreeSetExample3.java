package Tree;

// Java program to demonstrate TreeSet
import java.util.*;

public class TreeSetExample3 {

    public static void main(String[] args)
    {

        // Creating an empty TreeSet
        TreeSet<Integer> s = new TreeSet<Integer>();

        // Elements are added using add() method
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);

        // Prints the largest value lower than 5
        // Here it is 2
        System.out.println(s.lower(5));

        // Prints the smallest higher value than 5
        // Between 10 and 15 smallest is 10
        System.out.println(s.higher(5));

        // Value <= 5
        System.out.println(s.floor(5));

        // Value >= 5
        System.out.println(s.ceiling(5));
    }
}
