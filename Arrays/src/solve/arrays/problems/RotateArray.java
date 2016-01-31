package solve.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Rotate an array by d elements
 *  Input:  arr[] = [1, 2, 3, 4, 5, 6, 7]
    d = 2
    Output: arr[] = [3, 4, 5, 6, 7, 1, 2]
 */
public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        List<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int d = 4;
        System.out.println(rotateArray.rotateByD(input1, d));
    }

    private List<Integer> rotateByD(List<Integer> input1, int d) {
        input1 = reverse(input1, 0, d-1);
        input1 = reverse(input1, d, input1.size()-1);
        input1 = reverse(input1, 0, input1.size()-1);
        return input1;
    }

    private List<Integer> reverse(List<Integer> integers, int start, int end) {
        while(start < end) {
            integers = swap(integers, start, end);
            start++;
            end--;
        }
        return integers;
    }

    private List<Integer> swap(List<Integer> integers, int start, int end) {
        int buffer;
        buffer = integers.get(start);
        integers.set(start, integers.get(end));
        integers.set(end, buffer);
        return integers;
    }
}
