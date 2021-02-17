import java.util.*;
import java.io.*; 

public class MazeMain {

	public static void main(String[] args) {
		
		int[][] data = {
				{4, 6, 8 , 7},
				{12, 9, 7, 65},
				{88, 52, 46, 87}
		};
		
		// System.out.println(data.length); //gives the amount of rows.
		// System.out.println(data[0].length); // gives the amount of columns. 
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
