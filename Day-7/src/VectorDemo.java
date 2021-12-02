import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> computerStore =new Vector<>(10);
        computerStore.add("Dell");
        computerStore.add("Hp");
        computerStore.add("MSI");
        computerStore.add("Apple");
        computerStore.addElement("Lenovo");
        System.out.println("Items in Compter Store :" +computerStore);
        System.out.println(computerStore.firstElement());
        System.out.println("Siz of Items : " +computerStore.capacity());
        if(computerStore.contains("Apple"))
        {
            System.out.println("Apple is present at the store " +computerStore.indexOf("Apple"));
        }
        else
        {
            System.out.println("Apple is not present in the Store.");
        }
        System.out.println("The first Item of the vector is = "+computerStore.firstElement());
        //Get the last element
        System.out.println("The last Item of the vector is = "+computerStore.lastElement());
        System.out.println("Element at index 2 is = "+computerStore.get(2));
        System.out.println("\n ================Iterating using iterator()==============");
        for(Iterator<String> it = computerStore.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
    }

