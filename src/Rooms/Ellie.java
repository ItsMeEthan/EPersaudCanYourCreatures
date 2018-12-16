package Rooms;

import Game.Runner;
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
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setxDeck(this.xDeck);
        x.getxGold(this.xGold);
        x.setellie1(this.ellie1);
            System.out.println("You see a small elephant playing with a ball, what do you wanna do?(approach it)");
            Scanner Ellie1 = new Scanner(System.in);
            String e = Ellie1.nextLine();
            if (e.equals("approach it")) {
                System.out.println("*PoP!* As you approach the elephant, the elephant's ball pops. It begins to cry.");
                System.out.println("What do you wanna do now? (Pet it/Kick it)");
                String e2 = Ellie1.nextLine();
                    if (ellie1 == 0 && e2.equals("Pet it")) {
                        System.out.println("The elephant looks at you and smiles. It wants to be your friend.");
                        System.out.println("The elephant has became your friend! Would you like to know more about it?(Y/N).");
                        xDeck=2;
                        System.out.println("Congrats now you have "+xDeck+" Creatures.");
                        Scanner output = new Scanner(System.in);
                        String s = output.nextLine();
                        if (s.equals("Y")) {
                            System.out.println("Ellie: [Age:3/Type:Aqua-Earth/Species: Elephant/Height:55cm/Weight:89lb");
                            System.out.println("Now wee need to go and tell grandpa the great news.");
                        }
                        if (s.equals("N")) {
                            System.out.println("Now wee need to go to the Lab to show them our discoveries.");
                        }
                    }
                    if (ellie1 == 0 && e2.equals("Kick it")) {
                        System.out.println("You decide to kick the elephant... you monster.");
                        System.out.println("New Quest The elephant gets really mad at you and attacks.");
                        System.out.println("it tramples you and you die the end. Game Over.");
                        Runner.gameOff();
                    }
                }
            }
        }