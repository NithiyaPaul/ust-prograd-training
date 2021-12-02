import java.util.Iterator;
import java.lang.String;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set =new TreeSet<String>();

        // Elements are added
        // using add() method
        set.add("Php");
        set.add("Python");
        set.add("java");
        set.add("Java Script");
        set.add("C++");
        set.add("Sql");

//initial elements of TreeSet
        System.out.println("Initial Computer Languages :  " + set);

        // Removing a specific existing element inserted

        set.remove("Php");

        // Printing the updated TreeSet
        System.out.println("After removing Items " + set);


        // using pollFirst() method - first element
        set.pollFirst();


        System.out.println("After removing first item " + set);

        // Removing the last Item

        set.pollLast();
        System.out.println("After removing last " + set);

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
    }
}
