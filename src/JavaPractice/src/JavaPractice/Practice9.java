package JavaPractice;

import java.util.Scanner;

public class Practice9 {

	private static final int offset = 3;

	public static void main(String[] args) {
		// Hello World �� �Է½� Khoor Zroug ��� ���α׷�

		Scanner scanner = new Scanner(System.in);

		// ���ڿ� �Է�
		String input = "Hello World";
		String output = "Khoor Zruog";
		String encryptedinput = encrypt(input);
		assert (encryptedinput.equals(output));
		System.out.print(encryptedinput + "\n");

		String decryptedMessage = decrypt(encryptedinput);
		assert (decryptedMessage.equals(input));
		System.out.print(decryptedMessage);

	}

	public static String encrypt(String message) {
		StringBuilder result = new StringBuilder();
		for (char character : message.toCharArray()) {
			if (character != ' ') {
				int originalAlphabetPosition = character - 'a';
				int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
				char newCharacter = (char) ('a' + newAlphabetPosition);
				result.append(newCharacter);
			} else {
				result.append(character);
			}
		}
		return result.toString();
	}

	public static String decrypt(String message) {
		StringBuilder result = new StringBuilder();
		for (char character : message.toCharArray()) {
			if (character != ' ') {
				int originalAlphabetPosition = character - 'a';
				int newAlphabetPosition = (originalAlphabetPosition - offset) % 26;
				char newCharacter = (char) ('a' + newAlphabetPosition);
				result.append(newCharacter);
			} else {
				result.append(character);
			}
		}
		return result.toString();
	}
}