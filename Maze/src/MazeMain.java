import java.util.*;
//import java.io.*; 

public class MazeMain {

	static int[][] maze = {
			{2, 0, 1, 1}, //start in upper right
			{1, 1, 1, 0},
			{0, 0, 0, 1}
	}; 
	static //0=wall
	//1=path
	//2=destination
	
	LinkedList<Position> path = new LinkedList<Position>();
	public static void main(String[] args) {
		
		Position p = new Position(0, 3); //start position. 
		path.push(p); 
		
		
		while(true) {
			int y = path.peek().y;
			int x = path.peek().x;
			
			//down
			if(maze[y+1][x] == 2) {
				System.out.println("Moved Down. You Won!");
			}else if(maze[y+1][x] == 1) {
				System.out.println("Moved Down");
				path.push(new Position(y+1, x) );
				continue;
			}
			
			//left
			if(maze[y][x-1] == 2) {
				System.out.println("Moved Left. You Won!");
			}else if(maze[y][x-1] == 1) {
				System.out.println("Moved Left");
				path.push(new Position(y, x-1) );
				continue;
			}
			
			//up
			if(maze[y-1][x] == 2) {
				System.out.println("Moved Up. You Won!");
			}else if(maze[y-1][x] == 1) {
				System.out.println("Moved Up");
				path.push(new Position(y-1, x) );
				continue;
			}
			
			//right
			if(maze[y][x+1] == 2) {
				System.out.println("Moved Right. You Won!");
			}else if(maze[y][x+1] == 1) {
				System.out.println("Moved Right");
				path.push(new Position(y, x+1) );
				continue;
			}
		}
		
	}

}
