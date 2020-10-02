package BankApp;

//interface: get the int rate from 3rd party
public interface IRate {
    // method to return base rate
    default double getBaseRate(){
        return 2.5;
    }



}
