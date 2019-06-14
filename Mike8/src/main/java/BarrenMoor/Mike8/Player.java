package BarrenMoor.Mike8;

public class Player {
	
	int xLocation,yLocation;
	
	public Player(int a,int b) {
		xLocation = a;
		yLocation = b;
	}

	public void move(String direction, int mapX, int mapY) {
		
		if(direction.equals("north")) {
			if(yLocation<mapY) {
				yLocation += 1;
			} else {
				System.out.println("Can't move north, reached the edge of the map!");
			}
		}
		else if(direction.equals("east")) {
			if(xLocation<mapX) {
				xLocation += 1;
			} else {
				System.out.println("Can't move east, reached the edge of the map!");
			}
		}
		else if(direction.equals("south")) {
			if(yLocation>1) {
				yLocation -= 1;
			} else {
				System.out.println("Can't move south, reached the edge of the map!");
			}
		}
		else if(direction.equals("west")) {
			if(xLocation>1) {
				xLocation -= 1;
			} else {
				System.out.println("Can't move west, reached the edge of the map!");
			}
		}
	}
	
}
