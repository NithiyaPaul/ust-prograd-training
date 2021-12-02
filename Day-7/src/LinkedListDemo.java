import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {
    public static void main(String args[]) {


        LinkedList<String> obj = new LinkedList<String>();

        // the Items to the linked list
        obj.add("UST Global");
        obj.add("Microsoft");
        obj.add("Oracle");
        obj.add("TCS");
        System.out.println("Top IT Companies : " +obj);

        //Adding  Items at specified position
        obj.add(2, "Google");
        obj.add(3, "Amazon");
        System.out.println("Comapny List after editing: " +obj);

        //Adding First and Last Item
        obj.addFirst("FaceBook");
        obj.addLast("Wipro");
        System.out.println("Comapny List after addition: " +obj);

        //Get and set Items in the list
        Object firstpos = obj.get(0);
        System.out.println("First company: " +firstpos);
        obj.set(0, "Meta");
        System.out.println("  updating first Item: " +obj);

        //Remove from a position
        obj.remove(1);
        obj.remove(2);
        System.out.println("Course List after deletion of Item in 2nd and 3rd position " +obj);

        //Remove first and last Item
        obj.removeFirst();
        obj.removeLast();
        System.out.println("Final Content after removing first and last Item: "+obj);


        ListIterator<String> iterator = obj.listIterator();
        System.out.println("Final List:");
        //for (iterator <String> Iterator = l_list.iterator();iterator.hasNext();){
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(iterator.next());


        }
    }
}
