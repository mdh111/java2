package BarrenMoor.Mike8;
import java.util.Random;

public class Treasure {
	
	int xLocation,yLocation;
	Player player1;
	Map map1;
	
	public Treasure(Map m, Player p) {
		map1 = m;
		player1 = p;
		Random ran = new Random();
		xLocation = ran.nextInt(m.xSize);
		yLocation = ran.nextInt(m.ySize);
	}

	public boolean foundTreasure() {
		if(xLocation==player1.xLocation && yLocation==player1.yLocation) {
			return true;
		} else {
			return false;
		}
	}
	
	public int distanceFromTreasure(){
		int distance=0;
		if(xLocation>player1.xLocation) {
			distance+=xLocation-player1.xLocation;
		} else if(player1.xLocation>xLocation) {
			distance+=player1.xLocation-xLocation;
		}
		if(yLocation>player1.yLocation) {
			distance+=yLocation-player1.yLocation;
		} else if(player1.yLocation>yLocation) {
			distance+=player1.yLocation-yLocation;
		}
		return distance;
	}
	
}
