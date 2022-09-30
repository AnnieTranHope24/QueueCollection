package collection;

public class DemoClass {
	public static void main(String[] args) {
		LinkedQueue<Integer> queue = new LinkedQueue<>();
		queue.enqueue(12);
		System.out.println(queue);
		queue.enqueue(26);
		System.out.println(queue);
		queue.enqueue(35);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.enqueue(12);
		System.out.println(queue);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

	}
}
