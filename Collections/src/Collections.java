import java.util.HashMap;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		HashMap<String, Integer> ids = new HashMap<String, Integer>();
		ids.put("Chad Hirsch", 5);
		ids.put("Bobby", ids.getOrDefault("Bobby", 0) + 1); //if bobby does not exist I use getOrDefault. 
		
		Set<String> keys = ids.keySet(); //This will give all the keys in the hashmap. 
		for(String key : keys) {
			System.out.println(key);
			System.out.println(ids.get(key));
		}
		
	}
}
