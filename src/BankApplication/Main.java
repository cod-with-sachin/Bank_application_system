package BankApplication;

import BankApplication.SBI_BANK;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=sc.nextLine();
        System.out.println("Enter your account no ");
        String account=sc.nextLine();

        System.out.println("Enter your age ");
        int age=sc.nextInt();
        System.out.println("Enter your password ");
        String pass=sc.next();
        System.out.println("Enter your balance ");
        int balance=sc.nextInt();
        Bank bank=new SBI_BANK(name,account,age,pass,balance);

        System.out.println("How much money do  you have add : ");
        int bal=sc.nextInt();
        System.out.println("enter your password");
        String p=sc.next();
        int addMoney=bank.AddMoney(p,bal);
        System.out.println("money add successfully : "+" "+addMoney);

        System.out.println("Check your current balance ");
        System.out.println("enter your password ");
        String a=sc.next();
        int currentBalance=bank.checkBalance(a);
        System.out.println(currentBalance);

        System.out.println("how much money do  you withdraw ");
        int m=sc.nextInt();
        System.out.println("enter your security pin ");
        String sec=sc.next();
        int ans=bank.withdrawMoney(sec,m);
        System.out.println("your current balance is : "+" "+ans);






    }
}