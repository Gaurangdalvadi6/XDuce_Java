package collectionExample;
// 15/4/2024
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(40);
		pq.offer(5);  // offer is used for adding element
		pq.offer(9);
		pq.offer(11);
		
		System.out.println(pq);
		
		
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
