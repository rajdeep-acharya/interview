import static java.lang.Math.max;

public class LargestHistogram {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 6, 7};
        int area = 0;
        System.out.println(maxArea(area, arr));
        System.out.println(maxArea(area, arr));
    }

    private static int maxArea(int area, int[] arr) {
        int n = arr.length;
        int i = n-1;
        int area1;
//        for(int i=n-1 ; i > 0  ; i--) {
            if(n==1) {
                return arr[0];
            }
//            area = arr[0];
            if (arr[i] > arr[i-1]) {
                area = arr[i-1] - arr[i];
            } else {
                area = arr[i-1] - (arr[i] - arr[i-1]) ;
            }
            return area + max(area, maxArea(area, arr));
        }
//    }

    private static int
}
