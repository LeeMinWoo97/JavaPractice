package JavaPractice;

import java.util.Scanner;

public class Practice9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useDelimiter("\\s*,\\s*");

		double array[] = new double[5];// 배열 입력
		double total = 0;// 전체 합 초기화

		for (int j = 0; j < array.length; j++) {// 배열의 크기만큼 반복
			array[j] = scanner.nextInt();// 배열의 순서대로 값 입력
			total += array[j];// 총합 더하기
		}

		System.out.print(total);// 전체
	}
}
