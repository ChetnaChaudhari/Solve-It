package solve.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.
 * And the rightmost element is always a leader.
 * For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 */
public class LeadersInArray {
    private void printLeaders(List<Integer> input) {
        int index = input.size() - 1;
        int maxSoFar = input.get(index);
        System.out.println(maxSoFar);
        index--;
        while(index > 0) {
            if(maxSoFar < input.get(index)) {
                maxSoFar = input.get(index);
                System.out.println(maxSoFar);
            }
            index--;
        }
    }

    public static void main(String[] args) {
        LeadersInArray leadersInArray = new LeadersInArray();
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(16, 17, 5, 3, 2, 4));
        leadersInArray.printLeaders(input);
    }
}
