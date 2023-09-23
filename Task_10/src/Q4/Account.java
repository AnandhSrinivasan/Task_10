package Q4;

    public class Account {
	  private double Balance ;
	
	 //No Argument Constructor
	public Account() {
		Balance = 0.0;
	}
	//Argument Constructor
	public Account(double CurrentBalance) {
		if (CurrentBalance>=0) {
			Balance=CurrentBalance;
		} else {
			System.out.println("Initial balance can't be Less than Zero");
		} Balance =0.0;	
	}

	public void Deposit(double amount) {
		if (amount>0) {
			Balance += amount;
			System.out.println("Deposited amount is "+ amount + " and Now Current Balance is " + Balance);
		} else {
			System.out.println("No Amount has been Deposited");
		}
	}
	
	public void Withdraw (double amount) {
		
		if (amount > 0 && amount <= Balance) {
			Balance -= amount;
			System.out.println("Withdraw amount is "+ amount + " and Now Current Balance is " + Balance);
		}
		else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
		else {
			System.out.println("No Amount has been Withdrawn");
		}
	}
	
	public double getBalance() {
        return Balance;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		System.out.println("Account Balance: " + acc.getBalance());
		 acc.Deposit(10000);
	     acc.Withdraw(5000);
	}
}
