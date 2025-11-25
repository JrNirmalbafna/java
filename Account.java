public class Account {
	private double baclance;

	public Account(double initialBalance) {
		this.baclance = initialBalance;
	}
	public double getBalance() {
		return baclance;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			baclance += amount;
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	public void withdraw(double amount) {
		if (amount > 0 && amount <= baclance) {
			baclance -= amount;
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	public static void main(String[] args) {
		Account myAccount = new Account(1000.0);
		System.out.println("Initial Balance: " + myAccount.getBalance());
		
		myAccount.deposit(500.0);
		System.out.println("Balance after deposit: " + myAccount.getBalance());
		
		myAccount.withdraw(200.0);
		System.out.println("Balance after withdrawal: " + myAccount.getBalance());
		
		
	}
}
