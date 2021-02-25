package EnumMadeEasy;

enum Level{
	LOW, MEDIUM, HIGH;
}

public class DoingEnums {
	
	enum Flavor{
		CHOCOLATE, VANILLA, STRAWBERRY;
	}

	static String[] levels = {"Low", "Medium", "High"};
	
	public static void main(String[] args) {
		//enum inside of class.
		Flavor flav = Flavor.VANILLA; 
		
		if(flav == flav.VANILLA) {
			System.out.println("Its vanilla!");
		} else if(flav == flav.CHOCOLATE) {
			System.out.println("Its chocolate!");
		} else if(flav == flav.STRAWBERRY) {
			System.out.println("Its strawberry!");
		}
		
		System.out.println("\n\n\n");
		//outside of the class
		Level l = Level.LOW;
		
		switch(l) {
			case LOW:
				System.out.println("LOW level");
			case MEDIUM:
				System.out.println("MEDIUM level");
			case HIGH:
				System.out.println("HIGH level");
			}
	
		
		
	}
}
