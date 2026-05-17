class Car {
    String brand;
    int price;

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "BMW";
        c.price = 5000000;

        c.showDetails();
    }
}