public class B extends A {

    public B() throws Exception {
        super();
    }

    public static void main(String[] args) {
        try {
            new A();
            new A();
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }

    }

}
