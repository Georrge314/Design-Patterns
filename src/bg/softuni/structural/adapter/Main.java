package bg.softuni.structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(90);

        RoundShape roundPeg = new RoundPeg(50);
        System.out.println(hole.fits(roundPeg));

        SquareShape squarePeg = new SquarePeg(80);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(adapter));
    }
}
