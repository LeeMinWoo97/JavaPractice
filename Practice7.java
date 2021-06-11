package tsts;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {// 클래스로 나눠서 해보기
		// 여러명의 점수를 배열을 이용한 계산 프로그램
		int total[][] = { { 90, 80, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } // 배열
		};

		// 5명에 대한 값
		for (int i = 0; i < 5; i++) {

			// 합 초기화
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				// 배열별 합 계산
				sum += total[i][j];
			}

			// 평균 계산
			double ave = sum / 3;
			System.out.print("ID = " + i + "합계 : " + sum + " 평균 : " + ave + "\n");// 출력
		}
	}
}
