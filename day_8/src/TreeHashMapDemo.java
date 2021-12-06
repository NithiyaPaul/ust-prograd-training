import java.util.Set;
import java.util.TreeMap;
public class TreeHashMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> animal =new TreeMap<>();
        animal.put("Dog","45");
        animal.put("Cat","95");
        animal.put("Lion","25");
        animal.put("Tiger", "32");
        animal.put("Elephant" , "75");
        System.out.println("==============Welcome Animal Sanctuary====================");
        System.out.println("Animals :" +animal);
        System.out.println("==========HeadMap-TailMap-subMap==============");
        System.out.println(" HeadMap : " +animal.headMap("45"));
        System.out.println("TailMap :" +animal.tailMap("32"));
        System.out.println("SubMap :"  +animal.subMap("45", "75"));
        System.out.println("=============ascending and decending order===========");
        System.out.println("Entries in ascending order : " +animal);
        System.out.println("Entries in decending order: " +animal.descendingKeySet());
        System.out.println("===============Removing Animals============================");
        animal.remove("Dog");
        System.out.println("Entries of TreeMap after removing Animals: " +animal);
        System.out.println("================Replacing Animals========================");
        animal.replace("Monkey","101");
        System.out.println("Updated enrties of Animals: " +animal);

        System.out.println("====================Entry-key-value==================");
        Object entrySet = animal.entrySet();
        System.out.println("Entry set: " +entrySet);
        System.out.println("Key set: " +animal.keySet());
        System.out.println("Value set: " +animal.values());

        Object vGet = animal.get("cat");
        System.out.println("value: " +vGet);


        System.out.println("==================Iterating TreeMap======================================");
        for (String animalKey:animal.keySet()) {
            System.out.println("Animals:"+ animalKey +" and  Fight Number:"+animal.get(animalKey));

        }
        System.out.println("-------------------------------Thank you --------------------------------------------------");
    }
}
