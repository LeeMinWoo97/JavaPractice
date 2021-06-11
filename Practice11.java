package tsts;

public class Practice11 {
	// 계좌생성 및 입출금
	private int accountNumber;
	private String name;
	private String residentRegistrationNumber;
	private long balance;
	
	
	private Practice11(String residentRegistrationNumber, String name) {
		this.residentRegistrationNumber = residentRegistrationNumber;
		this.name =name;
		
		createAccountNumber(accountNumber);
	}
	
	private void createAccountNumber(int accountNumber) {
		this.accountNumber =accountNumber;
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
		// TODO Auto-generated method stub
		String residentRegistrationNumber= "035167-348567";
		String name="홍땡땡";
		Practice11 p11 =new Practice11(residentRegistrationNumber,name);
		
		System.out.print("주민등록번호 : "+p11.residentRegistrationNumber+"\n 성명  :"+p11.name+"\n 계좌번호 : "+p11.accountNumber);
	}

}
