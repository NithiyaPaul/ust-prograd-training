import java.util.*;
public class ArrayQueueExample {
    public static void main(String[] args) {
        ArrayDeque<String> ticketQueue = new ArrayDeque<String>();
        System.out.println("-------------Ticket Management System--------------");
        int input,input1;
        int i =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println(" 1.Add Passengers\n 2.Ticket Details\n 3.Cancel Ticket Details\n 4.Search\n 5.Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter Number of Tickets");
                    input1 = sc.nextInt();
                    System.out.println("Add Passenger Names ");
                    for(int j = 1; j <= input1; j++){
                        String str= sc.next();
                        ticketQueue.add(str);
                    }
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    //using Iterator
                    System.out.println("-----------------Ticket Details------------------------");
                    System.out.println("Passenger List:");
                    ticketQueue.forEach(System.out::println);
                    System.out.println("Is Queue is empty or not:" + ticketQueue.isEmpty());
                    System.out.println("Size of the List:" + ticketQueue.size());
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------Ticket Details------------------------");
                    System.out.println("First cancelled Passenger Name : " + ticketQueue.remove());
                    System.out.println("Updated List: " + ticketQueue);
                    System.out.println("Cancelled passenger using poll function: " + ticketQueue.poll());
                    System.out.println("Final Ticket List: " + ticketQueue );
                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    System.out.println("Enter passenger name");
                    String str= sc.next();
                    if (ticketQueue.contains(str)) {
                        System.out.println("Ticket List contains " + str);
                    } else {
                        System.out.println("Ticket Queue doesn't contain " + str);
                    }
                    break;
                case 5:
                    i=1;
                    break;
                default:
                    System.out.println("Thank you for choosing our services");
            }
        } while (i == 0);
    }
}
