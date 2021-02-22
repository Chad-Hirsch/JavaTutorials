

public class Collections {

	public static void main(String[] args) {
		//override hashcode values 
		Person p = new Person("email@email.com", "Bobbyyyy");
		Person q = new Person("email@email.com", "Bobby");
		
		System.out.println(p.equals(q));
		
		System.out.println(p.hashCode());
		System.out.println(q.hashCode());
	}
}
