import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> genres = new ArrayList<>();

        genres.add("Pop");
        genres.add("R&B");
        genres.add("Hip Hop");
        genres.add("Classical");
        genres.add("Show Tunes");
        genres.add("Jazz");
        genres.add("Indie");

        Random random = new Random();
        String randomGenre = genres.get(random.nextInt(genres.size()));
        System.out.println(randomGenre);

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Would you like song recommendations from the genre? (Answer y or n)");
        String songRecs = scanner.nextLine();

        if (songRecs.equals("y")){
            if (randomGenre.equals("Pop")){
                for songs in popSongs{
                    System.out.println(songs);
                }
            } else if (randomGenre.equals("Show Tunes")){
                for songs in showTunesSongs{
                    System.out.println(songs);
                }
            } else if (randomGenre.equals("Indie")){
                for songs in indieSongs{
                    System.out.println(songs);
                }
            }
        }else{
            return;
        }
    }

}