// Chapter 8 Question 9
package exercises;
import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }
    
    int count = 0;
    int total = 0;
    
    while (input.hasNextInt())
    {
    	
    	total += input.nextInt();
    	count ++;
    }
    
    double avg = (double)+total / count;
    
    
    System.out.println(avg);
    

  }
}
