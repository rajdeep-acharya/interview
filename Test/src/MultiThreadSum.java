/*
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

//10 5 20 100 50 200 40 500 1000 0 -1
public class MultiThreadSum implements Runnable {
    private static final String args1 = "10,5,20,100,50,200,40,500,1000,0,-1";

    public MultiThreadSum() {

    }

    @Override
    public void run() {
        List<Integer> intAsList = returnAsList(args1);
        sum(intAsList);
    }

    private List<Integer> returnAsList(String args) {
        return args1.split(",").stream()
            .filter(String::trim)
            .filter(Integer::parseInt)
            .collect(Arrays.asList());
    }

    private synchronized Integer sum(List<Integer> intList) {
        for(Integer i : intList) {
            i = i + i.next();
            return i;
        }
    }

    public static void main(String[] args) {
        Thread thd1 = new Thread();
        thd1.start();
        Thread thd2 = new Thread();
        thd2.start();
    }
}
*/
