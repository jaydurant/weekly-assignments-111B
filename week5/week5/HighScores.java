package week5;
import java.util.Scanner;
import java.util.ArrayList;

// Jason Durant

public class HighScores {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> scores = new ArrayList<>();
		
		initialize(names,scores);
		sort(names,scores);
		display(names,scores);
		
	}
	
	public static void initialize(ArrayList<String> names, ArrayList<Integer> scores){
		Scanner input = new Scanner(System.in);
		int scoresCount = 5;
		for(int i = 0 ; i < scoresCount ; i++ ) {
			String message = "Enter the name for score #" + ( i + 1 );
			System.out.println(message);
			String name = input.next();
			names.add(name);
			
			message = "Enter the score for score #" + (i + 1);
			System.out.println(message);
			int score = input.nextInt();
			scores.add(score);
		}
	}
	
	public static void sort(ArrayList<String> names, ArrayList<Integer> scores){
		
		for(int i = 0; i < scores.size() - 1 ; i++) {
			int maxScore = scores.get(i);
			int oldScore = scores.get(i);
			String oldName = names.get(i);
			String maxName = names.get(i);
			int maxIndex = i;
			int yIndex = 0;
			
			for(int y = i + 1 ; y < scores.size() ; y++ ) {
				if(scores.get(y) > maxScore) {
					maxScore = scores.get(y);
					maxName = names.get(y);
					yIndex = y;
				}
			}
			
			if(yIndex > 0) {
				scores.set(maxIndex, maxScore);
				scores.set(yIndex, oldScore);
				names.set(maxIndex, maxName);
				names.set(yIndex, oldName);
				
			}
			 
		}
		
	}
	
	public static void display(ArrayList<String> names, ArrayList<Integer> scores){
		System.out.println("Top Scorers");
		
		for(int i = 0; i < names.size() ; i++){
			System.out.println(names.get(i) + ": " + scores.get(i));
		}
	}

}
