/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {


    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		*/
        /* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*//*


        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> intArrayList = new ArrayList<>();
        int[] arr = new int[splitSize];
        int j=0;
        for (int i=0; i < array.length ; i++) {
            arr[j] = array[i];
            j++;
            if((splitSize == 1 || i != 0) && i % splitSize == 0) {
                intArrayList.add(arr);
                j=0;
            }
        }
        return intArrayList;
    }

}
*/
