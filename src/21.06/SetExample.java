import java.util.HashSet;
import java.util.Set;
public class SetExample {
    public static void main(String[] args) {
        //create a hashset
        Set<String> fruits = new HashSet<>();
        //add element
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Apple");//duplicate element are ignored
        //get size
        int size = fruits.size();
        System.out.println("Size of the set: " +size);
        //check if an element exists in the set
        boolean containApple = fruits.contains("Apple");
        System.out.println("Does the set contain 'Apple'?" + containApple);
        //interate over the element
        System.out.println("Element in the set: ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        //remove an element
        boolean removed = fruits.remove("Orange");
        System.out.println("Is orange removed? :" + removed);
        System.out.println("Updated set:" + fruits);
        //clear all element
        fruits.clear();
        System.out.println("Size of the set after clearing:" + fruits.size());

        //hashset Example
        System.out.println("///////////////////HashSet/////////////////");
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); //adding duplicate element

        //get size
        int sizeHashSet = numbers.size();
        System.out.println("Size of hashSet: " + sizeHashSet);
        //interate element of hashSet
        System.out.println("Element of the hashSet");
        for(int number:numbers){
            System.out.println(number);
        }

        // remove an element from hashSet
        boolean removedHashSet = numbers.remove(20);
        System.out.println("Is 20 element is removed? " + removedHashSet);
        System.out.println("Updated hashSet after remove: " + numbers);

        //Check if HashSet contains a specific element
        boolean contains = numbers.contains(10);
        System.out.println("Does HashSet contain 10? " + contains);
        //clear all element from hashSet
        numbers.clear();
        System.out.println("HashSet after clear: " + numbers);
    }
}
