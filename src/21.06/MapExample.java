import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //create map to store student name and their corresponding id
        System.out.println("///////////////Map//////////////////");
        Map<String, Integer> studentIds = new HashMap<>();
        //add element to the map
        studentIds.put("John", 101);
        studentIds.put("David", 102);
        studentIds.put("Peter", 103);
        studentIds.put("David", 104);
        //get size of the map
        int size = studentIds.size();
        System.out.println("Size of map: " + size);
        //Access element in the map
        int johnId = studentIds.get("John");
        System.out.println("John's ID: "+ johnId);
        //check if the map contains a specific key
        boolean containsPeter = studentIds.containsKey("Peter");
        System.out.println("Does map contain peter? " + containsPeter);
        //interate over the element in the map
        System.out.println("Element in map: ");
        for(Map.Entry<String, Integer> entry : studentIds.entrySet()){
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("Name: " + name + " "+ "ID: " + id);
        }
        //remove an element in the map
        Integer removedId = studentIds.remove("David");
        System.out.println("Removed Id: " + removedId);
        System.out.println("Updated map: " + studentIds);
        //clear all element from map
        studentIds.clear();
        System.out.println("Size of map after clearing: " + studentIds.size());
        
        //HashMap Example
        System.out.println("////////////////////HashMap////////////////");
        Map<String,Integer> studentMap = new HashMap<>();

        //add element to hashMap
        studentMap.put("Alice", 1001);
        studentMap.put("Bob", 1002);
        studentMap.put("Charlie", 1003);

        //get size of the hashMap
        int sizeHashMap = studentMap.size();
        System.out.println("Size of the HashMap: "+ sizeHashMap);

        //Access element in hashMap
        int aliceId = studentMap.get("Alice");
        System.out.println("Alice's ID: " + aliceId);

        //Check if the HashMap contains a specific key
        boolean containsKey = studentMap.containsKey("Bob");
        System.out.println("Does HashMap contains key 'Bob'? " + containsKey);

        //Check if the HashMap contains a specific value
        boolean containsValue = studentMap.containsValue(1004);
        System.out.println("Does HashMap contains value '1004'? "+ containsValue);

        //interate over the entries in the hashMap
        System.out.println("Element in the HashMap: ");
        for(Map.Entry<String, Integer> entry : studentMap.entrySet()){
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("Name: " + name +"Id: "+id);
        }
        //Remove an entry from the hashMap
        Integer removeID = studentMap.remove("Bob");
        System.out.println("Removed ID for 'Bob': "+removeID);
        System.out.println("Updated hashMap after remove: "+studentMap);

        //clear all entries
        studentMap.clear();
        System.out.println("Size of the HashMap after clearing: " + studentMap.size());
    }
}
