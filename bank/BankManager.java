package bank;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankManager {
	// 계좌생성 및 입출금

	private HashMap<Integer, BankAccount> accounts;
	private Scanner scanner;
	
	
	public BankManager() {
		init();
		manager();
		close();
	}
	
	private void init() {
		this.accounts = new HashMap<>();
		this.scanner = new Scanner(System.in);
	}
	
	private void close() {
		this.accounts.clear();
		this.scanner.close();
	}

	
	public void manager() {

		System.out.print(BankMessage.MSG_HELLO);
		boolean judgment = true;

		while (judgment) {
			int select = selectOption();
			if(select==-1) {
				System.out.println(BankMessage.MSG_ERROR_INT);
				continue;
			}
			switch (select) {

			case BankCommand.EXIT:// 종료
				judgment = false;
				break;

			case BankCommand.CREATE_ACCOUNT:// 계좌생성
				createAccount();
				break;

			case BankCommand.BALANCE_INQUIRY:// 잔액 조회
				balaneInquiry();
				break;
			case BankCommand.BALANCE_DEPOSIT:// 입금\
				processDeposit();
				break;
			case BankCommand.BALANCE_WITHDRAW:// 출금
				break;

			}
		}
	}

	private  int selectOption() {
		System.out.print(BankMessage.MSG_SELECT_MENU);
		try {
			int select = scanner.nextInt();
			if(select<0||select>5) {
				return -1;
			}
			return select;
		} catch (InputMismatchException e) {
			System.out.println(BankMessage.MSG_INPUTMISMATCHEXCEPTION);
			return -1;
		}

	}
	
	private void createAccount() {
		System.out.print(BankMessage.MSG_CREATE_ACCOUNT_RESIDENTREGISTRATIONNUMBER);
		long residentRegistrationNumber = this.scanner.nextLong(); // 주민등록번호 입력
		BankAccount newMember = new BankAccount(residentRegistrationNumber);
		this.accounts.put(newMember.getAccountNumber(), newMember);
		
		System.out.println(String.format(BankMessage.MSG_GET_ACCOUNT_NUMBER, newMember.getAccountNumber()));

	}


	
	private void balaneInquiry() {
	
		BankAccount bankAccount = getAccount();
		if (bankAccount == null)
			return;
		
		printCurrentBalance(bankAccount);
	}
	
	private BankAccount getAccount() {
		
		for (BankAccount bankAccount : this.accounts.values()) {
			System.out.println(String.format(BankMessage.MSG_CANNOT_FIND_ACCOUNT, bankAccount.getAccountNumber(),
					bankAccount.getResidentRegistrationNumber(), bankAccount.getBalance()));
		}

		System.out.println(BankMessage.MSG_INPUT_ACCOUNT_NUMBER);

		int accountID = -1;

		try {
			printPrompt();
			accountID = this.scanner.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
			return null;
		}
		
		return this.accounts.get(accountID);
	}
	
	private void printCurrentBalance(BankAccount bankAccount) {
		System.out.println(String.format(BankMessage.MSG_CURRENT_BALANCE, bankAccount.getBalance()));
	}
	
	private void printPrompt() {
		System.out.print("> ");
	}
	
	private void processDeposit() {
		BankAccount bankAccount = getAccount();
		if (bankAccount == null)
			return;

		System.out.println(BankMessage.MSG_SET_AMOUNT);
		int amount = 0;

		try {
			printPrompt();
			amount = this.scanner.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
			return;
		}

		bankAccount.deposit(amount);
		printCurrentBalance(bankAccount);
	}
}
/*

	private void runManager() {
		
		System.out.println(BankMessage.MSG_HELLO);

		boolean bClose = false;

		while (!bClose) {

			// main menu
			int cmd = getCommand();
			if (cmd == BankDef.INVALID_CMD) {
				System.out.println(BankMessage.ERR_INVALID_CMD);
				continue;
			}

			switch (cmd) {
			case BankCommand.CMD_CREATE:
				processCreate();
				break;

			case BankCommand.CMD_LOOKUP:
				processLookup();
				break;

			case BankCommand.CMD_DEPOSIT:
				processDeposit();
				break;

			case BankCommand.CMD_EXIT:
				bClose = true;
				break;
			}
		}
	}

	private int getCommand() {
		System.out.println(BankMessage.MSG_SELECT_MENU);

		try {
			printPrompt();
			int cmd = this.scanner.nextInt();

			if (cmd < 0 || cmd > 5)
				return BankDef.INVALID_CMD;

			return cmd;
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
			return BankDef.INVALID_CMD;
		}
	}

	private void processCreate() {
		System.out.println(BankMessage.MSG_INPUT_NAME);
		printPrompt();
		String inputName = this.scanner.next();

		BankAccount newAccount = new BankAccount(inputName);
		this.bankAccounts.put(newAccount.getAccountID(), newAccount);

		System.out.println(String.format(BankMessage.MSG_GET_ACCOUNT_ID, newAccount.getAccountID()));
	}

	private void processLookup() {
		BankAccount bankAccount = getAccount();
		if (bankAccount == null)
			return;
		
		printCurrentBalance(bankAccount);
	}

	private void processDeposit() {
		BankAccount bankAccount = getAccount();
		if (bankAccount == null)
			return;

		System.out.println(BankMessage.MSG_SET_DEPOSIT_AMOUNT);
		int amount = 0;

		try {
			printPrompt();
			amount = this.scanner.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
			return;
		}

		bankAccount.deposit(amount);
		printCurrentBalance(bankAccount);
	}

	*/