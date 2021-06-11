package tsts;

import java.util.Arrays;
import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String line = "";
		line = scanner.nextLine();
		System.out.println(line);
		String[] lines = line.replace(" ", "").split(",");
		System.out.println(Arrays.toString(lines));
		int[] nums = Arrays.stream(lines).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(nums));

		// 합 초기화
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		System.out.print("점수 : ");

		// 합계 출력
		System.out.print("합계 : " + sum);

		// 10개의 평균 계산
		int ave = sum / 10;

		// 평균 계산
		System.out.print("평균 : " + ave);
	}
}
