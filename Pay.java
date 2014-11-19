package lab8;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args){
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter base pay: ");
		double basePay = unos.nextDouble();
		System.out.println("Enter number of hours: ");
		double hours = unos.nextDouble();
		double pay = basePay * hours;
		System.out.println("Your salary is " + pay);
	}
}
