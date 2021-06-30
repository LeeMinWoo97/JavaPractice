package bank;

public class BankAccount {

	// ���� ������ �ʿ��� �ڷ�� ���¹�ȣ, ������ ������ Ȯ�� ��ȣ(�ֹι�ȣ)
	private int accountNumber; // ���¹�ȣ
	private long residentRegistrationNumber; // �ֹε�Ϲ�ȣ
	private long balance; // �ܰ�

	private static int accountIndex = 111111111; // ���� ���¹�ȣ

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

	// �ܾ� ��ȸ
	public long getBalance() {
		return this.balance;
	}

	// �Ա�
	public void deposit(long amount) {
		balance += amount;
	}

	// ���
	public boolean withdraw(long amount) {
		if (balance < amount)
			return false;

		this.balance -= amount;
		return true;
	}

}
