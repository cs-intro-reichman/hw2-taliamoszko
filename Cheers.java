// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            	String word = (args[0]).toUpperCase();
		int repetitions = Integer.parseInt(args[1]);

		String specialChars = "AEFHILMNORSX";

		for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
		if (specialChars.indexOf(ch) != -1){
			System.out.println("Give me an " + ch + ": " + ch + "!");
		}else {
			System.out.println("Give me a " + ch + ": " + ch + "!");
		}

		}
		System.out.println("What does that spell?");
		for(int i = 0; i < repetitions; i++){
			System.out.println(word +"!!!");
		}
		
			}
	}

