//1
abstract class Shape {
  abstract double calculateArea();
}

class Circle extends Shape {
  double radius;

  Circle(double radius) {
      this.radius = radius;
  }

  double calculateArea() {
      return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  double length, width;

  Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
  }

  double calculateArea() {
      return length * width;
  }
}

class Triangle extends Shape {
  double base, height;

  Triangle(double base, double height) {
      this.base = base;
      this.height = height;
  }

  double calculateArea() {
      return 0.5 * base * height;
  }
}

// 2
abstract class PaymentMethod {
  abstract void validate();
  abstract void processTransaction();
}

class CreditCard extends PaymentMethod {
  void validate() {
      System.out.println("Credit Card validated.");
  }

  void processTransaction() {
      System.out.println("Transaction done using Credit Card.");
  }
}

class PayPal extends PaymentMethod {
  void validate() {
      System.out.println("PayPal account validated.");
  }

  void processTransaction() {
      System.out.println("Transaction done using PayPal.");
  }
}

class BankTransfer extends PaymentMethod {
  void validate() {
      System.out.println("Bank account verified.");
  }

  void processTransaction() {
      System.out.println("Transaction done using Bank Transfer.");
  }
}

// 3
abstract class Vehicle {
  abstract double calculateRent(int days);
}

class Car extends Vehicle {
  double calculateRent(int days) {
      return days * 50; // Rs. 50 per day
  }
}

class Motorcycle extends Vehicle {
  double calculateRent(int days) {
      return days * 30; // Rs. 30 per day
  }
}

class Bicycle extends Vehicle {
  double calculateRent(int days) {
      return days * 10; // Rs. 10 per day
  }
}

// 4
abstract class MenuItem {
  abstract void prepare();
  abstract void serve();
}

class Appetizer extends MenuItem {
  void prepare() {
      System.out.println("Preparing appetizer...");
  }

  void serve() {
      System.out.println("Serving appetizer.");
  }
}

class MainCourse extends MenuItem {
  void prepare() {
      System.out.println("Preparing main course...");
  }

  void serve() {
      System.out.println("Serving main course.");
  }
}

class Beverage extends MenuItem {
  void prepare() {
      System.out.println("Preparing beverage...");
  }

  void serve() {
      System.out.println("Serving beverage.");
  }
}

// 5
abstract class ManipulatableShape {
  abstract void resize();
  abstract void rotate();
}

class CircleManip extends ManipulatableShape {
  void resize() {
      System.out.println("Resizing Circle.");
  }

  void rotate() {
      System.out.println("Rotating Circle.");
  }
}

class Square extends ManipulatableShape {
  void resize() {
      System.out.println("Resizing Square.");
  }

  void rotate() {
      System.out.println("Rotating Square.");
  }
}

class TriangleManip extends ManipulatableShape {
  void resize() {
      System.out.println("Resizing Triangle.");
  }

  void rotate() {
      System.out.println("Rotating Triangle.");
  }
}

// 6
class Calculator {
  int add(int a, int b) {
      return a + b;
  }

  double add(double a, double b) {
      return a + b;
  }

  int add(int a, int b, int c) {
      return a + b + c;
  }
}

// 7
class Geometry {
  double calculateArea(double radius) {
      return Math.PI * radius * radius;
  }

  double calculateArea(double length, double width) {
      return length * width;
  }

  double calculateArea(double base, double height, boolean isTriangle) {
      if (isTriangle) {
          return 0.5 * base * height;
      }
      return 0.0;
  }
}

// 8
class Employee {
  double calculateSalary() {
      return 30000; // base salary
  }
}

class Manager extends Employee {
  double calculateSalary() {
      double bonus = 10000;
      return super.calculateSalary() + bonus;
  }
}

// 9
class Account {
  double calculateInterest() {
      return 0.0;
  }
}

class SavingsAccount extends Account {
  double calculateInterest() {
      return 500; // simple example
  }
}

class FixedDepositAccount extends Account {
  double calculateInterest() {
      return 1000;
  }
}

// 10
class Character {
  void attack() {
      System.out.println("Character performs a basic attack.");
  }
}

class Warrior extends Character {
  void attack() {
      System.out.println("Warrior slashes with sword!");
  }
}

class Mage extends Character {
  void attack() {
      System.out.println("Mage casts fireball!");
  }
}

// 11
abstract class Instrument {
  abstract void playSound();
}

class Piano extends Instrument {
  void playSound() {
      System.out.println("Playing piano melody.");
  }
}

class Guitar extends Instrument {
  void playSound() {
      System.out.println("Strumming guitar chords.");
  }
}

class Violin extends Instrument {
  void playSound() {
      System.out.println("Playing violin symphony.");
  }
}

// Main
public class OOP_4 {
  public static void main(String[] args) {
      // 1
      Shape shape1 = new Circle(5);
      Shape shape2 = new Rectangle(4, 6);
      Shape shape3 = new Triangle(3, 7);
      System.out.println("Circle area: " + shape1.calculateArea());
      System.out.println("Rectangle area: " + shape2.calculateArea());
      System.out.println("Triangle area: " + shape3.calculateArea());

      // 2
      PaymentMethod method1 = new CreditCard();
      method1.validate();
      method1.processTransaction();

      // 3
      Vehicle car = new Car();
      System.out.println("Car rent for 3 days: Rs. " + car.calculateRent(3));

      // 4
      MenuItem item = new Beverage();
      item.prepare();
      item.serve();

      // 5
      ManipulatableShape ms = new Square();
      ms.resize();
      ms.rotate();

      // 6
      Calculator calc = new Calculator();
      System.out.println("Add ints: " + calc.add(2, 3));
      System.out.println("Add doubles: " + calc.add(2.5, 4.5));
      System.out.println("Add 3 ints: " + calc.add(1, 2, 3));

      // 7
      Geometry geo = new Geometry();
      System.out.println("Area of circle: " + geo.calculateArea(5));
      System.out.println("Area of rectangle: " + geo.calculateArea(4, 6));
      System.out.println("Area of triangle: " + geo.calculateArea(4, 6, true));

      // 8
      Manager m = new Manager();
      System.out.println("Manager salary: " + m.calculateSalary());

      // 9
      Account acc1 = new SavingsAccount();
      Account acc2 = new FixedDepositAccount();
      System.out.println("Savings interest: Rs. " + acc1.calculateInterest());
      System.out.println("FD interest: Rs. " + acc2.calculateInterest());

      // 10
      Character char1 = new Warrior();
      Character char2 = new Mage();
      char1.attack();
      char2.attack();

      // 11
      Instrument instr = new Violin();
      instr.playSound();
  }
}
