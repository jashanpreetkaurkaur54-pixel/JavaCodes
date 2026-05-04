
interface Printer {
    void printing();
}

interface Scanner {
    void scanning();
}
interface Fax {
    void faxing();
}

class AllInOneMachine implements Printer, Scanner, Fax {

    public void printing() {
        System.out.println("Printing document...");
    }

    public void scanning() {
        System.out.println("Scanning document...");
    }

    public void faxing() {
        System.out.println("Sending fax...");
    }
}

// Main class
public class main6 {
    public static void main(String[] args) {

        AllInOneMachine machine = new AllInOneMachine();

        machine.printing();
        machine.scanning();
        machine.faxing();
    }
}