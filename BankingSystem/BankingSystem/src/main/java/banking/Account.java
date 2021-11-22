package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account implements AccountInterface{
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.pin=pin;
		this.balance=startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		if(null!=this.accountHolder) {
			return this.accountHolder;
		}
		return	null;
		
	}

	public boolean validatePin(int attemptedPin) {
		if(this.pin==attemptedPin) {
			return true;
		}
		return false;
	}

	public double getBalance() {
		if(balance>0) {
			return this.balance;
		}
        return 0;
	}

	public Long getAccountNumber() {
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		this.balance=+amount;
	}

	public boolean debitAccount(double amount) {
		this.balance=-amount;
	}
}
