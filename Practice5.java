package tsts;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// ������ ������ �´� ������ ����� �ִ� ���α׷�

		System.out.print("������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);

		// ���� �Է�
		int score = scanner.nextInt();

		// �Էµ� ���� ���
		System.out.print(score);

		// ���� :100~90
		if (score >= 90 && score <= 100) {
			System.out.print("���� : A");
		}

		// ���� :90~80
		else if (score >= 80) {
			System.out.print("���� : B");
		}

		// ���� :80~70
		else if (score >= 70) {
			System.out.print("���� : C");
		}

		// ���� :70~60
		else if (score >= 60) {
			System.out.print("���� : D");
		}

		// ���� :60~50
		else if (score >= 50) {
			System.out.print("���� : F");

		}

		// �� ���� ��
		else {
			System.out.print("������ ���Ծȵ�");
		}

	}

}
