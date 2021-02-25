import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		Pair<Person, Person> item = new Pair<Person, Person>();
		Person p = new Person("Hello", "Hello"); 
		item.setX(p);
		item.setY(p);
		
		Pair<Integer, String> pair = new Pair<Integer, String>();
		pair.setX(5);
		pair.setY("Favorite number.");
		
		ArrayList<Pair> pears = new ArrayList<Pair>(); 
		pears.add(pair); 
		
		
	}
}
