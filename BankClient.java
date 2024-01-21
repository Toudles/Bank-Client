public class BankClient {
    public static void main(String[] args) {
        // Instantiate two bank accounts/objects from the Bank class
        Bank acct1 = new Bank("Andrew Park", 1000);
        Bank acct2 = new Bank();

        // Print account details for acct1 and acct2
        System.out.println("Account 1 Details:");
        System.out.println("Account Number: " + acct1.getAccountNum());
        System.out.println("Full Name: " + acct1.getFname());
        System.out.println("Balance: " + acct1.getBalance());
        acct1.setWithdrawal(1001);
        acct1.setWithdrawal(500);
        System.out.println(acct1.getBalance());
        acct1.setDeposit(5000);
        System.out.println(acct1.getBalance());

        System.out.println();
        System.out.println("Account 2 Details:");
        System.out.println("Account Number: " + acct2.getAccountNum());
        System.out.println("Full Name: " + acct2.getFname());
        System.out.println("Balance: " + acct2.getBalance());

        // Compare balances and objects
        double balanceAcct1 = acct1.getBalance();
        double balanceAcct2 = acct2.getBalance();

        System.out.println();

        if (balanceAcct1 == balanceAcct2) {
            System.out.println("Balances are the same.");
        } else {
            System.out.println("Balances are different.");
        }

        System.out.println();
        //compare objects
        if (acct1 == acct2) {
            System.out.println("Both accounts are the same object.");
        } else {
            System.out.println("Accounts are different objects.");
        }

        System.out.println();


        System.out.println("The number of accounts is: " + Bank.getNumAccts());
    }

}