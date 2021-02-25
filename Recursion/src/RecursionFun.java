
public class RecursionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHi(5000);
	}
	
	public static void sayHi(int n) {
	 
		if(n == 0) {
			System.out.println("Done!");
		}else{
			System.out.println("Hi");
			n--;
			sayHi(n);
			 	
		}
	}
	
	//Needs a base case when using recursion. 

}
