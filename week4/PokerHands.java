import java.util.Scanner;

//Jason Durant

public class PokerHands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int HANDCOUNT = 5;
		int[] pokerList = new int[HANDCOUNT];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numeric cards, no face cards. Use 2-9.");
		
		for(int i = 0; i < HANDCOUNT ; i++){
			int cardCount = i + 1;
			System.out.println("Card " + cardCount + ": ");
			int cardNumber = input.nextInt();
			
			pokerList[i]= cardNumber;
			
		}
		input.close();
		
		if(containsFourOfaKind(pokerList)) {
			System.out.println("Four of a Kind!");
		} else if(containsFullHouse(pokerList)) {
			System.out.println("Full House!");
		} else if(containsStraight(pokerList)) {
			System.out.println("Straight!");
		} else if(containsThreeOfaKind(pokerList)) {
			System.out.println("Three of a Kind!");
		} else if(containsTwoPair(pokerList)) {
			System.out.println("Two Pair!");
		} else if(containsPair(pokerList)) {
			System.out.println("Pair!");
		}
		
		
		
	}
	
	public static boolean containsPair(int[] cards){
		for(int i = 0; i < cards.length;i++) {
			int count = 0; 
			for(int y = 0 ; y < cards.length; y++){
				if(cards[i] == cards[y]){
					count++;
				}
			}
			
			if(count == 2) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean containsTwoPair(int[] cards){
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0 ; i < cards.length ; i++){
			int count = 0;
			for (int y = 0; y < cards.length; y++) {
				if(cards[i] == cards[y]) {
					count++;
				}
			}
			
			if(count == 2 && count1 == 0){
				count1 = cards[i];
			} else if(count == 2 && count1 != cards[i]) {
				count2 = cards[i];
			}
			
		}
		
		return count1 != 0 && count2 != 0 ? true : false;
	} 
	
	public static boolean containsThreeOfaKind(int[] cards) {
		
		for(int i = 0; i < cards.length ; i++){
			int count = 0;
			
			for (int y = 0; y < cards.length; y++){
				if(cards[i] == cards[y]) {
					count++;
				}
			}
			
			if(count == 3) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean containsStraight(int[] cards){
		int max = cards[0];
		
		for(int i = 0; i < cards.length ; i++) {
			if(max < cards[i]){
				max = cards[i];
			}
		}
		
		for(int y = 0; y < cards.length - 1 ;y ++) {
			max--;
			boolean equals = false;
			for(int card : cards){
				if(card == max) {
					equals = true;
				}
			}
			
			if(!equals) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean containsFullHouse(int[] cards){
		int card1 = 0;
		int card2 = 0;
		
		for(int i= 0; i < cards.length; i++){
			int count = 0;
			for(int y = 0 ; y < cards.length; y++ ){
				if(cards[i] == cards[y]) {
					count++;
				}
			}
			
			if(count == 2){
				card1 = cards[i];
			} else if(count == 3) {
				card2 = cards[i];
			}
			
		}
		
		return card1 > 0 && card2 > 0 ? true : false;
	}
	
	public static boolean containsFourOfaKind(int[] cards){

		for(int i= 0; i < cards.length; i++){
			int count = 0;
			for(int y = 0; y < cards.length; y++){
				if(cards[i] == cards[y]) {
					count++;
				}
			}
			
			if(count == 4) {
				return true;
			}
			
		}
		
		return false ;
	}

}
