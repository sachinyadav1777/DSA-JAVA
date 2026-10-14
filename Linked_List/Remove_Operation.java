package Linked_List;

public class Remove_Operation {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print() {
        if(head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void removeFirst() {
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return;
        }
        else if(size == 1) {
            head = tail = null;
            size=0;
        }
        head = head.next;
        size--;
    }
    public void removeLast() {
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return;
        }
        else if(size == 1) {
            head = tail = null;
            size=0;
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < size-2) {
            temp = temp.next;
            i++;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    public static void main(String[] args) {
        Remove_Operation ll = new Remove_Operation();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    }
}
