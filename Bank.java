public class Bank {
    //private properties of class Bank only accessible within the class.
    //Purpose is to create getters/setters to use these values
    //Getters will be used to return the property for VIEWING purposes
    //Setters will be used so user can CHANGE a private property.

    //numAccts is static because static variables are shared by all instances of the class so will use this
    //to set the acctNum for every new instantiation of the class.
    private static int numAccts=0;
    private int acctNum;
    private double Balance;
    private String fname;



    //1 constructor with no arguments
    public Bank() {

        this.Balance = 0;
        this.fname = "Jane Doe";
        //set the account number equal to the number of accounts and then after, increment by 1.
        this.acctNum = numAccts++;

    }
    //1 constructor with parameters
    public Bank(String fname, double Balance){
        this.fname = fname;
        this.Balance = Balance;
        //set the account number equal to the number of accounts and then after, increment by 1.
        this.acctNum = numAccts++;
    }
    //instance method to return private property of getBalance
    public double getBalance(){
        return Balance;
    }

    //instance method to return private property of getFname
    public String getFname() {
        return fname;
    }

    //method to withdraw money. set to void because you don't return anything.
    //just changing value of private property Balance variable
    public void setWithdrawal(double amount){
        if (amount <= Balance) {
            this.Balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + Balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    //method to deposit money. Set to void because you don't return anything.
    //just changing the value of private property Balance variable
    public void setDeposit(double amount) {
        this.Balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + Balance);
    }

    //instance method to return private property of getAccountNum
    public int getAccountNum() {
        return acctNum;
    }

    //static method belongs to the class and not the object of any bank accounts we make. Class "Bank" itself.
    public static int getNumAccts(){
        return numAccts;
    }
}