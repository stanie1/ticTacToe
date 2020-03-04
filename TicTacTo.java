package myBrickGame;

import java.util.Random;
import java.util.Scanner;

public class Tictacto {

	public static void main(String[] args) {
		char gameBoard[][] = {{' ','|',' ','|',' ',' '}, {'-','-','-', '-', '-','-'},
							  {' ','|',' ','|',' ',' '}, {'-','-','-', '-', '-','-'},
							  {' ','|',' ','|',' ',' '}, {'-','-','-', '-', '-','-'}};
								
		printGameBoard( gameBoard );
		
		/*cpu always wait for the nextplayer move to continue
		 is always true for the nextplayer to make the next move
		*/
		while(true) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Placement (1-9) : ");
		
		int userPlacementOnBoard = input.nextInt();
	
	//	
		placePlayerPiece( gameBoard, userPlacementOnBoard, "player_x");
	
	// player_0 player randomly like a cpu after player_X move	
		Random rand = new Random();
	
	//+1 because it actually count from 0 to 8	
		int player_0Position = rand.nextInt(9) + 1;
		
		//placePlayerPiece( gameBoard, userPlacementOnBoard, "player_x");
		// player_0 is the cpu , i mean kinda!!!
		placePlayerPiece( gameBoard, player_xPosition, "player_0");
		
		printGameBoard( gameBoard );
		
	
		}
	}

	// Draw the BoardGrid with 2D arrays, rows and columns
		public static void printGameBoard(char gameBoard[][] ) {
			for (char [] row: gameBoard ) {
					
				for (char column : row)  {
					
					System.out.print(column);
					
				}

				System.out.println();
				}
				
			}
		/*this method place player piece on the on the board
		depending on position giving by the player
		*/
			
	public static void placePlayerPiece(char [][] gameBoard, int userPlacementOnBoard , String user) {
		
		char playerPiece = ' ';// player piece to be place
		
		if(user.equals("player_x")) {// equals is the String comparaison method
			
			playerPiece = 'x';
			
		}
			else if(user.equals("player_0")){
				
				playerPiece = 'o';
		}
		
			
		 if(userPlacementOnBoard == 1 ) {
	
			 gameBoard[0][0] = playerPiece;
			 
		 }
		 
		 else if(userPlacementOnBoard == 2 ) {
	
			 gameBoard[0][2] = playerPiece;
			 
		 }
		 
		 else if(userPlacementOnBoard == 3 ) {
				
			 gameBoard[0][4] = playerPiece;
			 
			 
		 }
		 
		 else if(userPlacementOnBoard == 4 ) {
				
			 gameBoard[2][0] = playerPiece;
			 
			 
		 }
		 
		 else if(userPlacementOnBoard == 5 ) {
				
			 gameBoard[2][2] = playerPiece;
			 
		 }
		 
		 else if(userPlacementOnBoard == 6 ) {
				
			 gameBoard[2][4] = playerPiece;
			 
		 }
		 
		 else if(userPlacementOnBoard == 7 ) {
				
			 gameBoard[4][0] = playerPiece;
			 
		 }
		 
		 else if(userPlacementOnBoard == 8 ) {
				
			 gameBoard[4][2] = playerPiece;
			 
		 }
		 
		 else if(userPlacementOnBoard == 9) {
				
			 gameBoard[4][4] = playerPiece;
			
		 }
	
	}
	}
	
		
	


