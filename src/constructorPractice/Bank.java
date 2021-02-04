package constructorPractice;

public class Bank {
    private int accountNumber;
    private Double accountBalance;
    private String name;
    private String email;
    private int phoneNumber;

    Bank(int accountNumber, Double accountBalance, String name, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        this.email = email;
        this.phoneNumber =phoneNumber;

    }

    public double deposit(double addDeposit){
        accountBalance += addDeposit;
        System.out.println("Your new balance is: " + this.accountBalance);
        return this.accountBalance;

    }
    public double withdraw(double withdrawal){
        if(this.accountBalance- withdrawal > 0){
            return this.accountBalance - withdrawal;
        }else{
            System.out.println("You do not have sufficient funds withdraw " + withdrawal + " your account balance is " + accountBalance);
        }
       return this.accountBalance;
    }

    public static void main(String[] args) {
        Bank account1 = new Bank(234, 450000.0, "Phoebe", "phoebe@me.com",672343129);

        account1.deposit(20000.40);
        account1.deposit(20.40);
        System.out.println(account1.name);
    }
}
