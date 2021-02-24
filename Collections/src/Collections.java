

public class Collections {

	public static void main(String[] args) {
		
		Item<String> item = new Item<String>();
		item.setX("Hello");
		
		
		Item<Person> item2 = new Item<Person>();
		Person p = new Person("Hello", "Hello"); 
		item2.setY(p);
		
		Person p2 = item2.getY(); 
		
		
	}
}
