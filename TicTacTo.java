package myBrickGame;

import java.util.Scanner;

public class Tictacto {

	public static void main(String[] args) {
		char gameBoard[][] = {{' ','|',' ','|',' ',' '}, {'-','-','-', '-', '-','-'},
							  {' ','|',' ','|',' ',' '}, {'-','-','-', '-', '-','-'},
							  {' ','|',' ','|',' ',' '}, {'-','-','-', '-', '-','-'}};					
		printGameBoard( gameBoard );
	/* place the user input in the rigth position using array index
	*/	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Placement (1-9) : ");
		
		int userPlacementOnBoard = input.nextInt();
		
		System.out.println(userPlacementOnBoard);
		
		
		// here you can also use the switch-case if you wish to

		 if(userPlacementOnBoard == 1 ) {
	
			 gameBoard[0][0] = 'x';
		 }
		 
		 else if(userPlacementOnBoard == 2 ) {
	
			 gameBoard[0][2] = 'x';
			 
		 }
		 
		 else if(userPlacementOnBoard == 3 ) {
				
			 gameBoard[0][4] = 'x';
			  
		 }
		 
		 else if(userPlacementOnBoard == 4 ) {
				
			 gameBoard[2][0] = 'x';
			 
		 }
		 
		 else if(userPlacementOnBoard == 5 ) {
				
			 gameBoard[2][2] = 'x';
			 
		 }
		 
		 else if(userPlacementOnBoard == 6 ) {
				
			 gameBoard[2][4] = 'x';
			 
		 }
		 
		 else if(userPlacementOnBoard == 7 ) {
				
			 gameBoard[4][0] = 'x';
			 
		 }
		 
		 else if(userPlacementOnBoard == 8 ) {
				
			 gameBoard[4][2] = 'x';
		 }
		 
		 else if(userPlacementOnBoard == 9) {
				
			 gameBoard[4][4] = 'x';
			
		 }
	
		 printGameBoard( gameBoard );
		 
	}
		/*
		This method to print 2D gameBoard
		*/
		public static void printGameBoard(char gameBoard[][] ) {
			for (char [] row: gameBoard ) {
					
				for (char column : row)  {
					
					System.out.print(column);
					}

				System.out.println();
				}
				
			}
		
	}
		
	


