package tsts;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {// (0��C �� 9/5) + 32 = 32��F
		// �����µ� ȭ���µ� ��ȯ ���α׷�

		System.out.print("���� : ");
		double n = 9;
		double o = 5;
		double t = n / o;
		Scanner scanner = new Scanner(System.in);

		// �����µ� �Է�
		int celsiusTemperature = scanner.nextInt();
		double fahrenheitTemperature = operation(celsiusTemperature, t);
		print(fahrenheitTemperature);
	}

	// ȭ���µ� ���
	public static double operation(int celsiusTemperature, double t) {
		double OP = (celsiusTemperature * t) + 32;
		return OP;
	}

	// ȭ���µ� ���
	public static void print(double fahrenheitTemperature) {
		System.out.print("ȭ�� :" + fahrenheitTemperature + "F");
	}
}
