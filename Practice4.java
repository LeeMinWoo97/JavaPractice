package tsts;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// �Է��� �� ��ŭ ���� �׾� �ø���.

		System.out.print("Enter line number");
		Scanner scanner = new Scanner(System.in);
		// ���� ���̴� �� �Է�
		int end = scanner.nextInt();
		int add = 1;

		// ���� ���̴� ����
		for (int i = 1; i <= end; i++) {

			// ���� ���̴� �ټ�
			for (int j = 1; j <= add; j++) {
				System.out.print("*");
			}
			add++;

			// �ٹٲ�
			System.out.print("\n");
		}

	}

}
