import java.util.LinkedList;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>(List.of("a","b","c"));
        replace(arr, 0, "x");
        System.out.println(arr);
    }
    public static void replace(LinkedList<String> arr,int index, String value){
        arr.set(index, value);
    }
}
