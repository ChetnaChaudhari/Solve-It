package solve.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 */
public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(0,1,0,0,1,1,0,1));
        System.out.println(segregate(input));
    }

    private static List<Integer> segregate(List<Integer> input) {
        int left = 0;
        int right = input.size()-1;
        while(left<=right) {
            if (input.get(left) == 1 && input.get(right) == 0) {
                input.set(left, 0);
                input.set(right, 1);
            }
            if(input.get(left) == 0) {
                left++;
            } else if(input.get(right) == 1) {
                right--;
            }
        }
        return input;
    }
}
