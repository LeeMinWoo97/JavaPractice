package JavaPractice;

import JavaPractice.MessagePractice11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice11 {
	// 계좌생성 및 입출금

	// 계좌 성생시 필요한 자료들 계좌번호, 예금주 예금주 확인 번호(주민번호)
	private int accountNumber; // 계좌번호
	private String name; // 예금주 이름
	private String residentRegistrationNumber; // 주민등록번호
	private static long balance; // 잔고

	private static int accountIndex = 111111111; // 시작 계좌번호

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

	// 잔액 조회
	public long getBalance() {
		return balance;
	}

	// 입금
	public static long deposit(long amount) {
		return balance += amount;
	}

	// 출금
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
				System.out.println("입력이 잘못되었습니다. 다시입력해주세요");
				continue;
			}
			switch (select) {
			case CommandPractice11.EXIT:// 종료
				judgment = false;
				break;
			case CommandPractice11.CREATE_ACCOUNT:// 계좌생성
				System.out.print(MessagePractice11.MSG_CREATE_ACCOUNT_RESIDENTREGISTRATIONNUMBER);
				String residentRegistrationNumber = scanner.next();
				System.out.print(MessagePractice11.MSG_CREATE_ACCOUNT_NAME);
				String name = scanner.next();
				Practice11  newAccount =new Practice11(residentRegistrationNumber,name);
				bankAccounts.add(newAccount);
				System.out.println(String.format(MessagePractice11.MSG_GET_ACCOUNT_NUMBER,newAccount.accountNumber));
				break;
			case CommandPractice11.BALANCE_INQUIRY:// 잔액 조회
				break;
			case CommandPractice11.BALANCE_DEPOSIT:// 입금
				break;
			case CommandPractice11.BALANCE_WITHDRAW:// 출금
				break;

			}
		}
	}
}
