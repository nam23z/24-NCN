public class Exercise9 {
    public static void main(String[] args) {

        //sum command line
        int a = 0;
        for(String arg : args){
            a = a + Integer.parseInt(arg);
        }
        System.out.println(a);
    }
}
