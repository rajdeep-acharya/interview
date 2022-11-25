import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMaximumAmount' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY quantity
     *  2. INTEGER m
     */

    public static long getMaximumAmount(List<Integer> quantity, int m) {
    // Write your code here
        int n = quantity.size();
        if(quantity == null || quantity.isEmpty()) {
            return 0L;
        }
        if(n == 1) {
            return quantity.get(0);
        }
        if(m == 1) {
            return quantity.stream().max(Long::compare).get();
        }
        Integer maxProfit = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>((x, y) -> y - x);
        for(int i=0 ; i < n ; i++) {
            max.add(quantity.get(i));
        }
        while(m > 0) {
            m--;
            int maxElement = max.poll();
            maxProfit += maxElement;
            max.add(maxElement - 1);
        }
        return maxProfit;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int quantityCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> quantity = IntStream.range(0, quantityCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result.getMaximumAmount(quantity, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
