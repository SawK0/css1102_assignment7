
public class Quiz {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Question question = new TrueFalseQuestion("Barcelona is the capital of Spain", "n");
		question.check();
		
		question = new TrueFalseQuestion("Vatican City is the smallest country in the world", "y");
		question.check();
		
		question = new TrueFalseQuestion("New York is nicknamed The Big Apple", "y");
		question.check();
		
		question = new TrueFalseQuestion("The capital of Australia is Sydney", "f");
		question.check();
		
		question = new TrueFalseQuestion("Nepal is the only country in the world without a rectangular flag", "t");
		question.check();
		
		question = new MultipleChoiceQuestion(
				"What language is the most spoken worldwide",
				"Chinese",
				"English",
				"Spanish",
				"Hindi",
				"Arabic",
				"b"
				);
		question.check();
		
		question = new MultipleChoiceQuestion(
				"What is the capital city of Thailand",
				"Bangkok",
				"Yangon",
				"Kuala Lumpur",
				"Phnom Penh",
				"Hanoi",
				"a"
				);
		question.check();
		
		question = new MultipleChoiceQuestion(
				"Java was developed by",
				"Linus Torvalds",
				"Bill Gates",
				"Steve Jobs",
				"James Gosling",
				"Mark Zuckerberg",
				"d"
				);
		question.check();
		
		question = new MultipleChoiceQuestion(
				"DNS stands for",
				"Dynamic Network System",
				"Direct Network System",
				"Direct Network Server",
				"Domain Network System",
				"Domain Name System",
				"e"
				);
		question.check();
		
		question = new MultipleChoiceQuestion(
				"What is SQL",
				"A low-level programming language",
				"A vaccination",
				"A language to access databases",
				"A powerful modern weapon",
				"A markup language",
				"c"
				);
		question.check();
		
		question.showResults();
	}

}
