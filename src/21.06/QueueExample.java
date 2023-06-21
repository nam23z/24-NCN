import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //create a queue using linkedList
        Queue<String> queue = new LinkedList<>();
        //add element
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        //get size of the queue
        int size = queue.size();
        System.out.println("Size of queue:" + size);
        //check if queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty:" + isEmpty);
        // Access element at the front of queue without remove it
        String frontElement = queue.peek();
        System.out.println("Front element of the queue" + frontElement);
        //process element in the queue (remove them)
        while(!queue.isEmpty()){
            String element = queue.poll();
            System.out.println("Processing element: "+element);
        }
        //Check the size of the queue after processing
        System.out.println("Size of the queue after processing" + queue.size());
    }
}