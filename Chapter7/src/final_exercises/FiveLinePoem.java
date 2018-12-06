package final_exercises;

import java.util.Scanner;

public class FiveLinePoem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1-10");
		int n = sc.nextInt();
		String response = "";
		
		switch (n)
		{
		case 1: 
		case 2: response = "buckle my shoe."; break;
		case 3:
		case 4: response = "Shut the door."; break;
		case 5: 
		case 6: response = "Pick up sticks."; break;
		case 7:
		case 8: response = "lay them straight"; break;
		case 9: 
		case 10: response = "begin again"; break;
		default:
			response = "";
		
		}
	}

}
