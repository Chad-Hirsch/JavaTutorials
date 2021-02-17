import java.*;
import java.io.*;
import java.util.*;

public class MySweetProject {

	
	public static void main(String[] args) { //method
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Chad");
		names.push("Bobby");
		names.push("Rex");
		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.next();
		it.add("Susan");
		
		for(String s: names) {
			System.out.println(s);
		}
		
	} 
}
