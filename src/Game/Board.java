package Game;

import People.Person;
import Rooms.Room;

public class Board {
    Room[][] b;

    public Board(Room[][] b) {
        this.b = b;
    }

    public Board(int h, int w) {
        b = new Room[h][w];
    }

    public void printBoar(Person p1) {
        String t = "[ ]";
        String l = "[o]";
        for (Room[] i : b) {
            for (Room m : i) {
                if (i.equals(p1.getxLoc()) && m.equals(p1.getyLoc())) {
                    System.out.print(l);
                }
                else {
                    System.out.print(t);
                }
            }
            System.out.print("\n");
        }
    }
}