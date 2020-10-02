package BankApp;


import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccApp {
    public static void main(String[] args) throws FileNotFoundException {

        List<Account> accounts = new LinkedList<Account>();

        // read CSV file then create new accounts bases on data

        String file = "C:\\Users\\Xinyan Chen\\.spyder-py3\\CIS 2300\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder){
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")){
                accounts.add(new Saving(name,ssn,initDeposit));
            }
            else if (accountType.equals("Checking")){
                accounts.add(new Checking(name,ssn,initDeposit));

            }
            else{
                System.out.println("Error reading account type");
            }


        }

        for(Account acc: accounts){
            System.out.println("\n*******************");
            acc.showInfo();
        }

    }
}
