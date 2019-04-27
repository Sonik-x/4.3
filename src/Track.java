import java.util.ArrayList;

public class Track extends Accommodating {
    static ArrayList<Track> allTracks = new ArrayList<Track>();
    static final int CAPACITY = 12;
    private static int count;
    Container[] loadedContainers;

    public Track() {
        number = ++count;
        allTracks.add(this);
    }

    public static int getCount() {
        return count;
    }

    public int load(int boxesToLoad) {
        loadedContainers = new Container[CAPACITY];
        for (int i = 0; i < Math.min(Math.round((float) boxesToLoad / Container.CAPACITY + 0.5), CAPACITY); i++) {
            loadedContainers[i] = new Container();
            boxesToLoad = loadedContainers[i].load(boxesToLoad);
        }

        if (boxesToLoad > 0) {
            Track track = new Track();
            track.load(boxesToLoad);
        }
        return 0;
    }

    public void print() {
        System.out.println("Грузовик " + number + ":");
        for (Container container : loadedContainers) {
            if (container != null) {
                container.print();
            }
        }
    }

}

