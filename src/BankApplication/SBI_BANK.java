package BankApplication;

public class SBI_BANK implements Bank{

    private String name;
    private String AccountNo;
    private int age;
    private String password;
    private  int balance;

    public SBI_BANK(String name, String accountNo, int age, String password, int balance) {
        this.name = name;
        AccountNo = accountNo;
        this.age = age;
        this.password = password;
        this.balance = balance;
    }
    public  int AddMoney(String password,int money)
    {
        if(password.equals(password))
        {
            balance+=money;
            return balance;

        }

            return 0;

    }

    public  int withdrawMoney(String password,int money){
        if(balance>=money)
        {
            balance=balance-money;
            return balance;
        }
        return -1;
    }
    public  int checkBalance(String password){
        if(password.equals(password))
        {
            return balance;
        }
        else
            return 0;
    }

}
