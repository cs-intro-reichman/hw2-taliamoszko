// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 0;

            StringBuilder sequence = new StringBuilder();

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

            if (mode.equals("v")) {
                System.out.println(sequence.toString() + " (" + (steps + 1) + ")");
            } else if (mode.equals("c")) {
        
            }
        }

        if (mode.equals("v")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        } else if (mode.equals("c")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}

