package tsts;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {// 나누어질수 없는 부분을 체크하기
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Input the first number: ");
		//double n1 = scanner.nextInt();// 수1 입력

		//System.out.println("Input the second number: ");
		//double n2 = scanner.nextInt();// 수 2 입력

		//System.out.printf("Sum = %d\n Minus = %d\n Multiply = %d\n Divide = %d\n", sum(n1, n2), minus(n1, n2),
		//		multiply(n1, n2), divide(n1, n2));// 전체 출력

		// (3 + 5 - 2) X 2 / 3 - 4
		double result = minus(divide(multiply(minus(sum(3, 5), 2), 2),3),4);
		System.out.print(result+"\n");


		// (3 + 4 - 2) X 2 / 3 
		double result2 =minus(divide(multiply(minus(sum(3, 4), 2), 2),3),4);
		System.out.print(result2);

	}

	public static double sum(double n1, double n2) {// 합
		double sum = n1 + n2;
		return sum;
	}

	public static double minus(double n1, double n2) {// 차
		double minus = n1 - n2;
		return minus;
	}

	public static double multiply(double n1, double n2) {// 곱
		double multiply = n1 * n2;
		return multiply;
	}

	public static double divide(double n1, double n2) {// 분
		if(n1==0||n2==0) {
			
		}
		double divide = n1 / n2;
		return divide;
	}
}
