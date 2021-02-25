package Constructors;

public class Shirt {

	private static char size; 
	private static String color; 
	
	public static void putOn() {
		System.out.println("Shirt is on!");
	}
	
	public static void takeOff() {
		System.out.println("Shirt is off!");
	}

	public Shirt(char size, String color) {
		super();
		this.size = size;
		this.color = color;
		System.out.println("The color is " + this.color);
		System.out.println("Size is " + this.size);
	}

	public Shirt() {
		// TODO Auto-generated constructor stub
	}
	
	
}

