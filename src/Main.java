
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();
        String cont = "";
//        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter name of an artist.");
//            String artist = "Prince";//modify program to prompt user for an artist
                String artist = user.nextLine();
//            String title = "Purple Rain"; //modify program to prompt user for a title
                System.out.println("Next, enter the song title.");
                String title = user.nextLine();
                Song s = new Song();
                s.setArtist(artist);
                s.setTitle(title);
                songs.add(s);
            }

            //print all the songs in the array list
            for (Song s : songs) {
                System.out.println(s.getDisplay());
            }

            //look for blue and print if found
            String titleToFind = "Purple Rain";
            for (Song s : songs) {
                if (s.getTitle().equals(titleToFind)) {
                    System.out.printf("I found %s \r\n", s.getDisplay()); // \r makes the cursor jump to the first column
                }
            }
//            System.out.println("Would you like to add another album?");
//            cont = user.nextLine();
//        }while(cont.equalsIgnoreCase("yes"));
    }
}