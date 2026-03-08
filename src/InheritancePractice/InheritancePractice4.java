package InheritancePractice;

//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

class BankAccount{

    public  double Accbalance;


    public  double deposit(double depositCash){
        Accbalance = Accbalance + depositCash;
        System.out.println("Cash deposit successfully" + " of " + depositCash);
        return Accbalance;
    }

    public  double withdraw(double withdrawCash){
        Accbalance = Accbalance - withdrawCash;
        return Accbalance;
    }

}

class SavingsAccount extends BankAccount{

    public  double withdraw(double withdrawCash){

        if(Accbalance - withdrawCash < 100){
            System.out.println("For withdrawl account balance must be more than 100");
            return Accbalance;
        }
        else {
            Accbalance -= withdrawCash;
            System.out.println("Withdrawal successful" + " of " + withdrawCash);
            return Accbalance;
        }
    }

}

public class InheritancePractice4 {

    public static void main(String[] args){

        SavingsAccount sa = new SavingsAccount();
        System.out.println(" balamnce " + sa.Accbalance);

        sa.deposit(150);
        sa.deposit(1500);
        System.out.println("reamining balamnce " + sa.Accbalance);
        sa.withdraw(50);
        sa.deposit(540);
        System.out.println("reamining balamnce " + sa.Accbalance);
        sa.withdraw(750);
        sa.withdraw(1460);

        System.out.println("reamining balamnce " + sa.Accbalance);

    }
}
