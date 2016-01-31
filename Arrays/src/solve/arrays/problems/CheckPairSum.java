package solve.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of n numbers and another number x, check if there exists two elements whose sum is equal to x.
 */
public class CheckPairSum {
    boolean checkIfPairSumExists(List<Integer> list, int sum) {
        Collections.sort(list);
        int left = 0;
        int right = list.size() - 1;
        while(left < right) {
            if(list.get(left) + list.get(right) == sum) {
                return true;
            } else if ( list.get(left) + list.get(right) < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 0, 45, 6, 16, -8));
        int sum = 16;
        CheckPairSum checkPairSum = new CheckPairSum();
        if(checkPairSum.checkIfPairSumExists(input, sum)) {
            System.out.println("There exists a pair of numbers whose sum matches to " + sum);
        } else {
            System.out.printf("Pair does not exist.");
        }
    }
}
