import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //create a list of string
        List<String> fruits = new ArrayList<>();
        //add element to list fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        //get size of the list
        int size = fruits.size();
        System.out.println("Size of the List: " + size);
        //access element in the list
        String firstFruits = fruits.get(0);
        System.out.println("First fruits: " + firstFruits);
        //Modify element in the list
        fruits.set(1, "Mango");
        System.out.println("Modified list: "+ fruits);
        //Interate over the element in the list
        System.out.println("Element in the list:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        //remove an element from the list
        boolean removed = fruits.remove("Orange");
        System.out.println("Is orange removed?" + removed);
        System.out.println("Updated list: "+ fruits);
        //check if the list contains a specific element
        boolean contains = fruits.contains("Banana");
        System.out.println("Does the list contains 'Banana'?" + contains);
        //clear all element from the list
        fruits.clear();
        System.out.println("Size of the list after clearing: " + fruits.size());

        //ArrayList Excample
        System.out.println("/////////////////ArrayList//////////////////");

        List<Integer> numbers = new ArrayList<>();

        //add element
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //get size of the arraylist
        int sizeArrayList = numbers.size();
        System.out.println("Size of arrayList: " + sizeArrayList);

        //Access element in the arrayList
        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        //Modify element in the arrayList
        numbers.set(1, 25);
        System.out.println("Modified ArrayList: "+ numbers);

        //Interate over the arrayList
        System.out.println("Element in the ArrayList: ");
        for(int number: numbers){
            System.out.println(number);
        }

        //remove an element from the arrayList
        boolean removedArraylist = numbers.remove(Integer.valueOf(30));
        System.out.println("Is 30 removed? " + removedArraylist);
        System.out.println("Updated ArrayList after remove: " + numbers);

        //Check if array List contains a specific element
        boolean containsArrayList = numbers.contains(20);
        System.out.println("Does the ArrayList contain 20? " +containsArrayList);

        //clear all element from the arrayList
        numbers.clear();
        System.out.println("size of the arrayList after clearing: " + numbers.size());
    }
}
