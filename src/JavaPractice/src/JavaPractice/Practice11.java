package JavaPractice;

public class Practice11 {
	// ���»��� �� �����

	// ���� ������ �ʿ��� �ڷ�� ���¹�ȣ, ������ ������ Ȯ�� ��ȣ(�ֹι�ȣ)
	private int accountNumber; // ���¹�ȣ
	private String name; // ������ �̸�
	private String residentRegistrationNumber; // �ֹε�Ϲ�ȣ
	private long balance; // �ܰ�

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
	

	
		
	// �ܾ� ��ȸ
		public long getBalance() {
			return balance;
		}
		// �Ա�
		public void deposit(long amount) {
			balance += amount;
		}
		// ���
		public boolean withdraw(long amount) {
			if (balance < amount)
				return false;
			
			balance -= amount;
			return true;
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
		Practice11 pt1 = new Practice11("993351-1504891","�谭��");
		System.out.print("�����Ͻ� ������ ���¹�ȣ�� :"+pt1.accountNumber+"\n ������ :"+pt1.name+"\n �ܾ� : "+pt1.balance+ "�� �Դϴ�.\n");
		System.out.print("�ܾ� :"+pt1.getBalance()+"\n");
		System.out.print(pt1.deposit(1000));
		
		Practice11 pt2 = new Practice11("903351-1506511","������");
		System.out.print("�����Ͻ� ������ ���¹�ȣ�� :"+pt2.accountNumber+"\n ������ :"+pt2.name+"\n �ܾ� : "+pt2.balance+ "�� �Դϴ�.\n");
	}

}