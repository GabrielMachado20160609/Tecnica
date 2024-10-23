package program;

import java.io.IOException;
import java.util.Scanner;

public class LetterCheck {
	private static Scanner scan1;

	public static void main(String[] args) throws IOException {
		try {
			scan1 = new Scanner(System.in);
			System.out.println("Digite a frase para verificação: ");
			String phrase = scan1.nextLine();
			
			System.out.println("Digite uma letra para verificação");
			String letter = scan1.next();
			
			if(letter.length() > 1) {
				throw new IOException("Caractere inválido");
			}
			
			checkCharacter(phrase, letter);
			
		} catch(IOException e) {
			System.out.println("Digite entradas válidas");
			System.out.println(e.getMessage());
		}
		
		
		scan1.close();
	}
	
	public static void checkCharacter(String phrase, String character) {
		int count = 0;
		
		for(int i = 0; i < phrase.length(); i++) {
			char verificationLetter = Character.toLowerCase(phrase.charAt(i));
			if(verificationLetter == Character.toLowerCase(character.charAt(0))) {
				count ++;
			}
		}
		
		if(count > 0) {
			System.out.println("A frase possui "+count+" letras "+character.toUpperCase());
		}
		else {
			System.out.println("A frase não possui a letra "+character.toUpperCase());
		}
	}
}
