package JavaPractice;

public class Practice11 {
	// 계좌생성 및 입출금

	// 계좌 성생시 필요한 자료들 계좌번호, 예금주 예금주 확인 번호(주민번호)
	private int accountNumber; // 계좌번호
	private String name; // 예금주 이름
	private String residentRegistrationNumber; // 주민등록번호
	private long balance; // 잔고

	private int accountIndex = 111111111;

	private Practice11(String residentRegistrationNumber, String name) {
		this.residentRegistrationNumber = residentRegistrationNumber;
		this.name = name;
		this.balance = 0;

		createAccountNumber();
	}

	private void createAccountNumber() {
		this.accountNumber = accountIndex;
		accountIndex =accountIndex+ 111;
		
	}
	

	
		
	// 잔액 조회
		public long getBalance() {
			return balance;
		}
		// 입금
		public void deposit(long amount) {
			balance += amount;
		}
		// 출금
		public boolean withdraw(long amount) {
			if (balance < amount)
				return false;
			
			balance -= amount;
			return true;
		}

	public static void main(String[] args) {
		/*
		 * 실행결과 계좌 123-456789 (예금주 : 홍길동) 잔액 : 10000원 20000원 입금합니다. 잔액 : 30000원 45000원
		 * 출금합니다. 잔액 -15000원
		 * 
		 * 문제점 입금, 출금 금액이 음수인 경우 보완 잔액이 음수가 되는 경우 발생 금액이 출력되는 경우에 10000원 -> 10,000원과 같이
		 * 변경
		 * 
		 * BankAccountManager 다수의 BankAccount 관리
		 * 
		 */
		Practice11 pt1 = new Practice11("993351-1504891","김강건");
		System.out.print("개설하신 계좌의 계좌번호는 :"+pt1.accountNumber+"\n 에금주 :"+pt1.name+"\n 잔액 : "+pt1.balance+ "원 입니다.\n");
		System.out.print("잔액 :"+pt1.getBalance()+"\n");
		System.out.print(pt1.deposit(1000));
		
		Practice11 pt2 = new Practice11("903351-1506511","박종석");
		System.out.print("개설하신 계좌의 계좌번호는 :"+pt2.accountNumber+"\n 에금주 :"+pt2.name+"\n 잔액 : "+pt2.balance+ "원 입니다.\n");
	}

}