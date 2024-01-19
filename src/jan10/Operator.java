package jan10;

public class Operator {
    public static void main(String[] args){
        int x = 20;
                int y = 20;
                int z = 19;



        System.out.println( x < y && x>=z); // False
        System.out.println(x < y && y>z ); // False
        System.out.println( x == y || x>z);//True
        System.out.println(x < y && x>=z);//False
        System.out.println(x <= y || x>z);//True
        System.out.println( x < y && x>=z);//False

    }
}
