package hackerrankchallenges;

// curly braces!!!!!!! Need help!!

public class HackerRankExceptionHandling {
    public static void main (String[] args){
        class MyCalculator{
        
    long power(int n, int p) throws Exception{ 
       return (long) Math.pow(n,p);
	
            if (n < 0 || p < 0) {
                throw new java.lang.Exception("n or p should not be negative");
            }else if (n==0 && p==0)
            {
                throw new java.lang.Exception("n and p should not be zero");
            }
                
    }}
    

   

		
	


