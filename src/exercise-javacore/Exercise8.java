
public class Exercise8 {
    public static void main(String[] args) {
        isLeapYear(2000);
        printEvenNumber(10);
        pyramid(5);
        mul( new int[][] {{1,2}, {1,2}}, new int[][] {{2,1},{2,1}});
    }

    static void printEvenNumber (int n){
        for(int i = 0; i <= n; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    static void isLeapYear(int Year){
                if(Year % 4 == 0){
            System.out.println(Year + "is Leap Year");
        }else{
            System.out.println(Year + "is not Leap Year");
        }
    }

    static void pyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void mul(int[][] x, int[][] y){
        for(int i = 0; i <x[0].length; i++){
            System.out.print("[");
            for(int j =0; j<x.length; j++){
                System.out.print(x[i][j]);
            }
            System.out.println("]");
        }
    }
}
