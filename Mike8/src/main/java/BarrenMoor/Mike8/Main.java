package BarrenMoor.Mike8;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("You are in a barren moor. Let's try and find the treasure. Try \"look\"");
		String start=input.nextLine();
		
		if(start.equals("look")) {
			Map m = new Map(6,6);
			Player p = new Player(m.xSize/2,m.ySize/2);
			Treasure t = new Treasure(m,p);
			System.out.println("Use your compass to step around until you locate the treasure.");
			
			while(!t.foundTreasure()) {
				System.out.println("You are "+t.distanceFromTreasure()+" steps from the treasure.");
				System.out.println("Try \"north\" \"east\" \"south\" or \"west\"");
		        String enteredMove=input.nextLine();
		        p.move(enteredMove,m.xSize,m.ySize);
			}
			
			System.out.println("Well done!! You have found the treasure!!");
		} else {
			System.out.println("Oh! You don't want to look for treasure today then :(");
		}
		input.close();
	}
}
