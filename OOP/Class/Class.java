package OOP.Class;

import java.util.Scanner;

// public class Class{

// public static void main(String[] args) {
//     Scanner scanner= new Scanner(System.in);

//     System.out.println("Enter a number ");

//     int num= scanner.nextInt();

//     int check= prime(num);
//     if (check==1){
//       System.out.println("It is not a prime number");
//     }
//     else{
//       System.out.println("It is a prime number");
//     }


// }

// static int  prime(int num){


// for (int i = 2; i < num; i++) {
//   if(num%i==0){
    
//     return 1;
  
//   }
    
// } 

// return 0;


// }




// }


public class Class{

public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("Enter a number ");

    int num= scanner.nextInt();

    int check= even(num);
    if (check==1){
      System.out.println("It is a even number");
    }
    else{
      System.out.println("It is a odd number");
    }


}

static int  even(int num){


  if(num%2==0){
    
    return 1;
  
  }else{
    return 2;
  }
    
} 




}









