package bank;

public class BankAccount {

	// 계좌 성생시 필요한 자료들 계좌번호, 예금주 예금주 확인 번호(주민번호)
	private int accountNumber; // 계좌번호
	private long residentRegistrationNumber; // 주민등록번호
	private long balance; // 잔고

	private static int accountIndex = 111111111; // 시작 계좌번호

	public BankAccount(long residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
		this.balance = 0;

		createAccountNumber();
	}

	public int createAccountNumber() {
		this.accountNumber = accountIndex;
		return accountIndex = accountIndex + 111;

	}

	public long getResidentRegistrationNumber() {
		return this.residentRegistrationNumber;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	// 잔액 조회
	public long getBalance() {
		return this.balance;
	}

	// 입금
	public void deposit(long amount) {
		balance += amount;
	}

	// 출금
	public boolean withdraw(long amount) {
		if (balance < amount)
			return false;

		this.balance -= amount;
		return true;
	}

}
