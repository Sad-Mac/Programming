package final_exercises;

import java.util.Scanner;

public class Nims {
	
	private int stonesLeft;
	private Scanner sc;
	
	public Nims()
	{
		stonesLeft = 11;
		sc = new Scanner(System.in);
		
	}
	
	public int humanMove(int nStones)
	{
		System.out.println("How many stones do you take?");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1: return 1;
		case 2: 
			if (nStones >= 2)
			{
				return 2;
			}
			else
			{
				return nStones;
			}
		case 3:
			if (nStones >= 3)
			{
				return 3;
			}
			else
			{
				return nStones;
			}
		default:
			System.out.println("Invalid Choise, taking 1 stone instead.");
			return 1;
		}
	}
	
	public int computerMove(int nStones)
	{
		
		if (stonesLeft < 4)
		{
			return stonesLeft;
		}
		else if (stonesLeft == 4)
		{
			return (int)(Math.random() * 3) + 1;
		}
		else if (stonesLeft == 5)
		{
			return 1;
		}
		else if (stonesLeft == 6)
		{
			return 2;
		}
		else if (stonesLeft == 7)
		{
			return 3;
		}
		else if (stonesLeft > 7)
		{
			return (int)(Math.random() * 3) + 1;
		}
		
		System.out.println();
		return 1;
		
	}
	
	 /**
	   * Plays the game
	   */
	  public void play()
	  {
	    while (stonesLeft > 0)
	    {
	      System.out.println(stonesLeft + " stone(s) left in the pile");

	      int n = -1;
	      while (n < 0)
	        n = humanMove(stonesLeft);
	      stonesLeft -= n;
	      System.out.println("You took " + n + " stone(s)");
	      if (stonesLeft == 0)
	      {
	        System.out.println("Congrats -- you won!");
	      }
	      else
	      {
	        n = computerMove(stonesLeft);
	        stonesLeft -= n;
	        System.out.println("I take " + n + " stone(s)");
	        if (stonesLeft == 0)
	          System.out.println("Hooray -- I won!");
	      }
	    }
	  }

	  /****************************************************************/

	  public static void main(String[] args)
	  {
	    Nims game = new Nims();
	    game.play();
	  }

}
