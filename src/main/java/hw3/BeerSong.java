package hw3;

public class BeerSong
{
    public static void main (String[] args) {
        for (int beerNum = 99; beerNum >= 0; beerNum--) {
            if (beerNum > 1) {
                System.out.println(beerNum + " bottles of beer on the wall, " + beerNum + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (beerNum - 1) + " bottles of beer on the wall.");
            } else if (beerNum == 1) {
                System.out.println(beerNum + " bottle of beer on the wall, " + beerNum + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + (beerNum - 1) + " bottle of beer on the wall.");
            } else if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
