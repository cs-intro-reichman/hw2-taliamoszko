// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

       
        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 0;

            StringBuilder sequence = new StringBuilder();

            
            if (seed == 1) {
                sequence.append("1 4 2 1"); 
                steps = 4;  
            } else {
              
                while (current != 1) {
                    sequence.append(current).append(" ");
                    if (current % 2 == 0) {
                        current /= 2;  
                    } else {
                        current = 3 * current + 1;  
                    }
                    steps++;  
                }
                sequence.append(1);  
                steps++;  
			}

            
            if (mode.equals("v")) {
               
                System.out.println(sequence.toString() + " (" + steps + ")");
            }
        }

        
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
