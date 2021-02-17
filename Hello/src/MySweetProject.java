import java.*;
import java.io.*;
import java.util.*;

public class MySweetProject {

	
	public static void main(String[] args) { //method
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Chad");
		names.push("Bobby");
		names.push("Rex");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		System.out.println("\n");
		
		for(String s: names) {
			System.out.println(s);
		}
		
		names.add(2, "Susan");
		
		for(String s: names) {
			System.out.println(s);
		}
		
	} 
}
