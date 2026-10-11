package queue;

public class CustomQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued " + value + " to queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Error: Cannot dequeue from an empty queue!");
            return;
        }
        System.out.println("Dequeued " + queue[front] + " from queue.");
        front = (front + 1) % capacity;
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Error: Queue is empty!");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (Front to Rear): ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}