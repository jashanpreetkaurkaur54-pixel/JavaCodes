interface Payment {
    void pay(int amount);
}

class UPI implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Card implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

public class Pay{

    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay(500);

        p = new Card();
        p.pay(1000);
    }
}