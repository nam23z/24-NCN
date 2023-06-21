import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample{
    public static void main(String[] args) {
        //create a collection ArrayList of Integers
        Collection<Integer> numbers = new ArrayList<>();
        
        //add element to the collection
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        //get the size of the collection
        int size = numbers.size();
        System.out.println("Size of the collection" + size);

        //check if collection is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the collection empty? " + isEmpty);

        //interate over the element in the collection
        System.out.println("Element in collection");
        for(int number : numbers){
            System.out.println(number);
        }
        //remove an element from the collection
        boolean removed = numbers.remove(10);
        System.out.println("is 20 remove? "+ removed);

        //clear all element from the collection
        numbers.clear();
        System.out.println(numbers);
    }
}