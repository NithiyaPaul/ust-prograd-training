import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> taskPriorityQueue = new PriorityQueue<>();

        System.out.println("-------------Task Management System--------------");
        int input,input1;
        int i =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println(" 1.Add Task\n 2.TaskList Details\n 3.Remove Task\n 4 Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter Number of tasks");
                    input1 = sc.nextInt();
                    System.out.println("Add tasks based on priority ");
                    for(int j = 1; j <= input1; j++){
                        String str= sc.next();
                        taskPriorityQueue.add(str);
                    }
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    //using Iterator
                    System.out.println("Task List:");
                    Iterator<String> iterate = taskPriorityQueue.iterator();
                    while (iterate.hasNext()) {
                        System.out.print(iterate.next() + "\n");
                    }
                    System.out.println("Highest priority Task:" + taskPriorityQueue.peek());
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    System.out.println("Enter the task name to remove from list");
                    String str= sc.next();
                    System.out.println("-----------------Task Details------------------------");
                    System.out.println("Task Removed or not : " + taskPriorityQueue.remove(str));
                    System.out.println("Least Priority task: " + taskPriorityQueue.poll());
                    System.out.println("Final Task List : " + taskPriorityQueue);
                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    i=1;
                    break;
                default:
                    System.out.println("Thank you for choosing our services");
            }
        } while (i == 0);
    }
}
