package lab8;

import java.util.Scanner;

public class Faktorijel {
	public static void main(String[] args){
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		int faktorijel=1;
		for (int i=1; i<=broj; i++)
		{
			faktorijel=faktorijel*i;
		}
		System.out.println("Faktorijel je:" + faktorijel);
	} 

}
