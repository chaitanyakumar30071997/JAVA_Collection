package List_Set_Map;
import java.util.*;

public class Demo {
	
	

	

	    public static void main(String[] args) {
	        
	        // 1. List: ArrayList
	        System.out.println("=== List: ArrayList ===");
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        list.add("Mango");

	        System.out.println("List: " + list);
	        System.out.println("Size of list: " + list.size());
	        System.out.println("Element at index 2: " + list.get(2));
	        list.remove("Banana");
	        System.out.println("After removing 'Banana': " + list);

	        // 2. Set: HashSet
	        System.out.println("\n=== Set: HashSet ===");
	        Set<String> set = new HashSet<>();
	        set.add("John");
	        set.add("Jane");
	        set.add("Doe");
	        set.add("John");  // Duplicate, won't be added to set

	        System.out.println("Set: " + set);
	        System.out.println("Does set contain 'John'? " + set.contains("John"));
	        set.remove("Doe");
	        System.out.println("After removing 'Doe': " + set);

	        // 3. Map: HashMap
	        System.out.println("\n=== Map: HashMap ===");
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");
	        map.put(4, "Four");

	        System.out.println("Map: " + map);
	        System.out.println("Value for key 3: " + map.get(3));
	        map.put(3, "Updated Three");
	        System.out.println("After updating key 3: " + map);
	        map.remove(2);
	        System.out.println("After removing key 2: " + map);

	        // 4. Queue: LinkedList (as Queue)
	        System.out.println("\n=== Queue: LinkedList ===");
	        Queue<String> queue = new LinkedList<>();
	        queue.offer("A");
	        queue.offer("B");
	        queue.offer("C");

	        System.out.println("Queue: " + queue);
	        System.out.println("Peek (front of queue): " + queue.peek());
	        System.out.println("Poll (remove front of queue): " + queue.poll());
	        System.out.println("After polling: " + queue);

	        // 5. Deque: LinkedList (as Deque)
	        System.out.println("\n=== Deque: LinkedList ===");
	        Deque<String> deque = new LinkedList<>();
	        deque.offerFirst("First");
	        deque.offerLast("Last");
	        deque.offerFirst("New First");

	        System.out.println("Deque: " + deque);
	        System.out.println("Poll First: " + deque.pollFirst());
	        System.out.println("Poll Last: " + deque.pollLast());
	        System.out.println("After polling: " + deque);

	        // 6. Stack: Stack
	        System.out.println("\n=== Stack: Stack ===");
	        Stack<String> stack = new Stack<>();
	        stack.push("A");
	        stack.push("B");
	        stack.push("C");

	        System.out.println("Stack: " + stack);
	        System.out.println("Peek (top of stack): " + stack.peek());
	        System.out.println("Pop (remove top of stack): " + stack.pop());
	        System.out.println("After popping: " + stack);

	        // 7. Iterating over collections
	        System.out.println("\n=== Iterating over Collections ===");

	        // Iterating List using for-each loop
	        System.out.println("Iterating List with for-each:");
	        for (String item : list) {
	            System.out.println(item);
	        }

	        // Iterating Set using Iterator
	        System.out.println("Iterating Set with Iterator:");
	        Iterator<String> setIterator = set.iterator();
	        while (setIterator.hasNext()) {
	            System.out.println(setIterator.next());
	        }

	        // Iterating Map using for-each loop
	        System.out.println("Iterating Map with for-each:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " => " + entry.getValue());
	        }
	    }
	}



