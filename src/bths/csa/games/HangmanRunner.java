package bths.csa.games;

import java.util.Scanner;

public class HangmanRunner 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hangman hanggy = new Hangman();
		
		System.out.println (hanggy.getGreeting());
		System.out.println (hanggy. getDifficulty());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		System.out.println (hanggy.get_difficulty_response(statement));
		for (int i = 0; i<27; i++)
		{
			statement = in.nextLine();
			System.out.println (hanggy.get_letter_response(statement));
			System.out.println(hanggy.get_letter());
		}
		while (!statement.equals("Bye"))
		{
			System.out.println (hanggy.getParting());
			statement = in.nextLine();
		}
	}

}