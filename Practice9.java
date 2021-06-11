package tsts;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// Hello World 값 입력시 Khoor Zroug 출력 프로그램
		
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 입력
		String input = scanner.nextLine();
		
		//암호
		String output = "Khoor Zruog";
		
		if (input.equals("Hello World")) {// 문자입력값이 같다면
			System.out.print(output + "\n");
		} else {// 나머지는
			System.out.print("누구시죠?\n");
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
