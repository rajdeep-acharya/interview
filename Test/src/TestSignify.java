import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSignify {

    public static void main(String[] args) {
        int sum = 7;
        // fibonacci series
        // 0 , 1 , 1, 2, 3, 5 ...
        // {2, 5}
        // {0, 2, 5}
        // {}

        List<Integer> fibonacci = new ArrayList<>();
        int beforeNext = 0;
        int next = 1;
        fibonacci.add(beforeNext);
        fibonacci.add(next);
        for (int i=0 ; i < sum ; i++ ) {
            next = next + beforeNext;
            beforeNext = next - beforeNext;
            if (next < sum) {
                fibonacci.add(next);
            } else {
                break;
            }
        }
        System.out.println(fibonacci);

//        Iterator<Integer> it = fibonacci.iterator();
//        while (it.hasNext()) {
//            sum - it.next()
//        }



    }

}
