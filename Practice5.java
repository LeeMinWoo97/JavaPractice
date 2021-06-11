package tsts;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// 점수의 범위에 맞는 학점을 출력해 주는 프로그램

		System.out.print("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);

		// 점수 입력
		int score = scanner.nextInt();

		// 입력된 점수 출력
		System.out.print(score);

		// 범위 :100~90
		if (score >= 90 && score <= 100) {
			System.out.print("학점 : A");
		}

		// 범위 :90~80
		else if (score >= 80) {
			System.out.print("학점 : B");
		}

		// 범위 :80~70
		else if (score >= 70) {
			System.out.print("학점 : C");
		}

		// 범위 :70~60
		else if (score >= 60) {
			System.out.print("학점 : D");
		}

		// 범위 :60~50
		else if (score >= 50) {
			System.out.print("학점 : F");

		}

		// 위 범위 외
		else {
			System.out.print("학점에 포함안됨");
		}

	}

}
