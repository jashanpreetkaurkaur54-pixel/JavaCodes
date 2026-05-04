
interface Click1 {
    void capture1();
}
interface Click2 {
    void capture2();
}
class Mobile implements Click1, Click2 {

    public void capture1() {
        System.out.println("Click picture...");
    }

    public void capture2() {
        System.out.println("Record video...");
    }
}
class TestInterface {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.capture1();   
        m.capture2();   
    }
}