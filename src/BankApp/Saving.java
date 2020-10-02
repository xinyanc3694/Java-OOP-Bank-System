package BankApp;

public class Saving extends Account {
    // properties of saving
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // constructor to initialize savings
    public Saving (String name, String ssn, double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random()*Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random()*Math.pow(10,4));
    };

    // methods of saving

    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );


    }
}
