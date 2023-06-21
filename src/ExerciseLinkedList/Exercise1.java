import java.util.LinkedList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("mid"));

        insertHead(list, "head");
        insertTail(list, "Tail");
        System.out.println(list);
    }

    public static void insertHead(LinkedList<String> list, String value){
        list.addFirst(value);
    }
    public static void insertTail(LinkedList<String> list, String value){
        list.addLast(value);
    }
}

