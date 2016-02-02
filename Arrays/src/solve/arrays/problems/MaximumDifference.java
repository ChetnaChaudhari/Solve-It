package solve.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array arr[] of integers,
 * find out the difference between any two elements such that larger element appears after the smaller number in arr[].
 */
public class MaximumDifference {
    public static void main(String[] args) {
        MaximumDifference maximumDifference = new MaximumDifference();
        List<Integer> input1 = new ArrayList<>(Arrays.asList(2, 3, 10, 6, 4, 8 ,1));
        System.out.println(maximumDifference.maxDiff(input1));

        List<Integer> input2 = new ArrayList<>(Arrays.asList(7, 3, 5, 6, 3, 2));
        System.out.println(maximumDifference.maxDiff(input2));
    }

    private int maxDiff(List<Integer> input1) {
        int maxDiff, minSoFar;
        minSoFar = input1.get(0);
        maxDiff = input1.get(1) - input1.get(0);
        for(int index= 1; index < input1.size(); index++) {
            if(input1.get(index) - minSoFar > maxDiff) {
                maxDiff = input1.get(index) - minSoFar;
            }
            if(input1.get(index) < minSoFar) {
                minSoFar = input1.get(index);
            }
        }
        return maxDiff;
    }
}
