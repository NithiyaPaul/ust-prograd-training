import java.util.*;
public class HashSetDemo {
    public static void main(String[] args)
    {
        HashSet<String> teacher = new HashSet<String>();

        // Adding elements
        teacher.add("Rohini");
        teacher.add("Joy");
        teacher.add("Jisa");
        teacher.add("Alwin");
        teacher.add("Jisa");// adding duplicate elements

        // Displaying the HashSet
        System.out.println(teacher);
        System.out.println("List contains Jisa or not:" + teacher.contains("Jisa"));

        // Removing items from HashSet
        teacher.remove("Alwin");
        System.out.println("List after removing Elsa:" + teacher);

        // Find the size of a HashSet
        System.out.println("Number of teachers in List " + teacher.size());


        // Iterating over hash set items
        System.out.println("=============Iterating list==========");
        Iterator<String> i = teacher.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        teacher.clear();
        System.out.println("After clear() => " + teacher);
    }
}
