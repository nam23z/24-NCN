import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise3Linked {
    public static void main(String[] args) {
        LinkedList<String> left = new LinkedList<>(List.of("a","b","c"));
        ArrayList<String> Right = new ArrayList<>();
        migrate(left, Right);
        System.out.println(left);
        System.out.println(Right);
    }
    public static void migrate(LinkedList<String> left, ArrayList<String> right){
        right.addAll(left);
        left.clear();
    }
}
