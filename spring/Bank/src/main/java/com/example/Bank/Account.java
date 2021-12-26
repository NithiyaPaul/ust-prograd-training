package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Account {
    Map<Integer, List<String>> a_array = new HashMap<Integer, List<String>>();
    private double accountBalance=0;
    @Autowired
    private FundTransfer fund;

    public void Account(int accId,String accNumber ,String ifcCode , String branchName , String accountType){
        a_array.put(accId, Arrays.asList(accNumber, ifcCode,String.valueOf(this.accountBalance),branchName,accountType));
    }

    public void deposit(int accId,double amount){
        this.accountBalance = fund.FundTransfer(Double.parseDouble(a_array.get(accId).set(2,String.valueOf(this.accountBalance))),amount,"DEPOSIT");
        a_array.get(accId).set(2,String.valueOf(this.accountBalance));
    }
    public void withdrawal(int accId,double amount){
        this.accountBalance = fund.FundTransfer(Double.parseDouble(a_array.get(accId).set(2,String.valueOf(this.accountBalance))),amount,"WITHDRAWAL");
        a_array.get(accId).set(2,String.valueOf(this.accountBalance));
    }

    public void fundTransfer(int fromAccId,int toAccId,double amount){
        double fromAccountBal = Double.parseDouble(a_array.get(fromAccId).set(2,String.valueOf(this.accountBalance)));
        double toAccountBal = Double.parseDouble(a_array.get(toAccId).set(2,String.valueOf(this.accountBalance)));
        double [] ans = fund.fundTransferOperation(fromAccountBal,toAccountBal,amount);
        a_array.get(fromAccId).set(2,String.valueOf(ans[0]));
        a_array.get(toAccId).set(2,String.valueOf(ans[1]));
    }

    public Map<Integer, List<String>> getAccountDetails() {
        return a_array;
    }


}
