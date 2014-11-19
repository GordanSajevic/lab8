package lab8;

import java.util.Scanner;

public class Pogadjanje {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Pogodite broj između 1 i 6");
		double uneseniBroj = unos.nextDouble();
		double broj = 1 + Math.random() * 6;
		while (uneseniBroj!=(int) broj);
		{
			System.out.println("Niste pogodili.Pokušajte ponovo!");
			uneseniBroj = unos.nextDouble();
		}
	
		if (uneseniBroj==(int) broj)
		{
			System.out.println("Čestitam, pogodili ste!");
		}
		unos.close();
	}
}
