package JavaPractice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� �������ִ� ���α׷�

		Scanner scanner = new Scanner(System.in);

		// ���ڿ� ���� �޴´�.
		String title = scanner.nextLine();

		// ��µ� ���� ���� ����
		String out = "";
		char tmp;

		// ������ ���� ��ŭ �ݺ�
		for (int i = 0; i < title.length(); i++) {

			// ���ڸ� ��Ʈ�� ���� ��ȯ �Ͽ� tmp�� ����
			tmp = title.charAt(i);

			// ���� �빮�ڶ�� �ҹ��ڷ� ��ȯ
			if (Character.isUpperCase(tmp)) {
				out += Character.toLowerCase(tmp);
			}

			// ���� �ҹ��ڶ�� �빮�ڷ� ��ȯ
			else {
				out += (char) (tmp - 32);
			}
		}
		System.out.print(out);
	}
}
