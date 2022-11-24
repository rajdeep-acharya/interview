import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    // Input : arr = [0, -1, 2, -3, 1]
    // Output : [[0, -1, 1], [2, -3, 1]]

//    [-3, -1, 0, 1, 2]
//    i --> i++  j-- --- j

    public static void main(String[] args) {
        int[] inputArray = {0, -1, 2, -3, 1};
        Arrays.sort(inputArray);
        int j = inputArray.length - 1;
        List<int []> list = new ArrayList<>();
        int i = 0;
        while (i < j) {
//        for (int i = 0 ; i < inputArray.length ; i++) {
            if(inputArray[i] < 0) {
                int[] subArr = new int[3];
                subArr[0] = inputArray[i];
                subArr[1] = inputArray[j];
                int sum = inputArray[i] + inputArray[j];
                while (sum > 0) {
                    i++;
                    if(sum + inputArray[i] == 0) {
                        sum = 0;
                        subArr[2] = inputArray[i];
                        list.add(subArr);
                    }
                }
                while (sum < 0) {
                    j--;
                    if(sum + inputArray[j] == 0) {
                        sum = 0;
                        subArr[2] = inputArray[j];
                        list.add(subArr);
                    }
                }
            } else {
                return;
            }
        }
        System.out.println(list);
    }

}
