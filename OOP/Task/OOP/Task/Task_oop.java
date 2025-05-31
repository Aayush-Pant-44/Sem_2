// package OOP.Task.OOP.Task;
// //1
// class Circle {
//   private double radius;

//   public void setRadius(double radius) {
//       this.radius = radius;
//   }

//   public double getRadius() {
//       return radius;
//   }

//   public double getArea() {
//       return Math.PI * radius * radius;
//   }

//   public double getCircumference() {
//       return 2 * Math.PI * radius;
//   }
// }
// //2
// class SimpleInterest {
//   private double principal, time, rate;

//   public void setPrincipal(double principal) {
//       this.principal = principal;
//   }

//   public void setTime(double time) {
//       this.time = time;
//   }

//   public void setRate(double rate) {
//       this.rate = rate;
//   }

//   public double getPrincipal() { return principal; }
//   public double getTime() { return time; }
//   public double getRate() { return rate; }
// }
// //3
// class Dog {
//   private String name, breed;

//   public Dog(String name, String breed) {
//       this.name = name;
//       this.breed = breed;
//   }

//   public void setName(String name) { this.name = name; }
//   public void setBreed(String breed) { this.breed = breed; }

//   public String getName() { return name; }
//   public String getBreed() { return breed; }
// }
// //4
// class Employee {
//   private String name, jobTitle;
//   private double salary;

//   public void setName(String name) { this.name = name; }
//   public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
//   public void setSalary(double salary) { this.salary = salary; }

//   public double updateSalary(double change) {
//       salary += change;
//       return salary;
//   }
// }
// //5
// class Product {
//   private String productName;
//   private int productID;
//   private double price;
//   private int stock;

//   public void setProductName(String name) { this.productName = name; }
//   public void setProductID(int id) { this.productID = id; }
//   public void setPrice(double price) {
//       if (price >= 0) this.price = price;
//   }
//   public String getProductName() { return productName; }
//   public int getProductID() { return productID; }
//   public double getPrice() { return price; }

//   public void purchase(int quantity) {
//       if (quantity <= stock) stock -= quantity;
//   }

//   public void restock(int quantity) {
//       stock += quantity;
//   }
// }
// //6
// class BankAccount {
//   private String accountNumber;
//   private String accountHolderName;
//   private double balance;

//   public void setAccount(String number, String holder) {
//       this.accountNumber = number;
//       this.accountHolderName = holder;
//   }

//   public void deposit(double amount) {
//       if (amount > 0) balance += amount;
//   }

//   public void withdraw(double amount) {
//       if (amount > 0 && amount <= balance) balance -= amount;
//   }

//   public double getBalance() {
//       return balance;
//   }
// }
// //7
// class Book {
//   private String title;
//   private String author;
//   private int year;
//   private boolean available = true;

//   public void setTitle(String title) { this.title = title; }
//   public void setAuthor(String author) { this.author = author; }
//   public void setYear(int year) { this.year = year; }

//   public String getTitle() { return title; }
//   public String getAuthor() { return author; }
//   public int getYear() { return year; }

//   public void borrowBook() {
//       available = false;
//   }

//   public boolean isAvailable() {
//       return available;
//   }
// }
// //8
// class Student {
//   private String name;
//   private String id;
//   private double gpa;

//   public Student(String name, String id, double gpa) {
//       this.name = name;
//       this.id = id;
//       this.gpa = gpa;
//   }

//   public String getName() { return name; }
//   public void setName(String name) { this.name = name; }

//   public String getId() { return id; }
//   public void setId(String id) { this.id = id; }

//   public double getGpa() { return gpa; }
// }
// //9
// class EmployeeEncap {
//   private String name;
//   private String id;
//   private double salary;

//   public void setName(String name) { this.name = name; }
//   public void setId(String id) { this.id = id; }

//   public String getName() { return name; }
//   public String getId() { return id; }

//   public void updateSalary(double amount) {
//       if (salary + amount >= 0) salary += amount;
//   }

//   public double getSalary() { return salary; }
// }
// //10
// class Car {
//   private String make;
//   private String model;
//   private double rentalPrice;
//   private boolean available = true;

//   public Car(String make, String model) {
//       this.make = make;
//       this.model = model;
//   }

//   public void setRentalPrice(double rentalPrice) {
//       this.rentalPrice = rentalPrice;
//   }

//   public String getMake() { return make; }
//   public String getModel() { return model; }
//   public double getRentalPrice() { return rentalPrice; }

//   public void rentCar() { available = false; }
//   public void returnCar() { available = true; }
//   public boolean isAvailable() { return available; }
// }

// public class Task_oop {
//   public static void main(String[] args) {
      
//   }
// }

