package JavaPractice;

public class Practice10 {
	public static void main(String[] args) {// ���������� ���� �κ��� üũ�ϱ�

		// (3 + 5 - 2) X 2 / 3 - 4
		double result = subtract(divide(multiply(subtract(add(3, 5), 2), 2), 3), 4);
		System.out.print(result + "\n");

		// (3 + 4 - 2) X 2 / 3
		double result2 = divide(multiply(subtract(add(3, 4), 2), 2), 0);
		System.out.print(result2);

	}

	public static double add(double n1, double n2) {// ��
		double sum = n1 + n2;
		return sum;
	}

	public static double subtract(double n1, double n2) {// ��
		double minus = n1 - n2;
		return minus;
	}

	public static double multiply(double n1, double n2) {// ��
		double multiply = n1 * n2;
		return multiply;
	}

	public static double divide(double n1, double n2) {// ��
		if (n1 == 0 || n2 == 0) {
			System.out.print("0���δ� ���� ������ �����ϴ�.\n");
			return 0;
		}
		double divide = n1 / n2;
		return divide;
	}

}
