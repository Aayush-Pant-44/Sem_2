package OOP.Task;

// public class Task_2 {
  
//   static void odd(int n){
    
//     for (int i = 1; i <= n; i++) {
//       if(i%2==1){
//         System.out.println(i);
//       }
        
//     }


//   }
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("enter a range: ");
//     int n= sc.nextInt();
//     odd(n);
  
//   }
// }

//2. Create a method to convert a given number of days into years, months, and days

// public class Task_2{
  
// static void convert_days(int n){
  
//   int years=n/365;
  
//   int days=n-(years*365);
//   int months=days/30;
//   int new_days=days-(months*30);
//   System.out.println("years:"+years);
//   System.out.println("months:"+months);
//   System.out.println("days:"+new_days);
//   System.out.println("Time:"+years+"years, "+months+"months, "+new_days+"days");

    

    
//     }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("enter a number of days: ");
//     int n= sc.nextInt();
//     convert_days(n);

//   }




// }


//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("enter a range: ");
//     int n= sc.nextInt();
//     odd(n);
  
//   }
// }

//3. Write a method to determine whether a number is a Harshad number or not

// public class Task_2{
  
// static void harsad_number(int n){
  
//   int sum=0;
//   String str = Integer.toString(n);
// for (int idx = 0; idx < str.length(); idx++) {
//     sum+=Character.getNumericValue(str.charAt(idx));

    
// }
// System.err.println(sum);

// if(n%sum==0){
//   System.out.println("Is a harsad number");
// }else{
//   System.out.println("Not a harsad number");
// }

//     }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("enter a number: ");
//     int n= sc.nextInt();
//     harsad_number(n);

//   }

// }


// 4. Write a method to count the number of words in a given string

// public class Task_2 {

//   static void countWords(String s) {
//     int count = 0;
//     boolean inWord = false;

//     for (int i = 0; i < s.length(); i++) {
//       if (s.charAt(i) != ' ') {
//         if (!inWord) {
//           count++;
//           inWord = true;
//         }
//       } else {
//         inWord = false;
//       }
//     }

//     System.out.println("Number of words: " + count);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a sentence: ");
//     String sentence = sc.nextLine();
//     countWords(sentence);
//   }
// }




// 5. Write a method to calculate the compound interest given principal, rate, and time

// public class Task_2 {

//   static void compoundInterest(double p, double r, int t) {
//     double amount = p * Math.pow(1 + (r / 100), t);
//     double interest = amount - p;
//     System.out.println("Compound Interest: " + interest);
//     System.out.println("Total Amount: " + amount);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter principal: ");
//     double p = sc.nextDouble();
//     System.out.print("Enter rate: ");
//     double r = sc.nextDouble();
//     System.out.print("Enter time: ");
//     int t = sc.nextInt();
//     compoundInterest(p, r, t);
//   }
// }




// 6. Create a method to check whether a given number is a palindrome prime

// public class Task_2 {

//   static boolean isPrime(int n) {
//     if (n < 2) return false;
//     for (int i = 2; i <= n / 2; i++) {
//       if (n % i == 0) return false;
//     }
//     return true;
//   }

//   static boolean isPalindrome(int n) {
//     int original = n, reverse = 0;
//     while (n > 0) {
//       reverse = reverse * 10 + n % 10;
//       n = n / 10;
//     }
//     return original == reverse;
//   }

//   static void checkPalindromePrime(int n) {
//     if (isPrime(n) && isPalindrome(n)) {
//       System.out.println("It is a palindrome prime");
//     } else {
//       System.out.println("Not a palindrome prime");
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     checkPalindromePrime(n);
//   }
// }



// 7. Write a method to swap two numbers using a temporary variable

// public class Task_2 {

//   static void swapWithTemp(int a, int b) {
//     System.out.println("Before swap: a = " + a + ", b = " + b);
//     int temp = a;
//     a = b;
//     b = temp;
//     System.out.println("After swap: a = " + a + ", b = " + b);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter first number: ");
//     int a = sc.nextInt();
//     System.out.print("Enter second number: ");
//     int b = sc.nextInt();
//     swapWithTemp(a, b);
//   }
// }



// 8. Write a method to swap two numbers without using a temporary variable

// public class Task_2 {

//   static void swapWithoutTemp(int a, int b) {
//     System.out.println("Before swap: a = " + a + ", b = " + b);
//     a = a + b;
//     b = a - b;
//     a = a - b;
//     System.out.println("After swap: a = " + a + ", b = " + b);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter first number: ");
//     int a = sc.nextInt();
//     System.out.print("Enter second number: ");
//     int b = sc.nextInt();
//     swapWithoutTemp(a, b);
//   }
// }





// 9. Create a method to find the sum of the first n natural numbers

// public class Task_2 {

//   static void sumNatural(int n) {
//     int sum = 0;
//     for (int i = 1; i <= n; i++) {
//       sum += i;
//     }
//     System.out.println("Sum of first " + n + " natural numbers: " + sum);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     sumNatural(n);
//   }
// }



// 10. Write a method to print all factors of a number

// public class Task_2 {

//   static void printFactors(int n) {
//     System.out.println("Factors of " + n + ":");
//     for (int i = 1; i <= n; i++) {
//       if (n % i == 0) {
//         System.out.println(i);
//       }
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     printFactors(n);
//   }
// }



// 11. Create a method to calculate the cube of a given number

// public class Task_2 {

//   static void cube(int n) {
//     int result = n * n * n;
//     System.out.println("Cube of " + n + " is: " + result);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     cube(n);
//   }
// }




// 12. Write a method to determine if a number is a Duck number

// public class Task_2 {

//   static void isDuck(int n) {
//     String s = Integer.toString(n);
//     if (s.charAt(0) == '0') {
//       System.out.println("Not a Duck number");
//       return;
//     }
//     if (s.contains("0")) {
//       System.out.println("It is a Duck number");
//     } else {
//       System.out.println("Not a Duck number");
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     isDuck(n);
//   }
// }



// 13. Create a method to print the multiplication tables from 1 to 10

// public class Task_2 {

//   static void printTables() {
//     for (int i = 1; i <= 10; i++) {
//       System.out.println("Table of " + i + ":");
//       for (int j = 1; j <= 10; j++) {
//         System.out.println(i + " x " + j + " = " + (i * j));
//       }
//       System.out.println(); // Empty line between tables
//     }
//   }

//   public static void main(String[] args) {
//     printTables();
//   }
// }





// 14. Write a method that returns the sum of squares of digits of a number

// public class Task_2 {

//   static void sumOfSquares(int n) {
//     int sum = 0;
//     while (n > 0) {
//       int digit = n % 10;
//       sum += digit * digit;
//       n = n / 10;
//     }
//     System.out.println("Sum of squares of digits: " + sum);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     sumOfSquares(n);
//   }
// }





// 15. Create a method to count uppercase and lowercase characters in a string

// public class Task_2 {

//   static void countCases(String s) {
//     int upper = 0, lower = 0;
//     for (int i = 0; i < s.length(); i++) {
//       char ch = s.charAt(i);
//       if (ch >= 'A' && ch <= 'Z') {
//         upper++;
//       } else if (ch >= 'a' && ch <= 'z') {
//         lower++;
//       }
//     }
//     System.out.println("Uppercase letters: " + upper);
//     System.out.println("Lowercase letters: " + lower);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a string: ");
//     String s = sc.nextLine();
//     countCases(s);
//   }
// }





// 16. Write a method to check if a number is a Kaprekar number

// public class Task_2 {

//   static void isKaprekar(int n) {
//     int square = n * n;
//     String s = Integer.toString(square);
//     int len = s.length();

//     for (int i = 1; i < len; i++) {
//       int left = Integer.parseInt(s.substring(0, i));
//       int right = Integer.parseInt(s.substring(i));
//       if (right != 0 && left + right == n) {
//         System.out.println("Kaprekar number");
//         return;
//       }
//     }

//     if (n == 1) {
//       System.out.println("Kaprekar number");
//     } else {
//       System.out.println("Not a Kaprekar number");
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     isKaprekar(n);
//   }
// }




// 17. Write a method to reverse an integer without converting it to a string

// public class Task_2 {

//   static void reverseNumber(int n) {
//     int rev = 0;
//     while (n != 0) {
//       int digit = n % 10;
//       rev = rev * 10 + digit;
//       n /= 10;
//     }
//     System.out.println("Reversed number: " + rev);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     reverseNumber(n);
//   }
// }




// 19. Write a method to generate the first n terms of the Fibonacci series

// public class Task_2 {

//   static void fibonacci(int n) {
//     int a = 0, b = 1;
//     System.out.print("Fibonacci Series: ");
//     for (int i = 1; i <= n; i++) {
//       System.out.print(a + " ");
//       int next = a + b;
//       a = b;
//       b = next;
//     }
//     System.out.println();
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter how many Fibonacci terms you want: ");
//     int n = sc.nextInt();
//     fibonacci(n);
//   }
// }





// 20. Create a method that accepts a character and returns its ASCII value

// public class Task_2 {

//   static void asciiValue(char ch) {
//     int ascii = (int) ch;
//     System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a character: ");
//     char ch = sc.next().charAt(0);
//     asciiValue(ch);
//   }
// }
