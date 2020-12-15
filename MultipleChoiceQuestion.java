import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	
	//copy class variables for nQuestions and nCorrect from Quiz class previously used
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	//add instance variables for the question and correct answer
	String question;
	String correctAnswer;
	
	//add constructor for "MultipleChoiceQuestions" objects and give 7 parameters
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		
		//initialize question using query parameter followed by each choice parameter
		question = query + "\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		
		//initialize "correctAnswer" to the parameter "answer". Convert to upper case.
		correctAnswer = answer.toUpperCase();
	}
		
		//convert 'ask' from class method of 'Quiz' to instance method of 'MultpleChoiceQuestion'
	
		
		String ask() {
			while (true) {
				String answer = JOptionPane.showInputDialog(question);
				answer = answer.toUpperCase();
				
				boolean valid = (answer.equals("A") || (answer.equals("B")) || (answer.equals("C")) || (answer.equals("D")) || (answer.equals("E"))); 
				
				if (valid) return answer;
					JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A,B,C,D, or E.");
			}
		}
			
			
		void check() {
			
			nQuestions++;
			
			String answer = ask();
			
			if (answer.equals(correctAnswer)) {
				JOptionPane.showMessageDialog(null,"Correct!");
				nCorrect++;
			} else {
				JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
			}	
	}

		
		static void showResults() {
			JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions");
		}
		
		public static void main(String[] args) {
			
			MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
					"What is a highligther?", 
					"a pen with neon ink", 
					"a lighter specifically for drug users", 
					"an available Java import", 
					"another term for sunrise", 
					"the laser weapon from Star Wars",
					"a");
			question1.check();
			
			MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
					"What is coffee?", 
					"liquid energy for the soul", 
					"a drink served hot or cold", 
					"a type of bean", 
					"a drink that may or may not be caffinated", 
					"all of the above",
					"e");
			question2.check();
			
			MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
					"Why don't unicorns exist?", 
					"they are mythcial creatures", 
					"they do, as narwhals", 
					"they missed the ark departure deadline", 
					"horses evolved and don't need a horn", 
					"none of the above",
					"b");
			question3.check();
			
			MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
					"Who likes pots of gold?",
					"leprachans",
					"unicorns",
					"businessmen",
					"aliens",
					"everyone",
					"e");
			question4.check();
	
			MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
					"What goes up?",
					"elevators",
					"age",
					"hot air balloons",
					"the sun",
					"all of the above",
					"e");
			question5.check();
			
			MultipleChoiceQuestion question6 = new MultipleChoiceQuestion(
					"What movie is Darth Vador in when he gets his black suit?",
					"What is a Darth Vador?",
					"Star Wars I",
					"Star Wars II",
					"Star Wars III",
					"Star Wars 48",
					"d");
			question6.check();
			
			showResults();
			
		}

}
