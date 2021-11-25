package com.company;
import java.util.Scanner;
public class Bank {
    int bal_amt = 0;
    int deposit_amt = 0;
    int withdraw_amt = 0;
    Scanner sc = new Scanner(System.in);

    public void deposit(){
        System.out.println("-------------Deposit-----------------");
        System.out.println("Enter Deposit Amount");
        deposit_amt = sc.nextInt();
        bal_amt = bal_amt + deposit_amt;
        System.out.println("--------------Thank You-----------------");
    }
    public void withdrawal(){
        System.out.println("-------------Withdrawal-----------------");
        System.out.println("Enter the withdrawal amount");
        withdraw_amt = sc.nextInt();
        if (withdraw_amt > bal_amt){
            System.out.println("Insufficient Balance");
        } else {
            bal_amt = bal_amt - withdraw_amt;
        }
        System.out.println("--------------Thank You-----------------");
    }
    public void balance(){
        System.out.println("-------------Balance Enquiry-----------------");
        System.out.println("Your Balance amount is " + bal_amt);
        System.out.println("--------------Thank You-----------------");
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        int input;
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------Welcome To XYZ Bank Services-----------------");
        do{
            System.out.println("Please Enter your input");
            System.out.println(" 1.Deposit\n 2.Withdrawal\n 3.Balance Enquiry\n 4.Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                    b.deposit();
                    break;
                case 2:
                    b.withdrawal();
                    break;
                case 3:
                    b.balance();
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
