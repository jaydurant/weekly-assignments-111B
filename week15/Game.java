 
//Jason Durant

import java.util.*;

public class Game {
	public static boolean play = true;
	
	public static int ships = 5;
	public static int maxShipLength = 3;
	
	public static void main(String[] args) {
		int row = 10;
		int col = 10;
		
		do {
			System.out.println("Welcome to Battleship.");
			Board board = new Board(col,row);
			playGame(board,ships);
			
		}while(play);
		
		//addShips(ships,board);
		
	}
	
	public static void playGame(Board board, int ships) {
		Scanner input = new Scanner(System.in);
		boolean gameFinished = false;
		addShips(ships,board);
		while(!gameFinished) {
			board.display();
			System.out.println("\nEnter a coordinate: ");
			String coords = input.nextLine();
			String[] coordsArr = coords.split(" ");
			Integer x = Integer.parseInt(coordsArr[0]);
			Integer y = Integer.parseInt(coordsArr[1]);
			
			if(board.isHit(new Point(x,y))) {
				gameFinished = board.numberOfShipsSunk() == ships ? true : false ;
				if(gameFinished) {
					System.out.println("you won!!!!");
				}
				
			}
		}
		
		System.out.println("Would you like to play again:");
		String response = input.next();
		
		if(response.equals("yes")) {
			play = true;
		}else {
			play = false;
		}
		
	}
	
	public static void addShips(int ships, Board board){
		
		Random rand  = new Random();
		int x;
		int y;
		boolean isVertical = true;
		while(ships > 0) {
			isVertical = !isVertical;
			x = rand.nextInt(5) + 2;
			y = rand.nextInt(5);
			Ship ship = new Ship(new Point(x,y),isVertical, rand.nextInt(3) + 2);
			if(board.ships.size() == 0) {
				board.addShip(ship);
				ships--;
			}else{
				boolean add = true;
				for(Ship s : board.ships) {
					if(s.collidesWith(ship)) {
						add = false;
					}
				}
				
				if(add) {
					board.addShip(ship);
					ships--;
				}
			}
		}
		
	}

}
