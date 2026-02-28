package practice;

//Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:
//
//accountNumber should be non-null and non-empty.
//balance should be non-negative.
//Print an error message if the validation fails.


class Account{

    int accountNumber;
    int balance;

    Account(int accountNumber, int balance){

        if(accountNumber != 0 && balance >= 0){
            this.accountNumber =accountNumber;
            this.balance = balance;
        }else{
            System.out.println("Enter Correct Details");
        }

    }

    void disp(){
        System.out.println("Account no." + accountNumber);
        System.out.println("Balance is : " + balance);
    }

}

public class practiceConstructor5 {

    public static void main(String[] args){
        Account A1 = new Account(120005554, 28000);
        Account A2 = new Account(0, -8000);
        A1.disp();
        A2.disp();
        System.out.println(A2.balance +","+ A2.accountNumber);
    }

}
