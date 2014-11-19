package lab8;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("Unesite koeficijente kvadratne jednačine a, b i c: ");
		double a = TextIO.getDouble();
		double b = TextIO.getDouble();
		double c = TextIO.getDouble();
		double x1=0;
		double x2=0;
		double d=b*b-4*a*c;
		if (a == 0)
		{
			System.out.println("This is not quadratic equation!");
		}
		else
		{
			if (d < 0)
			{
				d=-d;
				b=-b;
				System.out.println("x1 = " + b + " + i*" + d + " / " + 4*a*c);
				System.out.println("x1 = " + b + " - i*" + d + " / " + 4*a*c);
			}
			else
			{
				x1 = (-b + d) / (2*a);
				x2 = (-b - d) / (2*a);
				System.out.println("x1 = " + x1);
				System.out.println("x1 = " + x2);
			}
		}
	}

}
