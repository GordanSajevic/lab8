package lab8;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		int number = unos.nextInt();
		int palindrome = number;
        int reverseNumber = 0;
        while (palindrome != 0) {
            int saveNumber = palindrome % 10;
            reverseNumber = reverseNumber * 10 + saveNumber;
            palindrome = palindrome / 10;
        }

        if (number == reverseNumber) {
            System.out.println("Number is palindrome!");
            return;
        }
        System.out.println("Number is not palindrome!");
	}

}
