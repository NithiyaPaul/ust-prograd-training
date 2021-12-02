import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Frameworks php = new Laravel();
        Frameworks js = new ReactJs();
        int input;
        int i =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Select any one");
            System.out.println(" 1.Laravel\n 2.React Js\n 3.Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                    php.description();
                    php.features();
                    break;
                case 2:
                    js.description();
                    js.features();
                    break;
                case 3:
                    i=1;
                    break;
                default:
                    System.out.println("Thank you for choosing our services");
            }
        } while (i == 0);
    }
}
