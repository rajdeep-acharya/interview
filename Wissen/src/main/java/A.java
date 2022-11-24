
/*Design a class such that only one instance of the class and any of its sub-classes can be created.
    To clarify: Assume A is such a class and B and C are derived from A.
    B, C does not have any special code apart from extending A

    new A(); // works fine.
    new A(); // causes an exception
    new B(); // works fine as this is the first instance of B
    new B(); // causes an exception.
    new C(); // works fine as this is the first instance of C
    new C(); // causes an exception.*/

public class A {

    public static A INSTANCE;

    public static int i = 0;

/*    static {
        try {
            INSTANCE = getInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/

    public A() throws Exception {
//        getInstance();
        for(; i < 10 ; i++) {
            if (i == 0) {
                System.out.println("A instance created");
                return;
            } else {
                throw new Exception();
            }
        }
    }
/*

    private static A getInstance() throws Exception {
        if (INSTANCE == null) {
            INSTANCE = new A();
            System.out.println("A instance created");
        } else {
            throw new Exception();
        }
        return INSTANCE;
    }
*/

}
