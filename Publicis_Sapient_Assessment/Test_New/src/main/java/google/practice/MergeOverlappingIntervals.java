package google.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

// refer to for problem statement : https://www.geeksforgeeks.org/merging-intervals/
public class MergeOverlappingIntervals {

    public static void mergeIntervals(Interval[] arr) {

        // Test if interval array is null or empty
        if(arr == null || arr.length <= 0) {
            return;
        }

        // Create empty stack of intervals
        Stack<Interval> intervalStack = new Stack<>();

        // push the 1st element from interval array to stack
        intervalStack.push(arr[0]);

        // Test if interval array is having single interval
        if(arr.length == 1) {
            printStack(intervalStack);
            return;
        }

        // sort the intervals in ascending order of start time
        Arrays.sort(arr, Comparator.comparingInt(firstInterval -> firstInterval.start));

        // start loop from next interval
        for (int i=1 ; i < arr.length ; i++) {

            // get top interval from stack
            Interval topInterval = intervalStack.peek();

            // if current interval not overlapping with stack top interval
            if(topInterval.end < arr[i].start) {
                intervalStack.push(arr[i]);
            }

            // Otherwise
            else if (topInterval.end < arr[i].end) {
                topInterval.end = arr[i].end;
                intervalStack.pop();
                intervalStack.push(topInterval);
            }
        }

        printStack(intervalStack);

    }

    // Print contents of stack
    private static void printStack(Stack<Interval> intervalStack) {
        System.out.print("The Merged Intervals are: ");
        while(!intervalStack.isEmpty()) {
            Interval interval = intervalStack.pop();
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) throws Exception {
        Interval[] arrInterval = new Interval[4];
        // Test 1
        arrInterval[0] = new Interval(6,8);
        arrInterval[1] = new Interval(9,1);
        arrInterval[2] = new Interval(2,4);
        arrInterval[3] = new Interval(4,7);
        mergeIntervals(arrInterval);
        // Test 2
        Interval[] arrInterval1 = new Interval[4];
        arrInterval1[0] = new Interval(1,3);
        arrInterval1[1] = new Interval(2,4);
        arrInterval1[2] = new Interval(6,8);
        arrInterval1[3] = new Interval(9,10);
        mergeIntervals(arrInterval1);
    }

    static class Interval {
        int start;
        int end;
        Interval(int start, int end) throws Exception {
            this.start = start;
            this.end = checkStartLessThanEnd(start, end);
        }

        static int checkStartLessThanEnd(int start, int end) throws Exception {
            if (start <= end) {
                return end;
            } else {
                String errorMessage = "start greater than end for interval : [" + start + ", " + end + "]";
                System.out.println(errorMessage);
                throw new Exception(errorMessage);
            }
        }
    }
}
