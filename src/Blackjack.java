import java.util.Scanner;
import java.util.Random;

//Jason Durant

public class Blackjack {
	public static void main(String args[]) {
		byte totalCount = 0;
		boolean gameActive = false;
		Random random = new Random();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to play Blackjack? (y/n)");
		gameActive = input.next().charAt(0) == 'y' ? true : false;
		
		while(gameActive) {
			if(totalCount == 0) {
				int firstCard = random.nextInt(10) + 1;
				int secondCard = random.nextInt(10) + 1;
				totalCount += (byte)firstCard + (byte)secondCard;
				System.out.println("First Cards: " + firstCard + ", "+ secondCard);
				System.out.println("Total: " + totalCount);
			}
			
			if(totalCount <= 21){
				System.out.println("Would you like another card? (y/n)");
				boolean anotherCard = input.next().charAt(0) == 'y' ? true : false;
				if(anotherCard) {
					int card = random.nextInt(10) + 1;
					totalCount += (byte)card;
					System.out.println("Card: " + card);
					System.out.println("Total: " + totalCount);
				} else if(!anotherCard) {
					gameActive = false;
				}
			}
			
			if(totalCount > 21){
				System.out.println("Bust!");
				System.out.println("Would you like to play again? (y/n)");
				gameActive = input.next().charAt(0) == 'y' ? true : false;
				if(gameActive){
					totalCount = 0;
				}	
			}
		}
		
		input.close();
		
	}
	
}
