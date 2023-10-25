package com.example;//1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * 1. class must be in pacakge
 * 2. class must be public
 * 3. must have private data
 * 4. must have setter and getter
 * 5. must have no-arg constructor
 */


@Entity //it means Account class is an Entity who will have a PK
@Table(name="account_tbl") //it means the table name is account_tbl
public class Account { //POJO 2
    
    @Id //it means below field is a PK
    @Column(name="accno")
    private int accountNumber; //3

    @Column(name="acc_holder", length = 20)
    private String accountHolderName; //3

    @Column(name="acc_bal")
    private double accountBalance; //3


    //5
    public Account() {
        System.out.println("Account ctor....");
    }

    //4 
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    
}
