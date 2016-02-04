package solve.ll.ds;

import java.util.List;

/**
 *
 */
public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }

    public void insertAtFront(int input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int input) {
        if(prevNode == null) {
            System.out.println("Invalid previous node. it cannot be null");
            return;
        }
        Node newNode = new Node(input);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int input) {
        Node newNode = new Node(input);
        Node temp = head;
        if(temp == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void createFrom(List<Integer> inputList) {
        Node temp = new Node(inputList.get(0));
        head = temp;
        for (int index=1; index < inputList.size(); index++) {
            Node newNode = new Node(inputList.get(index));
            temp.next = newNode;
            temp = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public void deleteNode(Node toBeDeleted) {
        Node temp = head;
        if(temp == toBeDeleted) {
            head = temp.next;
            return;
        }
        while(temp.next != null && temp.next != toBeDeleted) {
            temp = temp.next;
        }
        if(temp.next == null) {
            return;
        }
        temp.next = toBeDeleted.next;
    }

    public void deleteFirstOccurrence(int input) {
        Node temp = head, prevNode = null;
        if(temp != null && temp.data == input) {
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != input) {
            prevNode = temp;
            temp = temp.next;
        }

        if(temp == null) {
            return;
        }

        prevNode.next = temp.next;
    }

    public void deleteAtPosition(int position) {
        Node temp = head, prevNode = null;
        while(temp != null && position > 0) {
            prevNode = temp;
            temp = temp.next;
            position--;
        }
        if(temp == null) {
            return;
        }
        prevNode.next = temp.next;
    }

    public int size() {
        Node temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void swapNodes() {
        Node first = head;
        if(first == null || first.next == null) {
            return;
        }
        Node second = head.next;
        while(first.next != null && second.next != null ) {
            int tempData = first.data;
            first.data = second.data;
            second.data = tempData;
            first = second.next;
            second = first.next;
        }
    }
}