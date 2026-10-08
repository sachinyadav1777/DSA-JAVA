package Linked_List;

public class Detect_Loop_And_Remove_In_LL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static Node head;
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            System.out.println("No cycle present in the linked list");
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3);
        head.next.next = temp;
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
