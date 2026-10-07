package Linked_List;

import java.util.Scanner;

public class Search_Operation {
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
//    Iterative Search method
    public int Search(int key) {
        Node temp = head;
        int i = 0;
        while (i < size && temp != null) {
            if(temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head,key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search_Operation ll = new Search_Operation();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int idx = ll.recSearch(key);
        if(idx >= 0) {
            System.out.println("Key found at index = "+idx);
        }
        else {
            System.out.println("Key not found in linked list");
        }
    }
}
