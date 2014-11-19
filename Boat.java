package lab8;

public class Boat {

	public static void main(String[] args) {
		System.out.println("Enter speed for boat (miles per hour): ");
		int speed = TextIO.getInt();
		System.out.println("Enter distance that boat needs to cover (kilometers): ");
		double distance = TextIO.getInt();
		distance = distance / 1.609344;
		double time = distance/(int) speed;
		System.out.println("Boat will need " + time + " hours.");
	}

}
