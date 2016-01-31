package solve.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find an element in a sorted and rotated array of integers.
 */
public class SearchInSortedAndRotatedArray {
    int search(List<Integer> inputArray, int elementToSearch) {
        return searchInSortedRotated(inputArray, elementToSearch, 0, inputArray.size()-1);
    }

    private int searchInSortedRotated(List<Integer> inputArray, int elementToSearch, int left, int right) {
        if(left > right)
            return -1;
        int mid = (left + right) / 2;
        if(inputArray.get(mid) == elementToSearch)
            return mid;
        if(inputArray.get(left) <= inputArray.get(mid)) {
            if(elementToSearch <= inputArray.get(mid) && elementToSearch >= inputArray.get(left))
                return searchInSortedRotated(inputArray, elementToSearch, left, mid-1);
            return searchInSortedRotated(inputArray, elementToSearch, mid+1, right);
        } else {
            if(elementToSearch >= inputArray.get(mid+1) && elementToSearch <= inputArray.get(right))
                return searchInSortedRotated(inputArray, elementToSearch, mid+1, right);
            return searchInSortedRotated(inputArray, elementToSearch, left, mid-1);
        }
    }

    public static void main(String[] args) {
        SearchInSortedAndRotatedArray searchInRotated = new SearchInSortedAndRotatedArray();

        List<Integer> input1 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9, 10, 1, 2, 3, 4));
        int element1 = 3;
        int output1 = searchInRotated.search(input1, element1);
        System.out.println("Element is present at index : " + output1);

        // Not working for below input, O(n) works.
        List<Integer> input2 = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 0, 2, 2, 2, 2, 2));
        int element2 = 0;
        int output2 = searchInRotated.search(input2, element2);
        System.out.println("Element is present at index : " + output2);
    }
}
