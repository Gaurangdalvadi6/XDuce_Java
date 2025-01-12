package collectionExample;
// 15/4/2024
import java.util.LinkedList;
import java.util.Queue;

// queue follows First In First Out(FIFO)

public class QueueExample {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<Integer>();
	q.offer(5);  // offer is used for adding element
	q.offer(9);
	q.offer(11);
	
	System.out.println(q);
	System.out.println(q.poll()); // poll is using removing element
	System.out.println(q);
	System.out.println(q.peek());  // peek is used for which element is next going to remove
}
}
