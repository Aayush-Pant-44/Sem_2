// Task 1: Vehicle and Car
class Vehicle {
  void drive() {
      System.out.println("Vehicle is being driven.");
  }
}

class Car extends Vehicle {
  void display() {
      System.out.println("This is a Car. Brand: Toyota, Model: Corolla.");
  }
}

// Task 2: Employee and HRManager
class Employee {
  void work() {
      System.out.println("Employee is working.");
  }

  double getSalary() {
      return 30000.0;
  }
}

class HRManager extends Employee {
  @Override
  void work() {
      System.out.println("HR Manager is managing recruitment.");
  }
}

// Task 3: Geometry Calculator - Multilevel Inheritance
class Shape {
  void displayShapeType() {
      System.out.println("This is a generic shape.");
  }
}

class Polygon extends Shape {
  void displayPolygon() {
      System.out.println("This is a polygon shape.");
  }
}

class Rectangle extends Polygon {
  int length = 10;
  int breadth = 5;

  int calculateArea() {
      return length * breadth;
  }
}

class Square extends Polygon {
  int side = 6;

  int calculateArea() {
      return side * side;
  }
}

class Circle extends Shape {
  double radius = 7.0;

  double calculateArea() {
      return Math.PI * radius * radius;
  }
}

// Task 4: Vehicle Hierarchy - Hierarchical Inheritance
class BaseVehicle {
  void startEngine() {
      System.out.println("Engine started.");
  }

  void stopEngine() {
      System.out.println("Engine stopped.");
  }
}

class FourWheeler extends BaseVehicle {
  void drive() {
      System.out.println("Car is driving.");
  }
}

class TwoWheeler extends BaseVehicle {
  void ride() {
      System.out.println("Motorcycle is riding.");
  }
}

// Task 5: Shape Hierarchy - Hierarchical Inheritance
class BaseShape {
  double calculateArea() {
      return 0.0;
  }
}

class Rect extends BaseShape {
  double length = 8.0;
  double width = 4.0;

  @Override
  double calculateArea() {
      return length * width;
  }

  double calculatePerimeter() {
      return 2 * (length + width);
  }
}

class Circ extends BaseShape {
  double radius = 5.0;

  @Override
  double calculateArea() {
      return Math.PI * radius * radius;
  }

  double calculateCircumference() {
      return 2 * Math.PI * radius;
  }
}

// Task 6: Book Hierarchy
class Book {
  String title;
  String author;

  Book(String title, String author) {
      this.title = title;
      this.author = author;
  }

  void displayDetails() {
      System.out.println("Title: " + title + ", Author: " + author);
  }
}

class FictionBook extends Book {
  FictionBook(String title, String author) {
      super(title, author);
  }
}

class NonFictionBook extends Book {
  NonFictionBook(String title, String author) {
      super(title, author);
  }
}

class TechnicalBook extends Book {
  TechnicalBook(String title, String author) {
      super(title, author);
  }
}

// Main class 
public class Task_oop2 {
  public static void main(String[] args) {
      // Task 1
      System.out.println("---- Task 1 ----");
      Car car1 = new Car();
      car1.drive();
      car1.display();

      // Task 2
      System.out.println("\n---- Task 2 ----");
      HRManager hr = new HRManager();
      hr.work();
      System.out.println("Salary: " + hr.getSalary());

      // Task 3
      System.out.println("\n---- Task 3 ----");
      Rectangle rect = new Rectangle();
      Square square = new Square();
      Circle circle = new Circle();

      System.out.println("Rectangle Area: " + rect.calculateArea());
      System.out.println("Square Area: " + square.calculateArea());
      System.out.println("Circle Area: " + circle.calculateArea());

      // Task 4
      System.out.println("\n---- Task 4 ----");
      FourWheeler car = new FourWheeler();
      TwoWheeler bike = new TwoWheeler();

      car.startEngine();
      car.drive();
      car.stopEngine();

      bike.startEngine();
      bike.ride();
      bike.stopEngine();

      // Task 5
      System.out.println("\n---- Task 5 ----");
      Rect rectangle = new Rect();
      Circ cir = new Circ();

      System.out.println("Rectangle Area: " + rectangle.calculateArea());
      System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

      System.out.println("Circle Area: " + cir.calculateArea());
      System.out.println("Circle Circumference: " + cir.calculateCircumference());

      // Task 6
      System.out.println("\n---- Task 6 ----");
      FictionBook fb = new FictionBook("The Alchemist", "Paulo Coelho");
      NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
      TechnicalBook tb = new TechnicalBook("Effective Java", "Joshua Bloch");

      fb.displayDetails();
      nfb.displayDetails();
      tb.displayDetails();
  }
}
