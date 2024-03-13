// 1.Problem Statement:  Given a number check if it is a palindrome.

// An integer is considered a palindrome when it reads the same backward as forward.

// Examples:

// Example 1:
// Input: N = 123
// Output: Not Palindrome Number
// Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

// Example 2:
// Input: N =  121 
// Output: Palindrome Number
// Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.

// import java.util.Scanner;

// public class TCS_day_8 {
//     static int reverse(int X) {
//         int Y = 0;
//         while (X > 0) {
//             int digit = X % 10;
//             Y = Y * 10 + digit;
//             X = X / 10;
//         }
//         return Y;
//     }

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int X = sc.nextInt();
//             int dummy = X;
//             int Y = reverse(X);
//             if (dummy == Y) {
//                 System.out.println("Palindrome Number");
//             } else {
//                 System.out.println("Not Palindrome Number");
//             }
//         }

//     }
// }

//                  ****************⭐⭐⭐⭐⭐⭐⭐⭐⭐***************

// 2.Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.

// Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552

// Examples:

// Example 1:
// Input: min = 10 , max = 50
// Output: 11 22 33 44 
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

// Example2:
// Input: min = 100 , max = 150
// Output: 101 111 121 131 141 
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

// import java.util.*;

// public class TCS_day_8 {
//     static boolean isPalindrome(int n) {
//         int reverse = 0;
//         int temp = n;
//         while (temp > 0) {
//             reverse = reverse * 10 + temp % 10;
//             temp = temp / 10;
//         }
//         if (n == reverse)
//             return true;
//         return false;
//     }

//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int min = sc.nextInt();
//             int max = sc.nextInt();
//             for (int i = min; i <= max; i++) {
//                 if (isPalindrome(i)) {
//                     System.out.print(i + " ");
//                 }
//             }
//         }

//     }
// }

//             *****************⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐*******************

// 3.Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.

// Examples 1 2 3 5 7 11 13 17 19 …

// Examples
// Example 1:
// Input: N = 3
// Output: Prime
// Explanation: 3 is a prime number

// Example 2:
// Input: N = 26
// Output: Non-Prime
// Explanation: 26 is not prime

// import java.util.Scanner;

// class TCS_day_8 {
//     public static boolean isPrime(int N) {
//         for (int i = 2; i < N; i++) {
//             if (N % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             boolean ans = (isPrime(n));
//             if (n != 1 && ans == true) {
//                 System.out.println("Prime Number");
//             } else {
//                 System.out.println("Non-Prime Number");
//             }
//         }
//     }
// }

//                   ***************⭐⭐⭐⭐⭐⭐⭐**************

// 4.Problem Statement: Given a and b, find prime numbers in a given range [a,b], (a and b are included here).

// Examples:

// Examples:
// Input: 2 10
// Output: 2 3 5 7 
// Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

// Example 2:
// Input: 10 16
// Output: 11 13 
// Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.

// import java.util.Scanner;

// public class TCS_day_8 {
//     public static boolean isPrime(int num) {
//       if (num == 1)
//         return false;
//       for (int i = 2; i < Math.sqrt(num); i++) {
//         if (num % i == 0)
//           return false;
//       }
//       return true;
//     }
//     public static void PrintPrimesbwrange(int a, int b) {
//       for (int i = a; i <= b; i++) {
//         if (isPrime(i)) {
//           System.out.print(i + " ");
//         }
//       }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       PrintPrimesbwrange(a, b);
//     }
//   }

///               ******************⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐*********************

// 5.Problem Statement: Given a number, check if it is Armstrong Number or Not.

// Examples:

// Example 1:
// Input:153 
// Output: Yes, it is an Armstrong Number
// Explanation: 1^3 + 5^3 + 3^3 = 153

// Input:170 
// Output: No, it is not an Armstrong Number
// Explanation: 1^3 + 7^3 + 0^3 != 170

// import java.util.*;
// public class TCS_day_8{
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int r, sum = 0;
//             int temp = n;
//             while(temp!=0)
//             {
//                 r = temp%10;
//                  sum = sum + r^3;
//                 temp = temp/10;
//             }
//             if(sum == n)
//                 System.out.println(n+" is an armstrong number");
//             else
//                 System.out.println(n+"is not armstrong number");
//         }
//     }
// }

//                ************ ⭐⭐⭐⭐⭐⭐⭐⭐***************

// 6.Problem Statement: Perfect Number. Write a program to find whether a number is a perfect number or not.

// A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself). 

// Examples:

// Example 1:
// Input: n=6
// Output: 6 is a perfect number

// Example 2:
// Input: n=15
// Output: 15 is not a perfect number

// Example 3:
// Input: n=28
// Output: 28 is a perfect number
// Reason:
// For 6 and 28 , the sum of their proper divisors (1+2+3) and (1+4+7+14) is equal to the respective numbers and for 15 it is not.

// import java.util.Scanner;

// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int sum = 0;
//             for(int i =1;i<=n-1;i++)
//             {
//                 if(n%i==0)
//                 sum = sum+i;
//             }
//             if(sum ==n)
//             {
//                 System.out.println(n+"is a perfect number");
//             }
//             else
//             {
//                 System.out.println(n+"is not perfect number");
//             }
//         }
//     }
// }

//            *****************⭐⭐⭐⭐⭐⭐⭐***************

// 7.Check whether a given number is even or odd
// Problem Statement: Given a number n, check whether a given number is even or odd.

// Examples:

// Example 1:
// Input: n=5
// Output: odd
// Explanation: 5 is not divisible by 2.

// Example 2:  
// Input: n=6
// Output: even
// Explanation: 6 is divisible by 2.

// import java.util.Scanner;

// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             if(n%2==0)
//             {
//                 System.out.println(n+" is a even number");
//             }
//             else
//             {
//                 System.out.println(n+"isa odd number");
//             }
//         }
//     }
// }

//   *****************⭐⭐⭐⭐⭐⭐******************

// 8.Problem statement: Given a number n check whether it’s positive or negative.

// Examples:

// Example 1:
// Input: n=5
// Output: Positive

// Example2:
// Input: n=-6
// Output: Negative

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             if(n>0)
//             {
//                 System.out.println("positive");
//             }
//             else
//             {
//                 System.out.println("negative");
//             }
//         }
//     }
// }

//       *****************⭐⭐⭐⭐⭐⭐⭐***************

// 9.Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

// Examples:

// Example 1:
// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15

// Example 2:
// Input: N=6
// Output: 21
// Explanation: 1+2+3+4+5+6=15

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int sum = 0;
//             for(int i = 1;i<=n;i++)
//             {
//                 sum = sum+i;
//             }
//             System.out.println("sum of the natural number is:"+ sum);
//         }

//     }
// }

//           ******************⭐⭐⭐⭐⭐⭐*******************

// 10.Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

// a = first term of A.P.

// d= common Difference of A.P.

// n= Number of Terms in  A.P.

// Examples:

// Example 1:
// Input:
// n=4
// a=2
// d=2
// Output: 20
// Explanation: 2+4+6+8 = 20

// Input:
// n=8
// a=2
// d=5
// Output: 124
// Explanation: -2 +3 + 8 + 13 + 18 + 23 + 28 + 33 = 124

// sum = n/2*(2*a+(n-1)*d)

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int a = sc.nextInt();
//             int d = sc.nextInt();
//             int n = sc.nextInt();
//             double sum = (n/2)*(2*a+(n-1)*d);
//             System.out.println(sum);
//         }
//     }
// }

//    ************⭐⭐⭐⭐⭐⭐⭐************

// 11.Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as:-

// a, first term
// r, common ratio
// n, number of terms
//  Write a program to find the sum of the geometric Progression Series.

// Examples:

// Example 1:
// Input: a=1 , r=0.5 , n=3
// Output: 1.75
// Explanation: The sum of given GP Series is 1.75

// Example 2:
// Input: a=3 , r=5 , n=2
// Output: 18
//Explanation: The sum of the given GP Series is 18

// sum = a*(r^n-1)/(r-1)

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             float a = sc.nextInt();
//             float r = sc.nextInt();
//             float n = sc.nextInt();
//             float sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
//             System.out.println(sum);
//         }
//     }
//     }

//            **************⭐⭐⭐⭐⭐⭐*************

// 12.Problem Statement: Given two numbers. Find the greatest of two numbers.

// Examples:

// Example 1:
// Input: 1 3
// Output: 3
// Explanation: Answer is 3,since 3 is greater than 1.

// Input: 1.123  1.124
// Output: 1.124
// Explanation: Answer is 1.124,since 1.124 is greater than 1.123.

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             double n1 = sc.nextInt();
//             double n2 = sc.nextInt();
//             if(n1>n2)
//             System.out.println(n1);
//             else
//             System.out.println(n2);
//         }
//     }
// }

//         **************⭐⭐⭐⭐⭐⭐⭐***************

// 13.Problem Statement: Given three numbers. Find the greatest of three numbers.

// Examples:

// Example 1:
// Input: 1 3 5
// Output: 5
// Explanation: Answer is 5.Since 5 is greater than 1 and 3.

// Example 2:
// Input: 1.123  1.124 1.125
// Output: 1.125
// Explanation: Answer is 1.125. Since 1.125 is greater than 1.123 and 1.124

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c = sc.nextInt();
//             System.out.println("number is:"+Math.max(a,Math.max(b,c)));
//         }

//     }
// }

//          *****************⭐⭐⭐⭐⭐⭐⭐*******************

//14.Problem Statement: Check if the given year is a leap year or not.

// Examples:

// Example 1:
// Input: 1996
// Output: Yes
// Explanation: Since 1996 is a leap year answer is “Yes”.

// Example 2:
// Input: 2000
// Output: Yes

// Explanation: Since 2000 is a leap year answer is “Yes”.

// import java.util.*;
// public class TCS_day_8 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             if(n%4==0 && n%400==0)
//             {
//                 System.out.println("leap year");
//             }
//             else
//             {
//                 System.out.println("not leap year");
//             }
//         }
//     }
// }

//         **************⭐⭐⭐⭐⭐⭐************

// 15.Example 1:
// Input: N = 472
// Output: 274
// Explanation: Reading the number from back to front, we see that the output should be 274

// Example 2:
// Input: N = 470
// Output: 74
// Explanation: Reading the number from back to front, we get 074. For an integer with no decimals, we know that leading zeros have no significance and therefore our answer should be 74

// import java.util.*;

// public class TCS_day_8 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int sum = 0, rem = 0;
//             int temp = n;
//             while (temp != 0) {
//                 rem = temp % 10;
//                 sum = sum * 10 + rem;
//                 temp = temp / 10;
//             }
//             System.out.println(sum);
//         }
//     }
// }

//     ************⭐⭐⭐⭐⭐⭐⭐**************

// 16.Problem Statement: Given a number N, print the smallest and largest digits present in the number.

// Examples:

// Example 1:
// Input: N = 2746
// Output: Largest digit: 7
//         Smallest digit: 2
// Explanation: By simply going through the digits of 
// the number, we figure out the largest and smallest 
// digit in the number.

// Example 2:
// Input: N = 23004
// Output: Largest digit : 4
//         Smallest digit : 0
// Explanation: By simply going through the digits of 
// the number, we figure out the largest and smallest 
// digit in the number.

// import java.util.*;

// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int d;
//             int mini = Integer.MAX_VALUE;
//             int maxi = Integer.MIN_VALUE;
//             while (n != 0) {
//                 d = n % 10;
//                 mini = Math.min(mini, d);
//                 maxi = Math.max(maxi, d);
//                 n = n / 10;
//             }
//             System.out.println("The minimum number is: " + mini);
//             System.out.print("The maximum number is: " + maxi);
//         }
//     }
// }

//   ******************⭐⭐⭐⭐⭐⭐************

// 17.Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

// Examples:

// Example 1:
// Input: N = 5
// Output: 0 1 1 2 3 5
// Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

// Example 2:
// Input: 6

// Output: 0 1 1 2 3 5 8
// Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

// import java.util.Scanner;

// public class TCS_day_8 {
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//               if (n == 0) {
//                 System.out.println(0);
//               } else {
//                 int fib[] = new int[n + 1];
//                 fib[0] = 0;
//                 fib[1] = 1;
//                 for (int i = 2; i <= n; i++) {
//                   fib[i] = fib[i - 1] + fib[i - 2];
//                 }
//                 System.out.println("The Fibonacci Series up to "+n+"th term:");
//                 for (int i = 0; i <= n; i++) {
//                   System.out.print(fib[i] + " ");
//                 }
//               }
//         }
//     }
//   }

//           ***********⭐⭐⭐⭐⭐⭐*****************

// 18.Problem Statement: Given a number X,  print its factorial.

// To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

// Note: X  is always a positive number. 

// Examples:

// Example 1:
// Input: X = 5
// Output: 120
// Explanation: 5! = 5*4*3*2*1

// Example 2:
// Input: X = 3
// Output: 6
// Explanation: 3!=3*2*1

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int ans = 1;
//             for(int i =1;i<=n;i++)
//             ans = ans*i;
//             System.out.println(ans);
//         }
//     }
// }

//      ************⭐⭐⭐⭐⭐⭐**********

// 19.Problem Statement: Find the Power of a number.

// Examples:

// Example 1:
// Input: N = 5, k=3
// Output: 125
// Explanation: Since 5*5*5 is 125.

// Example 2:
// Input: n=2 k=4
// Output: 16
// Explanation: Since 2*2*2*2 is 16

// import java.util.*;
// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int k = sc.nextInt();
//             System.out.println(Math.pow(n, k));
//         }
//     }
// }

//    ***********⭐⭐⭐⭐⭐*******

// 20.Problem Statement: Find all factors of a number or find all distinct divisors of a natural number.

// Examples:

// Example 1:
// Input: n = 6
// Output: 1,2,3,6
// Explanation: 6 is divisible by 1,2,3,6

// Example 2:
// Input: n = 9
// Output: 1,3,9
// Explanation: 9 is divisible by 1,3,9

// import java.util.*;

// public class TCS_day_8 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             for (int i = 1; i < n; i++) {
//                 if (n % i == 0)
//                     System.out.println(i);
//             }
//         }
//     }
// }
