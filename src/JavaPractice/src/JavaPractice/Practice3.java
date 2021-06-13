package JavaPractice;

public class Practice3 {

	public static void main(String[] args) {
		// 1~9단 출력 프로그램

		for (int i = 2; i < 10; i++) {

			// 구구단 단수 출력
			System.out.print(i + "단\n");
			for (int j = 1; j < 10; j++) {

				// 단값 만들기
				int multiplication = i * j;
				System.out.print(i + "X" + j + "=" + multiplication + "\n");
			}
		}

	}

}
