import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0, nCorrect = 0;
	String correctAnswer;	
	QuestionDialog question;
	
	Question(String question){
		this.question  = new QuestionDialog();
		this.question.setLayout(new GridLayout(6,1));
		this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
	}
	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	
	void check() {
		nQuestions++;
		String answer = ask();
		
		if(answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect, The correct answer is "+correctAnswer+".");
		}
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	
	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect+"correct out of "+nQuestions+" questions");
	}
}
