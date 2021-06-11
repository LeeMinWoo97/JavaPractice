package tsts;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {// (0¡ÆC ¡¿ 9/5) + 32 = 32¡ÆF
		// ¼·¾¾¿Âµµ È­¾¾¿Âµµ º¯È¯ ÇÁ·Î±×·¥

		System.out.print("¼·¾¾ : ");
		double n = 9;
		double o = 5;
		double t = n / o;
		Scanner scanner = new Scanner(System.in);

		// ¼·¾¾¿Âµµ ÀÔ·Â
		int celsiusTemperature = scanner.nextInt();
		double fahrenheitTemperature = operation(celsiusTemperature, t);
		print(fahrenheitTemperature);
	}

	// È­¾¾¿Âµµ °è»ê
	public static double operation(int celsiusTemperature, double t) {
		double OP = (celsiusTemperature * t) + 32;
		return OP;
	}

	// È­¾¾¿Âµµ Ãâ·Â
	public static void print(double fahrenheitTemperature) {
		System.out.print("È­¾¾ :" + fahrenheitTemperature + "F");
	}
}
