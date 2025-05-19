public class Jeu {

    public static void main (String[] args) {
        Queen queen = new Queen();

        queen.row = 8;
        queen.column = 8;
        Position testPosition = new Position(7, 4);
        if (queen.isValidMove(testPosition))
        {
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }
    }
}
