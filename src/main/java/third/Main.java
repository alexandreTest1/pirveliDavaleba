package third;

public class Main {
    public static void main(String[] args) {
        checkNumber(-1);
    }
    static void checkNumber(int x){
        if (x > 0 ){
            System.out.println("დადებითი");
        }
        else if (x < 0){
            System.out.println("უარყოფითი");
        }
        else{
            System.out.println("ნული");
        }
    }
}
