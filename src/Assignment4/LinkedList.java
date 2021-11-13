package Assignment4;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class ThreadSafeLinkedList {

    private Node head;
    private int size;

    public ThreadSafeLinkedList() {
        this.size = 0;
        head = null;
    }

    public void addAtPosition(int index, int element){
        try {
            synchronized (this) {
                Node newNode = new Node(element);
                if (index == 0) {
                    newNode.next = this.head;
                    this.head = newNode;
                    this.size++;
                    return;
                }
                Node copyNode = this.head;
                while (index > 1) {
                    copyNode = copyNode.next;
                    index--;
                }
                Node tempNode = copyNode.next;
                copyNode.next = newNode;
                newNode.next = tempNode;
                this.size++;
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid array position for adding- " + index);
            return;
        }
    }

    public void removeAtPosition(int index){
        try {
            synchronized (this) {
                Node copyNode = this.head;
                while (index > 1) {
                    copyNode = copyNode.next;
                    index--;
                }
                if (copyNode.next != null && copyNode.next.next != null) {
                    copyNode.next = copyNode.next.next;
                    this.size--;
                    return;
                }
                if (copyNode.next != null) {
                    copyNode.next = null;
                    this.size--;
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid array position for removing- " + index);
            return;
        }
    }

    public int getFirst() {
        synchronized (this) {
            return this.head.data;
        }
    }

    public int getLast() {
        synchronized (this) {
            Node copyNode = this.head;
            while (copyNode.next != null) {
                copyNode = copyNode.next;
            }
            return copyNode.data;
        }
    }

    public int size() {
        synchronized (this) {
            return this.size;
        }
    }
}

public class LinkedList {
    public static void main(String[] args) {
        ThreadSafeLinkedList linkedList = new ThreadSafeLinkedList();
        linkedList.addAtPosition(0,10);
        linkedList.addAtPosition(1,20);
        linkedList.addAtPosition(2,30);
        linkedList.addAtPosition(6,30);
        System.out.println("First element of Linked list: " + linkedList.getFirst());
        System.out.println("Last element of Linked list: " + linkedList.getLast());
        System.out.println("Size of Linked list: " + linkedList.size());
        linkedList.removeAtPosition(2);
        linkedList.removeAtPosition(10);
        System.out.println("Last element of Linked list: " + linkedList.getLast());
        System.out.println("Size of Linked list: " + linkedList.size());
    }
}