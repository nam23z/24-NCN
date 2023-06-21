import java.util.Arrays;

public class ExerciseString {
    public static void main(String[] args) {
        // String a = "david";
        
        // for(int i = 0; i< a.length(); i++){
        //         System.out.println(a.charAt(i));
        //     }
        // dedupe("david");
            String ar = Arrays.toString(dedupe("nullu"));
            System.out.println(ar);
            System.out.println(findChar("david truong", 0));
    }
    //1
    public static String[] dedupe(String str){
        String stri = "";
        for(int i = 0; i< str.length(); i++){
            for(int j = 1; j< str.length(); j++){
                if(stri.contains(String.valueOf(str.charAt(i)))){
                    break;
                }
                if(str.charAt(i) == str.charAt(j)){
                    stri+= String.valueOf(str.charAt(i));
                }
            }
        }
        return stri.split("");
    }
    //2
    public static char findChar(String str, int i){
        return str.charAt(i);
    }
}