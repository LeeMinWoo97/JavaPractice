package tsts;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// 입력한 값 만큼 별을 쌓아 올린다.

		System.out.print("Enter line number");
		Scanner scanner = new Scanner(System.in);
		// 별이 쌓이는 수 입력
		int end = scanner.nextInt();
		int add = 1;

		// 별이 쌓이는 층수
		for (int i = 1; i <= end; i++) {

			// 별이 쌓이는 줄수
			for (int j = 1; j <= add; j++) {
				System.out.print("*");
			}
			add++;

			// 줄바꿈
			System.out.print("\n");
		}

	}

}
