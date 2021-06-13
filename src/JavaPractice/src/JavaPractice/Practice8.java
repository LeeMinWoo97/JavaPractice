package JavaPractice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// 대문자는 소문자로 소문자는 대문자로 변경해주는 프로그램

		Scanner scanner = new Scanner(System.in);

		// 문자열 값을 받는다.
		String title = scanner.nextLine();

		// 출력될 값의 변수 생성
		String out = "";
		char tmp;

		// 문자의 길이 만큼 반복
		for (int i = 0; i < title.length(); i++) {

			// 문자를 인트형 수로 변환 하여 tmp에 저장
			tmp = title.charAt(i);

			// 만약 대문자라면 소문자로 변환
			if (Character.isUpperCase(tmp)) {
				out += Character.toLowerCase(tmp);
			}

			// 만약 소문자라면 대문자로 변환
			else {
				out += (char) (tmp - 32);
			}
		}
		System.out.print(out);
	}
}
