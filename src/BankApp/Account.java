package BankApp;

// not going to create objects in Account
// objects in Checking and Saving will come from account
// abstract: no objects
// constructor: initial trait of object
public abstract class Account implements IRate {
    // common properties for savings and checking
    private String name;
    private String ssn;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize account
    public Account(String name, String ssn, double initDeposit){
        this.name = name;
        this.ssn= ssn;
        balance = initDeposit;
        // set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();

    }
    public abstract void setRate();

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued interest: $ " + accruedInterest);
        printBalance();

    }

    private String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN+ uniqueID + randomNumber;
    }

    // common methods
    public void deposit(double amount){
        balance = balance  + amount;
        System.out.println("Depositing $" + amount);
        printBalance();


    }

    public void withdraw(double amount){
        balance = balance  - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();

    }

    public void transfer(String toWhere, double amount){
        balance = balance  - amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is $" + balance);

    }

    public void showInfo(){
        System.out.println(
                "Name: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"
        );
    }


}
