import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        System.out.println("Введите число ящиков:");

        Track track = new Track();
        Scanner s = new Scanner(System.in);
        track.load(s.nextInt());
        for (Track tr : Track.allTracks) {
            tr.print();
        }

    }

}
