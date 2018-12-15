package Rooms;

import People.Person;

import java.util.Scanner;

public class EllieBall extends Room {
    public EllieBall(int x, int y) {
        super(x, y);
    }

    /**
     * Triggers the first Creature you obtain.
     *
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setxDeck(this.xDeck);
        x.getxGold(this.xGold);
        if (Ball == 0) {
            System.out.println("In a small clearing, you see a small ball. What would you like to do?(Take Ball/ Leave Ball)");
            Scanner Ellie2 = new Scanner(System.in);
            String e2a = Ellie2.nextLine();
            if (e2a.equals("Take Ball")) {
                System.out.println("Hm... Wonder what I can do with this...");
                Ball = 1;
            }
            if (e2a.equals("Leave Ball")) ;
            System.out.println("You think to yourself that it might be someone else's ball and decide to leave it alone.");
        }
        if(Ball==1) {
            System.out.println("This is where you collected a ball");
        }
    }
}
