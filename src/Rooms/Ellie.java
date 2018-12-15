package Rooms;

import People.Person;

import java.util.Scanner;

public class Ellie extends Room {

    public Ellie(int x2, int y2) {
        super(x2, y2);
    }
    //Triggers creature ellie to join adventure.
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        int ellie1=1;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setxDeck(this.xDeck);
        x.getxGold(this.xGold);
        x.setBall(this.Ball);
        System.out.println("You see a small elephant playing with a ball, what do you wanna do?(approach it/leave it alone)");
        Scanner Ellie1= new Scanner(System.in);
        String e= Ellie1.nextLine();
        if(e.equals("approach it")) {
            System.out.println("*PoP!* As you approach the elephant, the elephant's ball pops. It begins to cry.");
            while(ellie1==1 && Ball == 0) {
            System.out.println("What do you wanna do now? (Pet it/Find New Ball)");
            String e2=Ellie1.nextLine();
                if (ellie1 == 1 && e2.equals("Pet it")) {
                    System.out.println("The Elephant is too sad to play.");
                }
                if (ellie1 == 1 && e2.equals("Find New Ball")) {
                    System.out.println("You decide to help the elephant by finding a new ball for it.");
                    System.out.println("New Quest: Find New Ball for the elephant");
                    ellie1=2;
                }
                if(e2 != null && !e2.isEmpty()) {
                    System.out.println("Please use a proper command");
                }
            }
        }
        if(e.equals("leave it alone")) {
            System.out.println("You decide not to bother the elephant as it plays.");
        }
        if(e != null && !e.isEmpty()) {
            System.out.println("Please use a proper command");
        }

    }
}
