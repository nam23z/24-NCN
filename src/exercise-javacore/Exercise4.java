public class Exercise4 {

    public static void main(String[] args) {
        String str = "String";
        char[] arrChar = str.toCharArray();
        String str2 = String.copyValueOf(arrChar);

        for(char c : arrChar){
            System.out.println(c);
        }
        System.out.println(str2);
    }
    
}
