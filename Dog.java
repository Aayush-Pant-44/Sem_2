public class Dog {
  String name;
  int age;
  String color;
 void bark(){
  System.out.println(name+ " can bark");
 }
 void wag(){
  System.out.println(name+" wag his tail");
 }
 void printDetails(){
  System.out.println(name+" "+age+" "+color);
 }
 int getAge(){
  return age;
 }
 String getName(){
  return name;
 }
 String getColor(){
  return color;
 }

}
