package solve.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chetna.chaudhari on 02/02/16.
 */
public class FloorAndCeiling {
    public static void main(String[] args) {
        FloorAndCeiling floorAndCeiling = new FloorAndCeiling();
        List<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 10, 10, 12, 19));
        int x = 19;
        floorAndCeiling.getFloorAndCeilingInLinear(input1, x);

    }

    private void getFloorAndCeilingInLinear(List<Integer> input, int x) {
        int floor, ceil;
        for(int index=0; index<input.size(); index++) {
            if(index == 0 && input.get(index)>= x) {
                System.out.println("Floor does not exist, Ceil = " + input.get(index));
                return;
            }
            if(input.get(index) <= x && index == input.size()-1) {
                System.out.println("Floor = " + input.get(index) + ",  Ceil does not exist.");
                return;
            }
            if(input.get(index) <= x && input.get(index+1) >= x) {
                System.out.println("Floor= " + input.get(index) + " Ceil = " + input.get(index+1));
                return;
            }

        }
    }

    /*
      Other solution is to find floor and ceil independently using binary search in array -- O(logN)
     */
//    private void getFloorAndCeilingInBS(List<Integer> input, int x, int low, int high) {
//        int floor, ceil;
//        int mid = (low+ high) / 2;
//
//        if(input.get(low) > x) {
//            System.out.println("Floor does not exist, Ceil = " + input.get(index));
//            return;
//        }
//
//        if(input.get(high) < x) {
//            System.out.println("Floor = " + input.get(index) + ",  Ceil does not exist.");
//            return;
//        }
//
//        if(input.get(low) < x ) {
//            if(input.get(mid) > x) {
//                getFloorAndCeilingInBS(input, x, low, mid);
//            } else {
//                if(input.get(mid) < x) {
//                    getFloorAndCeilingInBS(input, x, mid+1, high);
//                } else {
//
//                }
//            }
//        }


//    }
}
