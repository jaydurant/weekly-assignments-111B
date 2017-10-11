//Jason Durant

import java.util.Scanner;

public class GuessingProgram {
	private static Scanner input = new Scanner(System.in);
	private static boolean playGame = true;
	private static NumberGuesser numberGuesser = new NumberGuesser(1,100);
	
	public static void main(String[] args) {
		do{
			playOneGame();
		}while(playGame);	
	}
	
	private static void playOneGame(){
		boolean play = true;
		System.out.println("Think of a number between 1 and 100");
		while(play) {
			int midPoint = numberGuesser.getCurrentGuess();
			System.out.println("Is the number " + midPoint + " (h/l/c):");
			
			char answer = input.next().charAt(0);
			boolean result = checkGuess(answer,numberGuesser);
			
			if(result) {
				System.out.println("You picked " + midPoint + "? Great Pick." );
				System.out.println("Do you want to play again? (y/n):");
				answer = input.next().charAt(0);
				
				determineIfGameWillContinue(answer, numberGuesser);
				play = false;
			}
			
		}
	}
	
	private static boolean checkGuess(char answer, NumberGuesser numberGuesser){
		boolean result = false;
		String answerStr = Character.toString(answer); 
		switch(answerStr){
			case "h":
				numberGuesser.higher();
				break;
			case "l":
				numberGuesser.lower();
				break;
			case "c":
				result = true;
				break;	
		}
		
		return result;
	}
	
	private static void determineIfGameWillContinue(char answer, NumberGuesser numberGuesser){
		String answerStr = Character.toString(answer);
		
		switch(answerStr){
			case "y":
				numberGuesser.reset();
				break;
			case "n":
				System.out.println("Good Bye.");
				playGame = false;
				break;
		}
		
	}

}
