package solve.arrays.problems;

import com.sun.tools.javac.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print the maximum sum of continuous subarray.
 * Using kadane's algorithm. Note this can also be solved by Divide and conquers, but this is more efficient.
 */
public class MaximumSumSubArray {
    int findMaximumSumSubarray(List<Integer> list) {
        int maxSoFar = 0;
        int  maxEndingHere = 0;
        for(int index=0; index < list.size(); index++) {
            maxEndingHere = maxEndingHere + list.get(index);
            if(maxEndingHere < 0)
                maxEndingHere = 0;
            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3));
        MaximumSumSubArray maximumSumSubArray = new MaximumSumSubArray();
        int output1 = maximumSumSubArray.findMaximumSumSubarray(input);
        System.out.println(output1);
        Assert.check(output1 == 7);

        List<Integer> input2 = new ArrayList<Integer>(Arrays.asList(2,4,-5,6,8,12,-5,3,-4,49,45,-11,2,99));
        int output2  = maximumSumSubArray.findMaximumSumSubarray(input2);
        System.out.println(output2);
        Assert.check(output2 == 205);


    }
}
