package practiceStatic;

class BankAccount{
    String accountNumber;
    double balance;
    static  String bankName;
    static double interestRate;

    BankAccount(String accountNumber, double balance){
        this.accountNumber =accountNumber;
        this.balance = balance;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setInterestName(double rate) {
        interestRate = rate;
    }

    public  static double getInterestRate(){
        return interestRate;
    }

    void disp(){
        System.out.println("Bankname : " + bankName);
        System.out.println("Account no. : " + accountNumber);
        System.out.println("balance : " + balance);
        System.out.println("Interest rate : " + interestRate);
    }



}

public class staticPractice6 {

    public static void main(String[] args){

        BankAccount.setBankName("Union Bank Of India");
        BankAccount.setInterestName(5.4);

        BankAccount b1 = new BankAccount("435202120005554",5000.00);

        BankAccount b2 = new BankAccount("435202120005578",45000.00);

        BankAccount b3 = new BankAccount("435202120005578",58000.00);

        BankAccount b4 = new BankAccount("435202120005578",565000.00);
        BankAccount b5 = new BankAccount("435202120005578",65000.00);

        b1.disp();
        System.out.println("--------------------------------------------------");
        b2.disp();
        System.out.println("--------------------------------------------------");
        b3.disp();
        System.out.println("--------------------------------------------------");
        b4.disp();
        System.out.println("--------------------------------------------------");
        b5.disp();
    }
}
