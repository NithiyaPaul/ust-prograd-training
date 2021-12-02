import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> customer =  new ArrayList<>();
        ArrayList<String> customer2 = new ArrayList<>(List.of("Jaya","Jisa","Abi"));
        //Adding Names to ArrayList
        customer.add("Nirmal");
        customer.add("Sonu");
        customer.add("Denny");
        customer.add("Jibin");
        customer.add("Juhi");
        System.out.println("Updated Data : " +customer);
        customer.set(2, "Nikitha");
        customer2.addAll(customer2);
        System.out.println("New updated Data :" +customer);
        System.out.println(customer.contains("Sonu"));
        System.out.println(customer.get(2));
        System.out.println(customer.remove(2));
        System.out.println("New Values after Updation : " +customer);
        System.out.println(customer.indexOf("paul"));
        Collections.sort(customer);
        System.out.println("Sorted values :" +customer);
        System.out.println(customer.size());
        System.out.println("Size : " +customer);
        System.out.println(customer.isEmpty());
        customer.clear();
        System.out.println(customer);

    }
}
