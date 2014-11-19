package lab8;

public class Time {
	public static void main(String[] args) {
		System.out.println("Insert hours: ");
		double hours1 = TextIO.getDouble();
		System.out.println("Insert minutes: ");
		double minutes1 = TextIO.getDouble();
		System.out.println("Insert seconds: ");
		double seconds1 = TextIO.getDouble();
		System.out.println("Insert hours: ");
		double hours2 = TextIO.getDouble();
		System.out.println("Insert minutes: ");
		double minutes2 = TextIO.getDouble();
		System.out.println("Insert seconds: ");
		double seconds2 = TextIO.getDouble();
		double hours3=0;
		double minutes3=0;
		double seconds3=0;
		if (hours2>hours1)
		{
			hours3 = hours2 - hours1;
			minutes3 = minutes2 - minutes1;
			seconds3 = seconds2-seconds1;
			if (seconds1>seconds2)
			{
				minutes3 = minutes3 + (-seconds3)/60;
				seconds3 = seconds1 - seconds2;
			}
			if (minutes1>minutes2)
			{
				hours3 = hours3 + (-minutes3)/60;
				minutes3 = minutes1 - minutes2;
			}
		}
		else
		{
			hours3 = hours1 - hours2;
			minutes3 = minutes1 - minutes2;
			seconds3 = seconds1-seconds2;
			if (seconds2>seconds1)
			{
				minutes3 = (-seconds3)/60;
				seconds3 = seconds2 - seconds1;
			}
			if (minutes2>minutes1)
			{
				hours3 = (-minutes3)/60;
				minutes3 = minutes2 - minutes1;
			}
		}
		System.out.println("Time passed: " + hours3 + " hours," + minutes3 + " minutes and " + seconds3 + " seconds");
	}
}
