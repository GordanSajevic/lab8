package lab8;

import java.util.Scanner;

public class SquareAndTriangle {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter number: ");
		int num1 = unos.nextInt();
		
		/*Square*/
		
		for (int i=0; i<num1; i++)
		{
			System.out.print("*");
			for (int j=0; j<num1; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n\n");
		
		/*Triangle */
	
		for (int i=1; i<num1*2; i += 2)
		{
		    for (int j=0; j<i; j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
	}

}
