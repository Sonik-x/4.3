public class Container extends Accommodating {
    static final int CAPACITY = 27;
    static int count;
    Box[] loadedBoxes;

    public Container() {
        number = ++count;
    }

    public static int getCount() {
        return count;
    }

    public int load(int boxesToLoad) {
        loadedBoxes = new Box[CAPACITY];
        int a = boxesToLoad;
        for (int i = 0; i < Math.min(a, CAPACITY); i++) {
            loadedBoxes[i] = new Box();
            boxesToLoad--;
        }
        return boxesToLoad;
    }

    public void print() {
        System.out.println("\tКонтейнер " + number + ":");
        for (Box box : loadedBoxes) {
            if (box != null) {
                box.print();
            }
        }
    }


}
