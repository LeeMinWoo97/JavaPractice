package JavaPractice;

public class Practice2 {

	public static void main(String[] args) {
		// 1~100 ������ ���� ���ϱ� ���α׷�

		int add = 0;

		// 1~100������ �� ��� ���ϱ�
		for (int i = 1; i <= 50; i++) {
			add += i + (i + 50);
		}

		System.out.print(add);// 1~100 ���Ѱ� ���
	}

}
