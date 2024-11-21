// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int numTerms =Integer.parseInt(args[0]);

		double approxPi = 0.0;

		for(int i = 0; i< numTerms; i++){
			int denominator = 2 * i + 1;

		if(i % 2 ==0){
			approxPi += 1.0/ denominator;
		}else{
			approxPi -= 1.0/ denominator;
		}
		
	}
	approxPi *= 4;
	System.out.println("pi according to Java: " + Math.PI);
	System.out.println("pi, approximated: " + approxPi);
}
}
