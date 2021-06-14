package JavaPractice;

import JavaPractice.MessagePractice11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice11 {
	// ���»��� �� �����

	// ���� ������ �ʿ��� �ڷ�� ���¹�ȣ, ������ ������ Ȯ�� ��ȣ(�ֹι�ȣ)
	private int accountNumber; // ���¹�ȣ
	private String name; // ������ �̸�
	private String residentRegistrationNumber; // �ֹε�Ϲ�ȣ
	private static long balance; // �ܰ�

	private static int accountIndex = 111111111; // ���� ���¹�ȣ

	private Practice11(String residentRegistrationNumber, String name) {
		this.residentRegistrationNumber = residentRegistrationNumber;
		this.name = name;
		this.balance = 0;

		createAccountNumber();
	}

	private void createAccountNumber() {
		this.accountNumber = accountIndex;
		accountIndex = accountIndex + 111;

	}

	// �ܾ� ��ȸ
	public long getBalance() {
		return balance;
	}

	// �Ա�
	public static long deposit(long amount) {
		return balance += amount;
	}

	// ���
	public boolean withdraw(long amount) {
		if (balance < amount)
			return false;

		balance -= amount;
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Practice11> bankAccounts = new ArrayList<Practice11>();
		Scanner scanner = new Scanner(System.in);

		System.out.print(MessagePractice11.MSG_HELLO);
		boolean judgment = true;
		while (judgment) {
			int select = 0;
			System.out.print(MessagePractice11.MSG_SELECT_MENU);
			try {
				select = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�Է��� �߸��Ǿ����ϴ�. �ٽ��Է����ּ���");
				continue;
			}
			switch (select) {
			case CommandPractice11.EXIT:// ����
				judgment = false;
				break;
			case CommandPractice11.CREATE_ACCOUNT:// ���»���
				System.out.print(MessagePractice11.MSG_CREATE_ACCOUNT_RESIDENTREGISTRATIONNUMBER);
				String residentRegistrationNumber = scanner.next();
				System.out.print(MessagePractice11.MSG_CREATE_ACCOUNT_NAME);
				String name = scanner.next();
				Practice11  newAccount =new Practice11(residentRegistrationNumber,name);
				bankAccounts.add(newAccount);
				System.out.println(String.format(MessagePractice11.MSG_GET_ACCOUNT_NUMBER,newAccount.accountNumber));
				break;
			case CommandPractice11.BALANCE_INQUIRY:// �ܾ� ��ȸ
				break;
			case CommandPractice11.BALANCE_DEPOSIT:// �Ա�
				break;
			case CommandPractice11.BALANCE_WITHDRAW:// ���
				break;

			}
		}
	}
}
