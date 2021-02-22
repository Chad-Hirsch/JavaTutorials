package interations;

public class BinaryGap {

	public static void main(String[] args) {
		
		int result = solution(2147413641);
		System.out.println(result);

	}
	
	public static int solution(int N) {
		
        String binary = Integer.toBinaryString(N);
        
        String[] gaps = binary.replaceAll("0+$", "").split("1"); 
        
        
        for(int i=0; i<gaps.length; i++) {
        System.out.println(gaps[i]);
        }
        
        int maxGap = 0;

        for(String gap : gaps){
            
            if(gap.length() > 0 && gap.length() > maxGap){
                maxGap = gap.length(); 
            }

        }
        return maxGap;  
	}

}
