import java.util.Objects;

public class Person {

	String email;
	String ln;
	
	public Person(String email, String ln){
		this.email = email; 
	}

	@Override
	public int hashCode() {
		//final int prime = 31;
		//int result = 1;
		//result = prime * result + ((email == null) ? 0 : email.hashCode());
		//result = prime * result + ((ln == null) ? 0 : ln.hashCode());
		return Objects.hash(email, ln);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (ln == null) {
			if (other.ln != null)
				return false;
		} else if (!ln.equals(other.ln))
			return false;
		return true;
	}

	
	

}
