package tsts;

public class Practice11 {
	// ���»��� �� �����
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
		 * ������ ���� 123-456789 (������ : ȫ�浿) �ܾ� : 10000�� 20000�� �Ա��մϴ�. �ܾ� : 30000�� 45000��
		 * ����մϴ�. �ܾ� -15000��
		 * 
		 * ������ �Ա�, ��� �ݾ��� ������ ��� ���� �ܾ��� ������ �Ǵ� ��� �߻� �ݾ��� ��µǴ� ��쿡 10000�� -> 10,000���� ����
		 * ����
		 * 
		 * BankAccountManager �ټ��� BankAccount ����
		 * 
		 */
		// TODO Auto-generated method stub
		String residentRegistrationNumber= "035167-348567";
		String name="ȫ����";
		Practice11 p11 =new Practice11(residentRegistrationNumber,name);
		
		System.out.print("�ֹε�Ϲ�ȣ : "+p11.residentRegistrationNumber+"\n ����  :"+p11.name+"\n ���¹�ȣ : "+p11.accountNumber);
	}

}
