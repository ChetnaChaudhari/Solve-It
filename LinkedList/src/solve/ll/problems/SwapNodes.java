package solve.ll.problems;

import solve.ll.ds.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chetna.chaudhari on 04/02/16.
 */
public class SwapNodes {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 5, 6,7, 8, 9));
        linkedList.createFrom(input);
        linkedList.swapNodes();
        linkedList.printList();
    }
}
