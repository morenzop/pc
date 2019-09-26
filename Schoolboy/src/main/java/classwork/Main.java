package classwork;

public class Main {
    public static void main(String[] args) {


        System.out.println(gimmeDat(5,9,3));
    }

    public static void oneToTen() {
        for (int x=10; x>0; x--){
            System.out.println(x);
        }
    }
public static void tenToOne(int y){
        for (int x=y; x>0; x--){
            System.out.println(x);
        }
}
public static void squareNum(int v){
        for(int x=v; x>0; x--){
            System.out.println(x*x);
        }
}
public static void squareDown(int[] b){
        for (int x=0; x<b.length; x++){
            System.out.println(Math.sqrt(b[x]));
        }
}
public static int gimmeDat(int a, int b, int c){
        return (a*b)+c;
}

}