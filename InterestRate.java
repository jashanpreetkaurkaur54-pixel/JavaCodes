
class Bank {
    void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}
class SBI extends Bank {
void interestRate() {
        System.out.println("SBI interest rate is 7%");
    }
}
class HDFC extends Bank {
void interestRate() {
System.out.println("HDFC interest rate is 10%");
    }
}

class ICICI extends Bank {
 void interestRate() {
 System.out.println("ICICI interest rate is 12%");
    }
}
public class InterestRate {
public static void main(String[] args) {
Bank b;
 b = new SBI();
b.interestRate();
b = new HDFC();
b.interestRate();
b = new ICICI();
b.interestRate();
    }
}