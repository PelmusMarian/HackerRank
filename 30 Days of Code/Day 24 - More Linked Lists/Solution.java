package solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static Node removeDuplicates(Node head) {
        Node start = head;

        while (start != null) {
            if (start.next != null) {

                Node current = start.next;
                while (current != null) {
                    if (start.data == current.data) {
                        start.next = current.next;
                    }
                    current = current.next;
                }
            }

            start = start.next;
        }
        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
