package list;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted " + data + " into linked list.");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty! Nothing to delete.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted " + data + " from linked list.");
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Value " + data + " not found in linked list.");
        } else {
            current.next = current.next.next;
            System.out.println("Deleted " + data + " from linked list.");
        }
    }

    public boolean search(int target) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == target) {
                System.out.println("Found " + target + " at position " + position + " in linked list.");
                return true;
            }
            current = current.next;
            position++;
        }
        System.out.println("Value " + target + " not found in linked list.");
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}