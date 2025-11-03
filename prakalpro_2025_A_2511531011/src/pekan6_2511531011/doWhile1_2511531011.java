package pekan6_2511531011;

import java.util.Scanner;

public class doWhile1_2511531011 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.print("Input password: ");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
		console.close();

	}

}
