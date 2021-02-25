
public class RecursionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countBackwards(100);
	}
	
	public static void countBackwards(int n) {
		if(n == 0) {
			System.out.println("Done!");
		}else {
			System.out.println(n);
			n--;
			countBackwards(n);
		}
	}
	 
		
	
	//Needs a base case when using recursion. 

}
