package solve.arrays.problems;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.
 */
public class SortByFrequency {
    void sortAndPrint(List<Integer> input) {
        LinkedHashMap<Integer, Integer> hashMap = getFrequencies(input);
        System.out.println();
        int maximum = 0;
        int key = 0;
        while(hashMap.size() != 0) {
            for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if(maximum < entry.getValue()) {
                    maximum = entry.getValue();
                    key = entry.getKey();
                }
            }
            for(int index=0; index<maximum; index++) {
                System.out.printf("%d ", key);
            }
            hashMap.remove(key);
            maximum=0;
        }

    }

    private LinkedHashMap<Integer, Integer> getFrequencies(List<Integer> input) {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for(int index=0; index <= input.size()-1; index++) {
            int count = 0;
            if(hashMap.containsKey(input.get(index))) {
                count = hashMap.get(input.get(index));
                count = count + 1;
                hashMap.replace(input.get(index), count);
            } else {
                hashMap.put(input.get(index), 1);
            }
        }
        return hashMap;
    }

    public static void main(String[] args) {
        SortByFrequency sortByFrequency = new SortByFrequency();
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 5, 2, 8, 5, 6, 8, 8));
        sortByFrequency.sortAndPrint(input);

        List<Integer> input2 = new ArrayList<Integer>(Arrays.asList(5, 6, 1, 5, 1, 6, 8, 4, 4, 8, 10, 9, 10, 8, 9, 9));
        sortByFrequency.sortAndPrint(input2);

    }
}
