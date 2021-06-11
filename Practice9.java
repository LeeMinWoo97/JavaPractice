package tsts;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// Hello World �� �Է½� Khoor Zroug ��� ���α׷�
		
		Scanner scanner = new Scanner(System.in);
		
		// ���ڿ� �Է�
		String input = scanner.nextLine();
		
		//��ȣ
		String output = "Khoor Zruog";
		
		if (input.equals("Hello World")) {// �����Է°��� ���ٸ�
			System.out.print(output + "\n");
		} else {// ��������
			System.out.print("��������?\n");
		}
		if (output.equals("Khoor Zruog")) {
			System.out.print(input);
		}

	}

}

public static String encrypt(String message) {
	StringBuilder result = new StringBuilder();
	for (char character : message.toCharArray()) {
	    if (character != ' ') {
	        int originalAlphabetPosition = character - 'a';
	        int newAlphabetPosition = (originalAlphabetPosition + SHIFT_CODE) % 26;
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
	        int newAlphabetPosition = (originalAlphabetPosition - SHIFT_CODE) % 26;
	        char newCharacter = (char) ('a' + newAlphabetPosition);
	        result.append(newCharacter);
	    } else {
	        result.append(character);
	    }
	}
	return result.toString();
}

String message = "Hello World";
String targetMessage = "Khoor Zruog";
String encryptedMessage = CaesarCipher.encrypt(message);
assert(encryptedMessage.equals(targetMessage));

String decryptedMessage = CaesarCipher.decrypt(encryptedMessage);
assert(decryptedMessage.equals(message));
