import java.util.LinkedList;
import java.util.List;

public class Exercise4Linked {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>(List.of("a","b","c"));
        reversed(arr);
    }
    public static void reversed(LinkedList<String> arr){
        LinkedList<String> arr2 = new LinkedList<>();
        for(String ar : arr){
            arr2.addFirst(ar);
        }
        System.out.println(arr2);
    }
}
