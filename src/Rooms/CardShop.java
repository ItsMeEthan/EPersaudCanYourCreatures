package Rooms;

import People.Person;

import java.util.Scanner;

public class CardShop extends Room {
    public CardShop(int x1, int y1) {
        super(x1,y1);

    }

    /**
     * Triggers the first Creature you obtain.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            x.setxDeck(this.xDeck);
            x.getxGold(this.xGold);
            System.out.println("Grandpa: Welcome to the Card Shop! How can we assist you?");
                if (xDeck > -1 & xDeck < 1) {
                    System.out.println("Grandpa: Oh is this your first time playing CreatureBrawl? Well lets teach you how to play.");
                    System.out.println("Grandpa: You need to collect five creatures to help you on your journey.");
                    System.out.println("Grandpa: You collect them by befriending them and solving puzzles.");
                    System.out.println("Grandpa: Here I will give you your first Creature. Their name is Ray");
                    xDeck = xDeck + 1;
                    System.out.println("Congratulations you got Ray. Would you like to learn about Ray. (Y/N)");
                    Scanner output = new Scanner(System.in);
                    String s = output.nextLine();
                    if (s.equals("Y")) {
                        System.out.println("Ray: [Age:5/Type:Aqua-Thunder/Species: Manta-Ray/Height:55cm/Weight:89lb]");
                    }
                    if (s.equals("N")) {
                        System.out.println("Granpa: oh okay come back anytime");
                    }
                    if (s != null && !s.isEmpty()) {
                        System.out.println("Please use a proper command");
                    }
                }
                else {
                    System.out.println("Grandpa: *Laughs* sorry little one, I already gave you my only creature, go explore if you want to find another one.");
                }
    }

}
