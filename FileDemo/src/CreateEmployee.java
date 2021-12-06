import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.util.Scanner;

class CreateEmployee {
    int n;
    String id, name, phone, deaprtment, address;
    Scanner sc = new Scanner(System.in);

    void create() throws IOException {
        FileWriter fw = new FileWriter("Employee.txt");
        System.out.println("Enter Number of Employee: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID: ");
            id = sc.next();
            fw.write(id);
            System.out.println("Enter Name: ");
            name = sc.next();
            fw.write(name);
            System.out.println("Enter Phone Number: ");
            phone = sc.next();
            fw.write(phone);
            System.out.println("Enter Address: ");
            address = sc.next();
            fw.write(address);
            System.out.println("Enter Department: ");
            deaprtment = sc.next();
            fw.write(deaprtment);
        }
        fw.close();

    }
}
