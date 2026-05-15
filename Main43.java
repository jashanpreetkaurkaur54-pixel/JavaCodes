class ATM {

    private int pin = 1234;

    public int getPin() {
        return pin;
    }

    public void setPin(int newPin) {
        pin = newPin;
    }
}

    public class Main43 {
    public static void main(String[] args) {

        ATM a1 = new ATM();

        System.out.println("Old PIN: " + a1.getPin());

        a1.setPin(5678);

        System.out.println("New PIN: " + a1.getPin());
    }
}