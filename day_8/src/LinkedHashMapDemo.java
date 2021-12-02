import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> fruits = new LinkedHashMap<Integer, String>();
        fruits.put(3, "apple");
        fruits.put(5, "orange");
        fruits.put(7, "grapes");
        fruits.put(9, "banana");
        fruits.put(10, "kiwi");
        fruits.put(12, "mango");
        System.out.println("===========Welcome to Natural Fruit Stall===============");
        System.out.println("Modification Before" + fruits);
        System.out.println("Fruits exists: " + fruits.containsKey(3));
        System.out.println("vehicle apple Exists: " + fruits.containsValue("apple"));
        System.out.println("Total number of fruits: " + fruits.size());
        System.out.println("Removing fruit 10: " + fruits.remove(10));
        System.out.println("Removing  fruit 20 (does not exist): " + fruits.remove(20));
        System.out.println("LinkedHashMap After modification" + fruits);
        System.out.println("===============Checking key-value of fruits==========================");
        if(fruits.containsKey(5))
        {
            System.out.println("fruit has Orange as value ");
        }

        if(fruits.containsValue("kiwi"))
        {
            System.out.println("fruit has 10 as key");
        }

        // get entrySet

        System.out.println("==============Iterating over LinkedHashMap's ===========================");
        for (Map.Entry<Integer, String> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
            // Removing all entries from Map

            System.out.println("==============Removing all entries in map==============");
            fruits.clear();
            System.out.println(fruits);


        }
    }
}
