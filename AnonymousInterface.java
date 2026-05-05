interface Test {
    void show();
}

public class AnonymousInterface {
    public static void main(String[] args) {
        Test t = new Test() {
            public void show() {
                System.out.println("Anonymous interface");
            }
        };

        t.show();
    }
}