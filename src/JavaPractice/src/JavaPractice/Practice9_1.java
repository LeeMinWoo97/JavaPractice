package JavaPractice;

import java.util.Scanner;

public class Practice9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useDelimiter("\\s*,\\s*");

		double array[] = new double[5];// �迭 �Է�
		double total = 0;// ��ü �� �ʱ�ȭ

		for (int j = 0; j < array.length; j++) {// �迭�� ũ�⸸ŭ �ݺ�
			array[j] = scanner.nextInt();// �迭�� ������� �� �Է�
			total += array[j];// ���� ���ϱ�
		}

		System.out.print(total);// ��ü
	}
}
