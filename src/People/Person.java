package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc, xGold, xDeck, Ball,ellie1;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public int getxGold(int xGold) {return this.xGold;}

	public void setxGold(int Gold) {this.xGold = Gold;}

	public int getxDeck(int i) {return xDeck;}

	public void setxDeck(int xDeck) {this.xDeck = xDeck;}

	public int getBall() {return Ball;}

	public void setBall(int Ball) {this.Ball = Ball;}

	public int getellie1() {return ellie1;}

	public void setellie1(int ellie1) {this.ellie1= ellie1;}


	public Person(String firstName, String familyName, int xLoc, int yLoc, int xGold, int xDeck, int Ball, int ellie1)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.xGold = xGold;
		this.xDeck = 0;
		this.Ball= 0;
		this.ellie1=0;
	}
}
