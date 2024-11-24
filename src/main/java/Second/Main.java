package Second;

public class Main {
    public static void main(String[] args) {
        hasTeen(1,2,13);
    }
    static void hasTeen(int x, int y, int z) {
        //System.out.println((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19));
        if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
