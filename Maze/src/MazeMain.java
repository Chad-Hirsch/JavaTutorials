import java.util.*;
//import java.io.*; 

public class MazeMain {

	static int[][] maze = {
			{2, 0, 1, 1}, //start in upper right
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	}; 
	static //0=wall
	//1=path
	//2=destination
	
	LinkedList<Position> path = new LinkedList<Position>();
	public static void main(String[] args) {
		
		Position p = new Position(3, 0); //start position. 
		path.push(p); 
		
		maze[path.peek().y][path.peek().x] = 0;
		
	}

}
