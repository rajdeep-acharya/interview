import java.util.Scanner;

public class JavaMultiSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data : \n-----------------");
        String myString = scanner.nextLine();
        Object obj = isNumericOrString(myString);
        if (obj == null) {
            return;
        }
        if(obj instanceof Integer[]) {
            System.out.println("Output (sum of integers) : " + sum((Integer[])obj));
        } else if (obj instanceof String[]) {
            System.out.println("Output (concatenated string) : " + sum((String[])obj));
        }
    }

    private static Integer sum(Integer[] intArr) {
        Integer sum = 0;
        for (Integer integer : intArr) {
            sum += integer;
        }
        return sum;
    }

    private static String sum(String[] strArr) {
        StringBuilder sum = new StringBuilder();
        for (String s : strArr) {
            sum.append(s);
        }
        return sum.toString();
    }

    private static Object isNumericOrString(String s){
        if (s == null || s.length() == 0){
            return null;
        }

        try {
            String[] strArr = s.split(" ");
            Integer[] intArr = new Integer[strArr.length];
            for (int i=0; i < strArr.length; i++) {
                intArr[i] = Integer.valueOf(strArr[i]);
            }
            System.out.println("---------------------- \n Input is numeric type \n----------------------");
            return intArr;
        } catch (NumberFormatException e) {
            System.out.println("---------------------- \n Input is string type \n----------------------");
            return s.split(" ");
        }
    }
}
