interface Animal {
void eat();
}
interface Vehicle {
void drive();
}
interface Device {
void start();
}
class Dog implements Animal {
 public void eat() {
System.out.println("Dog is eating");
    }
}
class Car implements Vehicle {
public void drive() {
System.out.println("Car is driving");
    }
}
class Laptop implements Device {
 public void start() {
System.out.println("Laptop is starting");
    }
}
public class Main34 {
public static void main(String[] args) {
Dog d = new Dog();
Car c = new Car();
Laptop l = new Laptop();
 d.eat();
 c.drive();
 l.start();
 }
}