// 1.Problem Statement: Given a number n. Print all Prime Factors of the given number n.

// Examples:

// Example 1:
// Input: N = 12
// Output: 2,2,3
// Explanation: These are the prime factors of 12.

// Example 2:
// Input: N = 36
// Output: 2,2,3,3
// Explanation: These are the prime factors of 36.

// import java.util.Scanner;

// public class TCS_day_9 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             for (int i = 2; i > 1; i++)
//                 if (n % i == 0) {
//                     while (n % i == 0) {
//                         System.out.println(i);
//                         n = n / i;
//                     }
//                 }
//         }
//     }
// }

//            ***************⭐⭐⭐⭐⭐⭐⭐******************

// 2.Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

// Note : 

// When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.
// Examples:

// Examples 1:
// Input: N = 145
// Output: Yes
// Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

// Example 2:
// Input:  26
// Output: No
// Explanation: 2! + 6! = 722. Hence 26 is not a strong number. 

// public class TCS_day_9 {
//     static int Factorial(int n) {
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }

//     static int Strong_No(int num) {
//         int sum = 0;
//         while (num > 0) {
//             int digit = num % 10;
//             sum = sum + Factorial(digit);
//             num = num / 10;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int number = 145;
//         int answer = Strong_No(number);
//         if (answer == number && number != 0) {

//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }

//              **************⭐⭐⭐⭐⭐⭐⭐*************

// 3.Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

// Examples:

// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number.

// public class TCS_day_9 {
// public static boolean isAutomorphic(int N) {
//     int sq = N * N;
//     while (N > 0) {
//       if (N % 10 != sq % 10)
//         return false;
//       N /= 10;
//       sq /= 10;
//     }

//     return true;
//   }
//   public static void main(String args[]) {
//     int n = 25;
//     if(isAutomorphic(n)==true)
//     System.out.println("Automorphic Number");
//     else
//     System.out.println("Not Automorphic Number");
//   }
// }

//      ***************⭐⭐⭐⭐⭐⭐⭐⭐****************

// 4.Problem Statement: Find the gcd of two numbers.

// Examples
// Example 1:
// Input: num1 = 4, num2 = 8
// Output: 4
// Explanation: Since 4 is the greatest number which divides both num1 and num2.

// Example 2:
// Input: num1 = 3, num2 = 6
// Output: 3
// Explanation: Since 3 is the greatest number which divides both num1 and num2.

// import java.util.*;

// public class TCS_day_9 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n1 = sc.nextInt();
//             int n2 = sc.nextInt();
//             if (n2 % n1 == 0 && n1 % n1 == 0) {
//                 System.out.println(n1);
//             } else {
//                 System.out.println(n2);
//             }
//         }
//     }
// }

//      *************⭐⭐⭐⭐⭐⭐****************

// 5.Problem Statement: Find lcm of two numbers.

// Examples:

// Example 1:
// Input: num1 = 4,num2 = 8
// Output: 8

// Example 2:
// Input: num1 = 3,num2 = 6
// Output: 6

// import java.util.Scanner;

// public class TCS_day_9 {
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int a = sc.nextInt();
//               int b = sc.nextInt();
//               int gcd = 1;
//               for (int i = 1; i <= Math.min(a, b); i++) {
//                 if (a % i == 0 && b % i == 0) {
//                   gcd = i;
//                 }
//               }
//               int lcm = (a * b) / gcd;
//               System.out.print("The LCM of the two given numbers is "+lcm);
//         }
//     }
//   }

//          **************⭐⭐⭐⭐⭐⭐************

// 6.Problem Statement: Check if the number is a Harshad(or Niven) number or not.

// Examples:

// Example 1:
// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

// Example 2:
// Input: 379
// Output: No
//  it is not a Harshad number.
// Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.

// import java.util.Scanner;

// public class TCS_day_9 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int sum = 0;
//             for(int i =0;i<n;i++){
//             sum = sum+i;
//             }
//             if(n%sum==0)
//             {
//                 System.out.println(n+"is a harshad number");
//             }
//             else
//             {
//                 System.out.println(n+"is not a harshad number");
//             }
//         }
//     }
// }

//             ***********⭐⭐⭐⭐⭐⭐**************

// 7.Problem Statement: Check if the number is an abundant number or not.

// Examples:

// Example 1:
// Input: 18
// Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

// Example 2:
// Input: 21
// Output: Not Abundant Number
// Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 11 is not an abundant number.

// import java.util.Scanner;

// public class TCS_day_9 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int sum = 0;
//             for (int i = 1; i < n; i++) {
//                 if (n % i == 0) {
//                     sum = sum +i;
//                 }
//             }
//             if(sum>n)
//             System.out.println("Abundant number");
//             else
//             System.out.println("Not Abundant number");
//         }
//     }
// }

//       ***************⭐⭐⭐⭐⭐⭐⭐************

// 8.Problem Statement: Given an integer, find the sum of digits of that integer.

// Examples:

// Example 1:
// Input: N = 472
// Output: 13
// Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13

// Example 2:
// Input: N = 102
// Output: 3
// Explanation: The digits in the number are 0, 1, and 2. Summing them up gives us a value of 

// import java.util.*;
// public class TCS_day_9 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n =sc.nextInt();
//             int sum =0;
//            while(n>0)
//            {
//             int rem = n%10;
//              sum = sum+rem;
//             n = n/10;
//            }
//             System.out.println(sum);
//         }
//     }
// }

//        *************⭐⭐⭐⭐⭐⭐⭐**************

// 9.Problem Statement: Find the sum of numbers in the given range.

// Examples:

// Example 1:
// Input: l=2, r=7
// Output: 27
// Explanation: 2+3+4+5+6+7=27. Therefore 27 is the answer.

// Example 2:
// Input: l=5, r=9
// Output: 35
// Explanation: 5+6+7+8+9=35. Therefore 35 is the answer.

// import java.util.*;
// public class TCS_day_9 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int s = sc.nextInt();
//             int r = sc.nextInt();
//             int sum =0;
//             for(int i =s;i<=r;i++)
//             {
//                 sum = sum+i;
//             }
//             System.out.print("the sum is:");
//             System.out.print(sum);
//         }
//     }
// }

//        *************⭐⭐⭐⭐⭐⭐⭐*************

// 10.Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

// Examples:

// Example 1:
// Input: N = 5, r = 3
// Output: 60
// Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

// Example 2:
// Input: N=6,r = 4.
// Output: 360

// import java.util.Scanner;

// public class TCS_day_9 {
//     static int fact(int n) {
//       int ans = 1;
//       for (int i = 1; i <= n; i++) {
//         ans *= i;
//       }
//       return ans;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int r = sc.nextInt();
//       int num = fact(n);
//       int den = fact(n - r);
//       System.out.print(num / den);
//     }
//   }

//     ************⭐⭐⭐⭐⭐⭐**************

// 11.Problem Statement: Adding two fractional numbers.

// Examples:

// Example 1:
// Input: 3/4 + 1/7 
// Output: 25/28
// Explanation: Since 3/4 + 1/7 = 25/28

// Example 2:
// Input: 5/2 +1/2
// Output: 3/1
// Explanation: Since 5/2 + 1/2 = 3/1

// import java.util.Scanner;

// public class TCS_day_9 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter numerator 1: ");
//             int num1 = sc.nextInt();
//             System.out.print("Enter denominator 1: ");
//             int den1 = sc.nextInt();

//             System.out.print("Enter numerator 2: ");
//             int num2 = sc.nextInt();
//             System.out.print("Enter denominator 2: ");
//             int den2 = sc.nextInt();

//             int den3 = den1 * den2;
//             int num3 = (num1 * den2) + (num2 * den1);

//             int commonFactor = gcd(num3, den3);
//             den3 /= commonFactor;
//             num3 /= commonFactor;

//             System.out.println("Sum of fractions: " + num3 + "/" + den3);
//         }
//     }

//     private static int gcd(int a, int b) {
//         if (a == 0)
//             return b;
//         return gcd(b % a, a);
//     }
// }

//     ***********⭐⭐⭐⭐⭐⭐⭐*****************

// 12.Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.

// Examples:

// Example 1:
// Input: N = 102003
// Output: 112113
// Explanation: The 2nd,4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

// Example 2:
// Input:  204
// Output: 214
// Explanation: The 2nd position from left contain 0. The resultant integer has replaced the 0 in that position with 1.

// import java.util.*;

// public class TCS_day_9 {
//     static int replaceZerosWithOnes(int num) {
//         if (num == 0) {
//             return 1;
//         }
//         int ans = 0, tmp = 1;
//         while (num > 0) {
//             int d = num % 10;
//             if (d == 0) {
//                 d = 1;
//             }
//             ans = d * tmp + ans;
//             num = num / 10;
//             tmp = tmp * 10;
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int result = replaceZerosWithOnes(n);
//             System.out.println("After replacing zeros with ones " + n + " becomes " + result);
//         }
//     }
// }

//          ***************⭐⭐⭐⭐⭐⭐**************

// 13.Problem: Given a number n, express the number as a sum of 2 prime numbers.

// Examples:

// Example 1:
// Input : N = 74
// Output : True . 
// Explanation: 74 can be expressed as 71 + 3 and both are prime numbers. 

// Example 2:
// Input : N = 11
// Output : False. 
// Explanation: 11 cannot be expressed as sum of two prime numbers

// public class TCS_day_9 {

//     static boolean prime(int n) {

//         if (n <= 1)
//             return false;
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     static boolean isPrime(int n) {
//         if (prime(n) && prime(n - 2)) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int n = 19;
//         if (isPrime(n)) {
//             System.out.println("Yes");
//         } else if (isPrime(n)) {
//             System.out.println("No");
//         }
//     }
// }

//       ***************⭐⭐⭐⭐⭐⭐⭐⭐****************

// 14.Problem Statement: Given the radius of the circle, calculate the area of the circle.

// Examples:

// Example 1:
// Input: N = 5
// Output: 78.5
// Explanation: Using formula  πr2 for finding area of circle we get area as 78.5

// Example 2:
// Input: N = 4
// Output: 50.2
// Explanation: Using formula  πr2 for finding area of circle we get area as 50.2

// import java.util.*;
// public class TCS_day_9 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int r = sc.nextInt();
//             System.out.println("Area of circle is:"+3.14*r*r);
//         }
//     }
// }

//   ************⭐⭐⭐⭐⭐⭐***************

// 15.Problem Statement: The standard form of a quadratic equation is:

// ax2 + bx + c = 0, where a, b and c are real numbers and a != 0

// You have given a, b, c of the equation, you have found the roots of the equation.

// Examples:

// Example 1:
// Input: a = 1, b = -3, c = -10
// Output: Roots are real and different, i.e(5 , -2).

// Example2:

// Input: a = 1, b = 1, c = 1
// Output: Roots are complex, i.e-(-0.5+i1.732 , -0.5-i1.732).

// import java.util.*;

// public class TCS_day_9 {
//     static void Roots(int a, int b, int c) {
//         if (a == 0) {
//             System.out.println("Invalid");
//             return;
//         }

//         int d = b * b - 4 * a * c;
//         double sqrt_val = Math.sqrt(Math.abs(d));

//         if (d > 0) {
//             System.out.println("Roots are real and different ");

//             double root1 = (double) (-b + sqrt_val) / (2 * a);
//             double root2 = (double) (-b - sqrt_val) / (2 * a);
//             System.out.println(root1 + "\n" + root2);
//         } else if (d == 0) {
//             System.out.println("Roots are real and same ");
//             double root1 = -(double) b / (2 * a);
//             double root2 = -(double) b / (2 * a);
//             System.out.println(root1 + "\n" + root2);
//         } else // d < 0
//         {
//             System.out.println("Roots are complex ");

//             System.out.println(-(double) b / (2 * a) + " + i" + sqrt_val + "\n" +
//                     -(double) b / (2 * a) + " - i" + sqrt_val);
//         }
//     }

//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c = sc.nextInt();

//             Roots(a, b, c);
//         }
//     }
// }