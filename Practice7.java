package tsts;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {// Ŭ������ ������ �غ���
		// �������� ������ �迭�� �̿��� ��� ���α׷�
		int total[][] = { { 90, 80, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } // �迭
		};

		// 5�� ���� ��
		for (int i = 0; i < 5; i++) {

			// �� �ʱ�ȭ
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				// �迭�� �� ���
				sum += total[i][j];
			}

			// ��� ���
			double ave = sum / 3;
			System.out.print("ID = " + i + "�հ� : " + sum + " ��� : " + ave + "\n");// ���
		}
	}
}
