import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Double> textiles = new HashMap<String, Double>();
        //adding items to shop
        textiles.put("Shirt", 500.00);
        textiles.put("Saree", 1200.50);
        textiles.put("Jeans", 1000.00);
        textiles.put("T-shirt", 250.00);
        System.out.println("\nThe Total items in cart" +textiles);

        //getting value for the given key from hashmap

        System.out.println("\nPrice of Shirt: "+textiles.get("Shirt"));
        System.out.println("\nIs store empty :  "+textiles.isEmpty());

        textiles.remove("Shirt");

        System.out.println("\n"+textiles);
        System.out.println("\nSize of the HashMap: "+textiles.size());
        textiles.putIfAbsent("Tops" , 350.00);

        System.out.println("\n================Searching Textile List of Items keys or Names======================= \n");

        if (textiles.containsKey("shorts")) {

            System.out.println("The shoppingCart contains key shorts");

        } else {

            System.out.println("The shoppingCart does not contains key shorts");

        }

        if (textiles.containsKey("Saree")) {

            System.out.println("The shoppingCart contains key Saree");

        } else {

            System.out.println("The shoppingCart does not contains key Saree");

        }


        for (Map.Entry<String, Double> m:textiles.entrySet()){
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

    }
}
