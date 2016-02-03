package solve.ll.problems;

import solve.ll.ds.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chetna.chaudhari on 03/02/16.
 */
public class CreateLinkedList {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 5, 3, 8, 9));
        LinkedList linkedList = new LinkedList();
        linkedList.createFrom(inputList);
        linkedList.printList();

        System.out.println();
        // insert 12 at the begining
        linkedList.insertAtFront(12);
        linkedList.printList();

        System.out.println();
        //append 15 to linkedlist
        linkedList.append(15);
        linkedList.printList();

        System.out.println();
        //insert 11 at 2nd position
        linkedList.insertAfter(linkedList.getHead(), 11);
        linkedList.printList();
    }
}
