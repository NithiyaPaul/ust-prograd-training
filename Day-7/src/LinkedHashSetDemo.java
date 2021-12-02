import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.List;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> studentId=new LinkedHashSet<>();
        studentId.add(101);
        studentId.add(102);
        studentId.add(103);
        studentId.addAll(List.of(104,105));
        System.out.println("Total number of students : " + studentId.size());
        System.out.println("Displaying the ids of students in order: "+ studentId);
        studentId.remove(105);
        System.out.println(" Does any of the student has id 103 : " + studentId.contains(103));
        System.out.println("Updated student List :"+ studentId);
        studentId.clear();
        System.out.println("Cleared student List :"+ studentId);
    }
}
