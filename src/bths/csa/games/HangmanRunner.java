//Darren Kong
//AP Java
//December 22, 2016
package bths.csa.games;

import java.util.Scanner;

public class HangmanRunner 
{
	public void PlayHangman()
	{
		// TODO Auto-generated method stub
		Hangman hanggy = new Hangman();
		
		System.out.println (hanggy.getGreeting());
		System.out.println (hanggy.getDifficulty());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		System.out.println (hanggy.get_difficulty_response(statement));
		statement = in.nextLine();
		System.out.println (hanggy.get_letter_response(statement));
		while (!statement.equals("Bye")||!statement.equals("bye"))
		{
			statement = in.nextLine();
			System.out.println (hanggy.get_letter_response(statement));
			System.out.println(hanggy.get_letter());
		}
		if (statement.equals("Bye")||statement.equals("bye"))
		{
			System.out.println (hanggy.getParting());
			statement = in.nextLine();
		}
	}
}