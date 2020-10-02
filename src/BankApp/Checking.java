package BankApp;

public class Checking extends Account {
    // properties of checking
    private int debitCardNumber;
    private int debitCardPin;

    // Constructor to initialize checking
    public Checking(String name, String ssn, double initDeposit){
        super(name,ssn,initDeposit); // super for parent class
        accountNumber = "2" + accountNumber;
        setDebitCard();


    }

    // methods of checking
    @Override
    public void setRate(){
        rate = getBaseRate() *.15;

    }

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random()*Math.pow(10,12));
        debitCardPin = (int) (Math.random()*Math.pow(10,4));

    }

    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                "\nDebit Card Number: " + debitCardNumber +
                "\nDebit Card Pin: " + debitCardPin
        );
    }
}
