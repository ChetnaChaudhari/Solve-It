package solve.ll.problems;

import solve.ll.ds.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 */
public class DeleteLinkedList {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 5, 3, 8, 9));
        LinkedList linkedList = new LinkedList();
        linkedList.createFrom(inputList);
        linkedList.printList();
        System.out.println(linkedList.size());

        System.out.println();
        //Delete a node with value = 3
        linkedList.deleteFirstOccurrence(3);
        linkedList.printList();
        System.out.println(linkedList.size());

        System.out.println();
        //Delete a node at 2 position
        linkedList.deleteAtPosition(2);
        linkedList.printList();
        System.out.println(linkedList.size());

        System.out.println();
        //Delete head element
        linkedList.deleteNode(linkedList.getHead());
        linkedList.printList();
        System.out.println(linkedList.size());

        System.out.println();
        System.out.println(linkedList.size());
    }
}
