package JavaPractice;

public class Practice10 {
	public static void main(String[] args) {// 나누어질수 없는 부분을 체크하기

		// (3 + 5 - 2) X 2 / 3 - 4
		double result = subtract(divide(multiply(subtract(add(3, 5), 2), 2), 3), 4);
		System.out.print(result + "\n");

		// (3 + 4 - 2) X 2 / 3
		double result2 = divide(multiply(subtract(add(3, 4), 2), 2), 0);
		System.out.print(result2);

	}

	public static double add(double n1, double n2) {// 합
		double sum = n1 + n2;
		return sum;
	}

	public static double subtract(double n1, double n2) {// 차
		double minus = n1 - n2;
		return minus;
	}

	public static double multiply(double n1, double n2) {// 곱
		double multiply = n1 * n2;
		return multiply;
	}

	public static double divide(double n1, double n2) {// 분
		if (n1 == 0 || n2 == 0) {
			System.out.print("0으로는 수를 나눌수 없습니다.\n");
			return 0;
		}
		double divide = n1 / n2;
		return divide;
	}

}
