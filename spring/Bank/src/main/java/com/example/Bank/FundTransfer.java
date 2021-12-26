package com.example.Bank;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class FundTransfer {

    public double FundTransfer(double balance,double amount,String operation){
        if(amount<=0){
            throw new IllegalArgumentException("Enter the valid amount");
        }
        switch (operation){
            case "DEPOSIT":
                return depositAmount(balance,amount);
            case "WITHDRAWAL":
                return withdrwal(balance,amount);
            default:
                throw new IllegalArgumentException("Invalid operations");
        }
    }

    public double depositAmount(double balance,double amount){
        balance += amount;
        return balance;
    }

    public double withdrwal(double balance,double amount){
        if(balance<amount){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance = balance-amount;
        return balance;
    }

    public double[] fundTransferOperation(double fromAccBal,double toAccBal,double amount){
        if(fromAccBal<amount){
            throw new IllegalArgumentException("Insufficient balance");
        }
        double[] ans = new double[2];
        fromAccBal -=amount;
        toAccBal +=amount;
        ans[0] = fromAccBal;
        ans[1] = toAccBal;
        return ans;
    }
}
