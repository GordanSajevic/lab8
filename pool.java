package lab8;

public class pool {	
	public static void main(String[] args) {
		System.out.println("Enter size of tile: ");
		int tile = TextIO.getInt();
		System.out.println("Enter size of tile: ");
		int pool = TextIO.getInt();
		int wholeTile = tile*tile;
		int result = pool/wholeTile;
		System.out.println("You need " + result + " tiles for your pool.");
	}
}
