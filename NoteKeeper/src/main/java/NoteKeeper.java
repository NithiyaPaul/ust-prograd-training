import javax.swing.*;
import java.util.*;

public class NoteKeeper {
    Map<Integer, List<String>> map = new HashMap<Integer, List<String>>(); // original list
    Map<Integer, List<String>> temptodoList = new HashMap<Integer, List<String>>(); // storing removed items
    private final String statusCompleted = "COMPLETED";
    private final String statusPending = "NOT COMPLETED";
    private String status;


    public void addItemsIntoTodoList(int key, String item, String status) {
        map.put(key, Arrays.asList(item, status));
    }

    public Map<Integer, List<String>> getToTodoList() {
        return map;
    }

    public void removeItemsFromTodoList(int key) {
        temptodoList.put(key, map.get(key));
        map.remove(key);
    }

    public Map<Integer, List<String>> unRemoveItemsFromTodoList() {
        map.putAll(temptodoList);
        return map;
    }

    public Map<Integer, List<String>> toggleStatus(int key) {
        if (map.get(key).set(1, status) == statusCompleted) {
            status = statusPending;
        } else {
            status = statusCompleted;
        }
        map.get(key).set(1, status);
        return map;
    }
}

//1. As a note keeper I want to add items to my todo list.
//2. As a note keeper I want to remove items from my todo list.
//3. As a note keeper, I want to be able to bring back the removed items. (un remove)
//4. As a note keeper, I want to toggle between completed and not completed.
