package collectionExample;
// 15/4/2024
import java.util.ArrayDeque;

public class DequeExample {
	public static void main(String[] args) {
		ArrayDeque<Integer> aq = new ArrayDeque<Integer>();
		
		aq.offer(55);
		aq.offerFirst(54);
		aq.offerLast(56);
		aq.offer(40);
		
		System.out.println(aq);
		
		System.out.println(aq.peek());
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());
		
		System.out.println(aq.poll());
		System.out.println(aq);

		System.out.println(aq.pollFirst());
		System.out.println(aq);
		
		System.out.println(aq.pollLast());
		System.out.println(aq);
	}
}
