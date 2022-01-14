package SimpleBoksGame;

public class Main {
    public static void main(String[] args) {
        Fighter rocky = new Fighter("Rocky Balboa",74,10,100,74);
        Fighter ivan = new Fighter("Ivan Drago",85,20,150,35);

        Ring match1 = new Ring(rocky,ivan,70,85);
        match1.run();

    }
}
