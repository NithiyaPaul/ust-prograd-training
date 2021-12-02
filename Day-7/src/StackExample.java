import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> horror = new Stack<>();
        System.out.println("------------Book Shelf Management System------------");
        int input;
        int i =0;
        int book_size = 10;
        int self_size = 10;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("What you want");
            System.out.println(" 1.Insert\n 2.Remove\n 3.Availability\n 4.Search \n 5.Details \n 6.Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                    try{
                        System.out.println("How many books you want to insert");
                        int input1 = sc.nextInt();
                        System.out.println("Please insert the books");
                        for(int j = 0; j < input1; j++){
                            String str= sc.next();
                            horror.push(str);
                        }
                        self_size = self_size - input1;
                        System.out.println("------------------Books---------------");
                        System.out.println(horror);
                        System.out.println("---------------------------------------");
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    int size = horror.size();
                    if(size == 0){
                        System.out.println("Sorry nothing to remove from the shelf!!!!!!!!!!");
                    }
                    else {
                        horror.pop();
                        System.out.println("Updated Book List: " + horror );
                        System.out.println("---------------------------------------");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Checking Availability.............");
                        Thread.sleep(1500);
                        int stack_size = horror.size();
                        if(stack_size <= self_size){
                            System.out.println("Shelf contains " + self_size + " free spaces");
                            System.out.println("---------------------------------------");
                        }
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 4:
                    try{
                        System.out.println("Enter Book name");
                        String str= sc.next();
                        int position = horror.search(str);
                        if(position != -1) {
                            System.out.println("Found the book" + str + " at position : " + position);
                            System.out.println("---------------------------------------");
                        } else {
                            System.out.println("Book not found");
                        }

                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("-----------------Shelf Details------------------");
                    System.out.println("Shelf contains  " + horror + " books");
                    System.out.println("Shelf Size : " + book_size);
                    System.out.println("Available Size: " + self_size);
                    System.out.println("First position book: "+ horror.peek());
                    System.out.println("---------------------------------------");
                    break;
                case 6:
                    i=1;
                    break;
                default:
                    System.out.println("Thank you for choosing our services");
            }
        } while (i == 0);
    }
}
