public class SavingsAccount extends Account{

    
    double interestRate;

    public SavingsAccount(String name,double balnce,double interestRate){
        super(name,balnce);
        this.interestRate = interestRate;

    }

    public void addinterest(){
        double interest = balance*interestRate/100;
        balance = balance + interest;
        System.out.println("Interest added: " + interest);
    }
    
}
