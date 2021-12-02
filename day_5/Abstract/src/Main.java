import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 MobilePhone iphone = new Iphone();
     MobilePhone samsung = new Samsung();
        int input;
        int i =0;
        Scanner sc = new Scanner(System.in);
        iphone.view();
        do{
            System.out.println("Please Enter your mobile brand");
            System.out.println(" 1.Iphone\n 2.Samsung\n 3.Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                    iphone.companyName();
                    iphone.features();
                    break;
                case 2:
                    samsung.companyName();
                    samsung.features();
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
