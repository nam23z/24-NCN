import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        //create element to list
        System.out.println("add");
        for(int i = 1; i<=20; i++){
            list.add(i);
        }
        System.out.println("Loop 1");
        for(int lis: list){
            System.out.println(lis);
        }
        System.out.println("loop 2");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Loop 3");
        list.forEach((e) -> {
            System.out.println(e);
        });
        System.out.println("Loop 4");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i);
        }
        //get first child and last child
        System.out.println("first child: "+getFirst(list));
        System.out.println("Last child: "+getLast(list));
        //insert to head
        insertHead(list, 0);
        list.forEach((e)-> {
            System.out.println(e);
        });
        //exercise 4 migrate
        List<Integer> list2 = new ArrayList<>();
        for(int i= 22; i < 25; i++){
            list2.add(i);
        }
        migrate(list, list2);
        // exercise 5 transform
        List<String> listString = new ArrayList<>();
        listString.add("a");
        listString.add("b");
        listString.add("c");
        transform(listString);
        System.out.println(listString);
    }
    public static Object getFirst(List<Integer> list){
        return list.get(0);
    }
    public static Object getLast(List<Integer> list){
        return list.get(list.size()-1);
    }
    public static void insertHead(List<Integer> list, Integer value){
        list.add(0,value);
    }
    public static void insertTail(List<Integer> list, Integer value){
        list.add(value);
    }
    public static void migrate(List<Integer> left, List<Integer> right){
        right.addAll(left);
        System.out.println(right.toString());
        left.clear();
        System.out.println(left.toString());
    }
    public static void transform(List<String> list){
        for(int i = 0; i< list.size(); i++){
            list.set(i,String.valueOf(i));
        }
    }
}
