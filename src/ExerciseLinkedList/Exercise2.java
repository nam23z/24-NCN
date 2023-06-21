import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        
        arr.add("a");
        arr.add("b");
        arr.add("c");

        System.out.println(arr);
        removed(arr, 0);
        System.out.println(arr);
    }

    public static void removed(LinkedList<String> arr, int value){
        arr.remove(value);
    }
}
