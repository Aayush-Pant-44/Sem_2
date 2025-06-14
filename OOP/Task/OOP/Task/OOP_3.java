package OOP.Task.OOP.Task;

//1

abstract class Bird {
  abstract void fly();
}

class Eagle extends Bird {
  public void fly() {
      System.out.println("Eagle is flying high in the sky.");
  }
}

class Penguin extends Bird {
  public void fly() {
      System.out.println("Penguin cannot fly.");
  }
}

//2
import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
//3
abstract class Vehicle {
  abstract void startEngine();
  abstract void stopEngine();
}

class Car extends Vehicle {
  public void startEngine() {
      System.out.println("Car engine started.");
  }

  public void stopEngine() {
      System.out.println("Car engine stopped.");
  }
}

class Motorcycle extends Vehicle {
  public void startEngine() {
      System.out.println("Motorcycle engine started.");
  }

  public void stopEngine() {
      System.out.println("Motorcycle engine stopped.");
  }
}
//4
abstract class Shape2 {
  abstract double calculateArea();
  abstract double calculatePerimeter();
}

class Circle2 extends Shape2 {
  double radius;

  Circle2(double r) {
      radius = r;
  }

  double calculateArea() {
      return 3.14 * radius * radius;
  }

  double calculatePerimeter() {
      return 2 * 3.14 * radius;
  }
}

class Rectangle2 extends Shape2 {
  double length, width;

  Rectangle2(double l, double w) {
      length = l;
      width = w;
  }

  double calculateArea() {
      return length * width;
  }

  double calculatePerimeter() {
      return 2 * (length + width);
  }
}

class Triangle extends Shape2 {
  double a, b, c;

  Triangle(double x, double y, double z) {
      a = x;
      b = y;
      c = z;
  }

  double calculateArea() {
      double s = (a + b + c) / 2;
      return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
  }

  double calculatePerimeter() {
      return a + b + c;
  }
}

//5
abstract class Draw {
  abstract double calculateVolume();
  abstract double calculateArea();
  abstract double calculatePerimeter();
}

class Cube extends Draw {
  double side;

  Cube(double s) {
      side = s;
  }

  double calculateVolume() {
      return side * side * side;
  }

  double calculateArea() {
      return 6 * side * side;
  }

  double calculatePerimeter() {
      return 12 * side;
  }
}

class Cuboid extends Draw {
  double l, b, h;

  Cuboid(double length, double breadth, double height) {
      l = length;
      b = breadth;
      h = height;
  }

  double calculateVolume() {
      return l * b * h;
  }

  double calculateArea() {
      return 2 * (l * b + b * h + l * h);
  }

  double calculatePerimeter() {
      return 4 * (l + b + h);
  }
}

class Cylinder extends Draw {
  double r, h;

  Cylinder(double radius, double height) {
      r = radius;
      h = height;
  }

  double calculateVolume() {
      return 3.14 * r * r * h;
  }

  double calculateArea() {
      return 2 * 3.14 * r * (r + h);
  }

  double calculatePerimeter() {
      return 2 * 3.14 * r;
  }
}

//6
interface Playlist {
  void addSong(String song);
  void removeSong(String song);
}

class MediaPlayer {
  void play() {
      System.out.println("Playing media...");
  }

  void pause() {
      System.out.println("Media paused.");
  }

  void stop() {
      System.out.println("Media stopped.");
  }
}

class VideoPlayer extends MediaPlayer implements Playlist {
  public void rewind() {
      System.out.println("Video rewinded.");
  }

  public void fastForward() {
      System.out.println("Video fast-forwarded.");
  }

  public void addSong(String song) {
      System.out.println("Added song: " + song);
  }

  public void removeSong(String song) {
      System.out.println("Removed song: " + song);
  }
}

//7
interface Employee {
  void work();
  double getSalary();
}

class Chef implements Employee {
  public void work() {
      System.out.println("Chef is cooking food.");
  }

  public double getSalary() {
      return 30000;
  }
}

class Waiter implements Employee {
  public void work() {
      System.out.println("Waiter is serving customers.");
  }

  public double getSalary() {
      return 15000;
  }
}


//8
interface LibraryItem {
  String getTitle();
  String getAuthor();
  int getYear();
  boolean isAvailable();
}

class Book implements LibraryItem {
  String title, author;
  int year;
  boolean available;

  Book(String t, String a, int y, boolean avail) {
      title = t;
      author = a;
      year = y;
      available = avail;
  }

  public String getTitle() {
      return title;
  }

  public String getAuthor() {
      return author;
  }

  public int getYear() {
      return year;
  }

  public boolean isAvailable() {
      return available;
  }
}


public class OOP_3 {
  public static void main(String[] args) {
      // Bird
      Bird eagle = new Eagle();
      Bird penguin = new Penguin();
      eagle.fly();
      penguin.fly();

      // Shape (Rectangle & Circle)
      Rectangle rect = new Rectangle(4, 5);
      Circle circle = new Circle(3);
      System.out.println("Rectangle area: " + rect.calculateArea());
      System.out.println("Circle area: " + circle.calculateArea());

      // Vehicle
      Vehicle car = new Car();
      Vehicle bike = new Motorcycle();
      car.startEngine(); car.stopEngine();
      bike.startEngine(); bike.stopEngine();

      // Shape2
      Shape2 c2 = new Circle2(4);
      Shape2 r2 = new Rectangle2(5, 3);
      Shape2 t = new Triangle(3, 4, 5);
      System.out.println("Circle2 Area: " + c2.calculateArea());
      System.out.println("Triangle Perimeter: " + t.calculatePerimeter());

      // Draw
      Draw cube = new Cube(3);
      Draw cuboid = new Cuboid(3, 4, 5);
      Draw cylinder = new Cylinder(3, 7);
      System.out.println("Cube Volume: " + cube.calculateVolume());
      System.out.println("Cylinder Area: " + cylinder.calculateArea());

      // VideoPlayer
      VideoPlayer vp = new VideoPlayer();
      vp.play();
      vp.addSong("Song A");
      vp.rewind();
      vp.fastForward();
      vp.removeSong("Song A");

      // Employee
      Employee chef = new Chef();
      Employee waiter = new Waiter();
      chef.work(); System.out.println("Chef Salary: " + chef.getSalary());
      waiter.work(); System.out.println("Waiter Salary: " + waiter.getSalary());

      // Library
      Book book = new Book("1984", "George Orwell", 1949, true);
      System.out.println("Title: " + book.getTitle());
      System.out.println("Available: " + book.isAvailable());
  }
}


































