package OOP;

public class Headphones {

	String brand = "awesome";
	String charge = "Micro USB";
	String controls[] = {"power", "volume", "skip", "play/pause"};
	String color = "Red/Black";
	static int volume;
	
	static boolean power = false; 
	
	public static void powerOn() {
		power = true;
	}
	
	public static void powerOff() {
		power = false;
	}
	
	public static void volumeUp() {
		
		volume++;
	}
	
	public static void volumeDown() {
		volume--;
	}
}
