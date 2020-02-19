package guessing.com;

import java.util.Scanner;

public class GuessingGames 
{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
         
		    String gueserName="";
		    int guesNum=0;
		    int round=0;
		int counter=3;
		int draws=0;
		int player1, payer2;
		int player1Count=0;
		int player2Count=0;
		String payerName1="";
		String playerName2="";
		System.out.println("Enter your Guesser  Name  ");
		gueserName=sc.next();
		System.out.println("Enter your Player Name 1 ");
		 payerName1=sc.next();
		System.out.println("Enter your Player Name 2 ");
			playerName2=sc.next();
			
			do
			{
				round++;
				System.out.println(round+"---------Round Game------------");
				
				System.out.println(gueserName+"  Guess the  Number");
				 guesNum=sc.nextInt();
				System.out.println();
				System.out.println(payerName1+"  Guess the your lucky Number" );
				player1=sc.nextInt();
				System.out.println(playerName2+"  Guess the your lucky the  Number" );
				payer2=sc.nextInt();
				if(player1== guesNum && payer2== guesNum)
				{
					System.out.println("Your both got it---Draw!");
					counter--;
					draws++;
					
				} 
				
				else if(player1 == guesNum)
				{
					player1Count++;
					System.out.println("Corect  "+payerName1+"  you Guessing right");
					counter--;	
				 
				}
				else if( payer2 == guesNum)
				{
					player2Count++;
					System.out.println("Corect  "+playerName2+"  you Guessing right");
					counter--;	
					
				}
				
				else
				{
					System.out.println("No one guessed correctly");
					counter--;	
				}
				
			}while(counter !=0);
				
			System.out.println();
			System.out.println("**********Showing the Result*****************");
			System.out.println();
			System.out.println(payerName1+"  Win   "+ player1Count+"  Game!");
			System.out.println(playerName2+"  Win  "+ player2Count+"  Game!");
			System.out.println("Draws!  "+draws);
			System.out.println();
			
			if( player1Count > player2Count)
			{
				System.out.println( "Congratulation !  "+ payerName1+"  You Won!");
				
			}
			else
			if( player1Count < player2Count)
			{
				System.out.println( "Congratulation !  "+ playerName2+"  You Won!");
				
			}
			else
				System.out.println("it was Draw");


	}

}

