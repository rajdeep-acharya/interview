public class TestPrintInt {
    public static void main(String[] args) {
        printInt();
        bitPuzzle();
    }

    private static void printInt() {
        int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);
    }

    private static void bitPuzzle() {
        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value & mask);
    }
}
