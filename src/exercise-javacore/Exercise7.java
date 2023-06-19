import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner compare = new Scanner(System.in);
        System.out.print("X: ");
        Integer x = compare.nextInt();
        System.out.print("Y: ");
        Integer y = compare.nextInt();
        if(x < y){
            System.out.println("-1");
        }else if(x == y){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
