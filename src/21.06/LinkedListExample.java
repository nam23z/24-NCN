import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //create linkList
        LinkedList<String> names = new LinkedList<>();

        //add element to linkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        //get size of the LinkedList
        int size = names.size();
        System.out.println("Size of LinkedList: " + size);

        //Access element in LinkedList
        String first = names.getFirst();
        String last = names.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        //modify element in linkedList
        names.set(1, "Alicia");
        System.out.println("Modified LinkedList: " + names);

        //interate over the element in linkedList
        System.out.println("Element in LinkedList: ");
        for(String name : names){
            System.out.println(name);
        }

        //remove an element from the LinkedList
        boolean removed = names.remove("Charlie");
        System.out.println("Is Charlie removed? " + removed);
        System.out.println("Updated LinkedList after remove: " + names);

        //check if the linkedList contains a specific element
        boolean contains = names.contains("Bob");
        System.out.println("Does linkesList contains Bob? " + contains);

        //clear all element from the LinkedList

        names.clear();
        System.out.println("LinkedList after clear: " + names);
    }
}
