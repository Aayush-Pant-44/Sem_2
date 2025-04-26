// 1. 
import java.util.Scanner;
public class Q1_Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Hello, " + fullName + "! Welcome!");
    }
}

// 2. 
import java.util.Scanner;
public class Q2_TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

// 3. 
import java.util.Scanner;
public class Q3_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive number.");
        } else if (num < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("Zero.");
        }
    }
}

// 4. 
import java.util.Scanner;
public class Q4_DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by both 5 and 11.");
        } else {
            System.out.println("Not divisible by both 5 and 11.");
        }
    }
}

// 5. 
import java.util.Scanner;
public class Q5_LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest.");
        } else {
            System.out.println(c + " is the largest.");
        }
    }
}


// 6. 
import java.util.Scanner;
public class Q6_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}


// 7. 
import java.util.Scanner;
public class Q7_VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
    }
}


// 8. 
import java.util.Scanner;
public class Q8_VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel.");
        } else {
            System.out.println("Consonant.");
        }
    }
}



// 9.  
import java.util.Scanner;
public class Q9_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();
        System.out.print("Enter marks of Subject 4: ");
        int m4 = sc.nextInt();
        System.out.print("Enter marks of Subject 5: ");
        int m5 = sc.nextInt();
        
        total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;
        
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}


// 10. 
import java.util.Scanner;
public class Q10_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year.");
        } else {
            System.out.println("Not a leap year.");
        }
    }
}

// 11. 
import java.util.Scanner;
public class Q11_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println("Prime number.");
        } else {
            System.out.println("Not a prime number.");
        }
    }
}


// 12. 
import java.util.Scanner;
public class Q12_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}


// 13. 
import java.util.Scanner;
public class Q13_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}


// 14. 
public class Q14_EvenNumbers {
  public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
          if (i % 2 == 0) {
              System.out.print(i + " ");
          }
      }
  }
}



// 15. 
import java.util.Scanner;
public class Q15_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        
        System.out.println("Factorial is: " + fact);
    }
}



// 16. 
import java.util.Scanner;
public class Q16_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        switch (op) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;
            case '-':
                System.out.println("Difference: " + (a - b));
                break;
            case '*':
                System.out.println("Product: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Quotient: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}



// 17. 
import java.util.Scanner;
public class Q17_DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}




// 18. 
import java.util.Scanner;
public class Q18_MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month.");
        }
    }
}



// 19. 
import java.util.Scanner;
public class Q19_SwitchVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

// 20. 
import java.util.Scanner;
public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPerfectSquare = false;
        
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }
        
        if (isPerfectSquare) {
            System.out.println("Perfect square.");
        } else {
            System.out.println("Not a perfect square.");
        }
    }
}


// 21. 
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}



// 22. 
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}


// 23. 
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        if (original == reversed) {
            System.out.println("Palindrome number.");
        } else {
            System.out.println("Not a palindrome number.");
        }
    }
}


// 24. 
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}


// 25. 
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                count++;
                num /= 10;
            }
        }
        
        System.out.println("Number of digits: " + count);
    }
}
