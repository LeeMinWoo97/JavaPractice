package JavaPractice;

public class Practice2 {

	public static void main(String[] args) {
		// 1~100 까지의 모든수 더하기 프로그램

		int add = 0;

		// 1~100까지의 수 모두 더하기
		for (int i = 1; i <= 50; i++) {
			add += i + (i + 50);
		}

		System.out.print(add);// 1~100 더한값 출력
	}

}
