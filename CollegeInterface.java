interface College {

    void course();
}

class CSE implements College {

    public void course() {
        System.out.println("Computer Science Engineering");
    }
}

class MBA implements College {

    public void course() {
        System.out.println("Master of Business Administration");
    }
}

public class CollegeInterface {

    public static void main(String[] args) {

        CSE c1 = new CSE();
        MBA m1 = new MBA();

        c1.course();
        m1.course();
    }
}