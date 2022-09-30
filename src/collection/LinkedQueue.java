package collection;

public class LinkedQueue<E> {
	private Node<E> front;
	private Node<E> rear;
	private int size;

	public LinkedQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(E val) {
		// Enqueue at the rear
		Node<E> newNode = new Node<>(val);
		if (!empty()) {
			rear.setNext(newNode);
			rear = newNode;
		} else {
			rear = newNode;
			front = newNode;
		}
		size++;
	}

	public E dequeue() {
		// Dequeue from the front of the linked structure
		E toBeReturned = null;
		try {
			if (!empty()) {
				if (size != 1) {
					toBeReturned = front.getVal();
					front = front.getNext();
					size--;
					return toBeReturned;
				} else {
					toBeReturned = front.getVal();
					front = null;
					rear = null;
				}
				size--;

			} else {
				throw new EmptyQueueException();
			}
		}catch(EmptyQueueException e) {
			System.out.println("Queue is empty!");
		}
			
		

		return toBeReturned;
	}

	public E peek() {
		if(!empty()) {
			return front.getVal();
		}
		else {
			throw new EmptyQueueException();
		}

	}

	public boolean empty() {
		return size==0;
	}

	public int size() {
		return size;
	}
	public String toString() {
		Node<E> copy = front;
		String queueContents = "";
		while(copy!= null) {
			queueContents = queueContents + copy.getVal() + " ";
			copy = copy.getNext();
		}
		return queueContents;
	}

}
