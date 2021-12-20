import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class NoteKeeperTest {
    private NoteKeeper noteKeeper;
    Map<Integer, List<String>> expectedAnswer;
    @BeforeEach
    public void setup(){
        noteKeeper = new NoteKeeper();
    }
    public void addItemsIntoExpectedTodoList(){
        expectedAnswer = new HashMap<Integer, List<String>>();
        expectedAnswer.put(101, Arrays.asList("Task1", "COMPLETED"));
        expectedAnswer.put(102, Arrays.asList("Task2", "NOT COMPLETED"));
        expectedAnswer.put(103, Arrays.asList("Task3", "COMPLETED"));
    }

    public void addItemsIntoActualTodoList(){
        noteKeeper.addItemsIntoTodoList(101,"Task1","COMPLETED");
        noteKeeper.addItemsIntoTodoList(102,"Task2","NOT COMPLETED");
        noteKeeper.addItemsIntoTodoList(103,"Task3","COMPLETED");
    }

    @Test
    public void addingItemsIntoTodoList(){
        addItemsIntoExpectedTodoList();
        addItemsIntoActualTodoList();
        assertEquals(expectedAnswer,noteKeeper.getToTodoList());
    }

    @Test
    public void removeItemsFromTodoList(){
        addingItemsIntoTodoList();
        expectedAnswer.remove(103);
        addItemsIntoActualTodoList();
        noteKeeper.removeItemsFromTodoList(103);
        assertEquals(expectedAnswer,noteKeeper.getToTodoList());
    }

    @Test
    public void unRemoveItemsFromTodoList(){
        addItemsIntoExpectedTodoList();
        addItemsIntoActualTodoList();
        noteKeeper.removeItemsFromTodoList(103);
        assertEquals(expectedAnswer,noteKeeper.unRemoveItemsFromTodoList());
    }
    @Test
    public void toggleBetweenCompletedAndNotCompleted(){
        addItemsIntoExpectedTodoList();
        expectedAnswer.remove(102);
        expectedAnswer.remove(103);
        noteKeeper.addItemsIntoTodoList(101,"Task1","NOT COMPLETED");
        assertEquals(expectedAnswer,noteKeeper.toggleStatus(101));
    }

//    @Test
//    public void checkIfStatusIsValidOrNot(){
//        assertThrows(IllegalArgumentException.class,() -> {
//            noteKeeper.addItemsIntoTodoList(101,"Task1","IN PROGRESS");});
//    }
}
