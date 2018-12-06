package decision_based_story;

import java.util.Scanner;

public class Story {
	
	private static Scanner sc = new Scanner(System.in);
	private static String decision;
	private static int goal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goal = (int)(Math.random() * 8 ) + 1;
		location1();
		
	}

	private static void location1() {
		// TODO Auto-generated method stub
		String location = "You awaken in front of a old house " 
				+ "you can walk in the house or walk around the house";
		System.out.println(location);
		
		String prompt = "walk in or walk around?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("walk in"))
		{
			location2();
		}
		else if (decision.equals("walk around"))
		{
			location3();
		}
		else {
			location1();
		}
	}
	private static void location2() {

		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String location = "You enter the door and walk into a big room on the side of the room "
						+ "there is a staircase. " + "you can go up or down.";
				System.out.println(location);
				
				String prompt = "go down or go up?";
				System.out.println(prompt);
				
				decision = sc.nextLine();
				
				if (decision.equals("go up"))
				{
					location4();
				}
				else if (decision.equals("go down"))
				{
					location5();
				}
				else if (decision.equals("back"))
				{
					location1();
				}
				else
				{
					location2();
				}
		
		
	}
	private static void location3() {
		// TODO Auto-generated method stub
		
		String location = "You walk around the house and come to a run down shead "
				+ "it is locked, " + "do you unlock the shead or leave it locked";
		System.out.println(location);
		
		String prompt = "unlock or keep locked?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("unlock"))
		{
			location6();
		}
		else if (decision.equals("keep locked"))
		{
			location7();
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location3();
		}
	}
	private static void location4() {
		// TODO Auto-generated method stub
		String location = "At the top of the stairs you come to a wall " + "with two doors on it, one is locked. ";
		System.out.println(location);
		
		String prompt = "unlock 1st or open 2nd?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("unlock 1st"))
		{
			location8();
		}
		else if (decision.equals("open 2nd"))
		{
			location9();
		}
		else if (decision.equals("back"))
		{
			location2();
		}
		else
		{
			location4();
		}
		
	}
	private static void location5() {
		// TODO Auto-generated method stub
		String location = "You reach the bottom of the stairs. " + "At the bottom of the stairs there is a hallway. "
		+ "do you go Right or left";
		System.out.println(location);
		
		String prompt = "left or right?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("left"))
		{
			location11();
		}
		else if (decision.equals("right"))
		{
			location10();
		}
		else if (decision.equals("back"))
		{
			location2();
		}
		else
		{
			location5();
		}
		
	}
	private static void location6() {
		// TODO Auto-generated method stub
		String location = "You manage to unlock the shead "
				+ "even after unlocking the lock you are debating weather to investigate or not.";
		System.out.println(location);
		
		String prompt = "investigate or dont?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("investigate"))
		{
			location12();
		}
		else if (decision.equals("dont"))
		{
			location13();
		}
		else if (decision.equals("back"))
		{
			location3();
		}
		else
		{
			location6();
		}
		
	}
	private static void location7() {
		// TODO Auto-generated method stub
		String location = "You decided to not unlock the shead, " + "you walk to the back of the house and you find yourself at the back door. "
		+ "do you walk in or not?";
		System.out.println(location);
		
		String prompt = "walk in or don't?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("walk in"))
		{
			location14();
		}
		else if (decision.equals("dont"))
		{
			location1();
		}
		else if (decision.equals("back"))
		{
			location3();
		}
		else
		{
			location7();
		}
		
	}
	private static void location8() {
		// TODO Auto-generated method stub
		if (goal == 8)
		{
			System.out.println("You unlock the door and find a phone on the ground, you find out where you are and contact someone to get you.");
			return;
		}
		String location = "After many struggled attempts of trying to unlock the door. " + "you open the door and find what inside as interesting. "
		+ "There is nothing in the room exept a dresser.";
		System.out.println(location);
		
		String prompt = "/n open or leave?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("open"))
		{
			System.out.println("TBD...");
		}
		else if (decision.equals("leave"))
		{
			location4();
		}
		else if (decision.equals("back"))
		{
			location4();
		}
		else
		{
			location8();
		}
		
	}
	private static void location9() {
		// TODO Auto-generated method stub
		if (goal == 9)
		{
			System.out.println("the piece of paper you found is a key and a bright light appears before you...");
			return;
		}
		String location = "You open the door that isn't locked, you are confused " + 
		"on the ground there is a piece of paper and on the paper it reads 'int potato = 0;'. " + "what does this message mean?";
		System.out.println(location);
		
		String prompt = "?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("yes"))
		{
			goal = 9;
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location9();
		}
		
	}
	private static void location10() {
		// TODO Auto-generated method stub
		if (goal == 10)
		{
			System.out.println("");
			return;
		}
		String location = "oddly enough on the other side of the door there is stairs."
				+ "you can go up or down.";
		System.out.println(location);
		
		String prompt = "/n go down or go up?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("go up"))
		{
			location2();
		}
		else if (decision.equals("go down"))
		{
			location3();
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location2();
		}
		
	}
	private static void location11() {
		// TODO Auto-generated method stub
		if (goal == 11)
		{
			System.out.println("");
			return;
		}
		String location = "oddly enough on the other side of the door there is stairs."
				+ "you can go up or down.";
		System.out.println(location);
		
		String prompt = "/n go down or go up?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("go up"))
		{
			location2();
		}
		else if (decision.equals("go down"))
		{
			location3();
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location2();
		}
		
	}
	private static void location12() {
		// TODO Auto-generated method stub
		if (goal == 12)
		{
			System.out.println("");
			return;
		}
		String location = "oddly enough on the other side of the door there is stairs."
				+ "you can go up or down.";
		System.out.println(location);
		
		String prompt = "/n go down or go up?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("go up"))
		{
			location2();
		}
		else if (decision.equals("go down"))
		{
			location3();
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location2();
		}
		
	}
	private static void location13() {
		// TODO Auto-generated method stub
		if (goal == 13)
		{
			System.out.println("");
			return;
		}
		String location = "oddly enough on the other side of the door there is stairs."
				+ "you can go up or down.";
		System.out.println(location);
		
		String prompt = "/n go downgo down or go up?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("go up"))
		{
			location2();
		}
		else if (decision.equals("go down"))
		{
			location3();
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location2();
		}
		
	}
	private static void location14() {
		// TODO Auto-generated method stub
		if (goal == 14)
		{
			System.out.println("");
			return;
		}
		String location = "oddly enough on the other side of the door there is stairs."
				+ "you can go up or down.";
		System.out.println(location);
		
		String prompt = "/n go down or go up?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("go up"))
		{
			location2();
		}
		else if (decision.equals("go down"))
		{
			location3();
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location2();
		}
		
	}
	private static void location15() {
		// TODO Auto-generated method stub
		if (goal == 15)
		{
			System.out.println("");
			return;
		}
		String location = "oddly enough on the other side of the door there is stairs."
				+ "you can go up or down.";
		System.out.println(location);
		
		String prompt = "/n go down or go up?";
		System.out.println(prompt);
		
		decision = sc.nextLine();
		
		if (decision.equals("go up"))
		{
			location2();
		}
		else if (decision.equals("go down"))
		{
			location3();
		}
		else if (decision.equals("back"))
		{
			location1();
		}
		else
		{
			location2();
		}
		
	}


}
