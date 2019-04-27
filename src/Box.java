public class Box {
    private static int count;
    private int number;

    public Box(){
        number = ++count;
    }


    public static int getCount() {
        return count;
    }

    public int getNumber(){
        return number;
    }

    public void print(){
        System.out.println("\t\tЯщик " + number);
    }

}
