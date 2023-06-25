class Queue {
    private Node front;  // Reference to the front of the queue
    private Node rear;   // Reference to the rear of the queue

    private class Node {
        int data;
        Node next;

        public Node(int item) {
            data = item;
            next = null;
        }
    }

    // Constructor to initialize an empty queue
    public Queue() {
        front = null;
        rear = null;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }

    // Method to enqueue (insert) an element into the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method to dequeue (remove) an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;  // or throw an exception
        }

        int dequeuedElement = front.data;
        front = front.next;

        // If front becomes null after dequeue, rear should also be set to null
        if (front == null) {
            rear = null;
        }

        return dequeuedElement;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;  // or throw an exception
        }
        return front.data;
    }

    // Method to get the size of the queue
    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class MQ2Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Size of queue: " + queue.size());

        System.out.println("Front element: " + queue.peek());

        int dequeuedElement = queue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
