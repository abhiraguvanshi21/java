// 1.Problem Statement: Convert a binary number to a decimal number.

// Examples:

// Example 1:
// Input: N = 1011
// Output: 11
// Explanation: 1011 when converted to decimal number is “11”.

// Example 2:
// Input: 100
// Output: 4
// Explanation: 100 when converted to decimal number is “4”.

// import java.util.Scanner;

// public class TCS_day_10 {
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             String s = sc.nextLine();
//             int n = s.length();
//             int base = 1;
//             int ans = 0;
//             for (int i = n - 1; i >= 0; i--) {
//               if (s.charAt(i) == '1') {
//                 ans += base;
//               }
//               base *= 2;
//             }
//             System.out.print(ans);
//         }
//       }
// }

//      ***************⭐⭐⭐⭐⭐⭐⭐⭐****************

// 2.Problem Statement: Convert a binary number to an octal number

// Examples:

// Example 1:.
// Input: N = 1100110
// Output: 146
// Explanation: 1100110 when converted to octal number is “146”.

// Example 2:
// Input: 11111
// Output: 77
// Explanation: 11111 when converted to octal number is “37”.

// import java.util.*;

// public class TCS_day_10 {
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             String s = sc.nextLine();
//             int n = s.length();
//             if (n % 3 == 1) {
//                 s = "00" + s;
//             } else if (n % 3 == 2) {
//                 s = "0" + s;
//             }
//             n = s.length();
//             String ans = "";
//             for (int i = 0; i < n; i += 3) {
//                 int temp = (s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0') * 1;
//                 ans = ans + Integer.toString(temp);
//             }
//             System.out.print(ans);
//         }
//     }
// }

//      ***************⭐⭐⭐⭐⭐⭐⭐⭐*****************

// 3.Problem Statement: Convert decimal to binary number.

// Examples:

// Example 1:
// Input: N = 15
// Output: 1111
// Explanation: 15 in binary is represented as "1111".

// Example 2:
// Input: 18
// Output: 10010
// Explanation: 18 in binary is represented as "10010".

// import java.util.*;
// public class TCS_day_10 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int[] binary = new int[32];
//             int i = 0;
//             while (n > 0) {
//               binary[i] = n % 2;
//               i++;
//               n = n/ 2;
//             }
//             for (int ind = i - 1; ind >= 0; ind--) {
//               System.out.print(binary[ind]);
//             }
//         }
//     }
// }

//         ***************⭐⭐⭐⭐⭐⭐⭐⭐****************

// 4.Problem Statement: Given a decimal number, convert it into Octal Number.

// Examples:

// Example 1:
// Input:  17
// Output: 21
// Explanation: Octal Equivalent of 17 is 21

// Example 2:
// Input:  45
// Output: 55
// Explanation: Octal Equivalent of 45 is 55


// import java.util.*;
// public class TCS_day_10 {
//   public static int DecimaltoOctal(int Decimal) {
//     int i = 0;
//     int Octal = 0;
//     while (Decimal != 0) {
//       int rem = Decimal % 8;
//       Octal += rem * Math.pow(10, i);
//       i++;
//       Decimal /= 8;
//     }
//     return Octal;
//   }
//   public static void main(String[] args) {
//     try (Scanner sc = new Scanner(System.in)) {
//         int Decimal = sc.nextInt();
//         System.out.println("The Octal conversion of the given decimal number is "+DecimaltoOctal(Decimal));
//     }
//   }
// }


//      ***********⭐⭐⭐⭐⭐⭐⭐**************

// 5.Problem Statement: Given an Octal Number, convert it into Binary Number.

// Examples:

// Example 1:
// Input: 345
// Output: 011100101
// Explanation: Binary equivalent of given Octal expressionis 011100101

// Example 2:
// Input: 170
// Output: 001111000
// Explanation: Binary equivalent of given Octal expression is 001111000

// import java.util.*;
// public class TCS_day_10 {
//     public static int DecimaltoBinary(int decimal) {
//         int Binary = 0;
//         int i = 0;
//         while (decimal != 0) {
//           int rem = decimal % 2;
//           Binary += (rem * Math.pow(10, i));
//           i++;
//           decimal = decimal / 2;
//         }
//         return Binary;
//       }
//       public static int OctaltoDecimal(int Octal) {
//         int Decimal = 0;
//         int i = 0;
//         while (Octal != 0) {
//           int rem = Octal % 10;
//           Decimal += rem * Math.pow(8, i);
//           i++;
//           Octal /= 10;
//         }
//         return Decimal;
//       }
//       public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int Octal = sc.nextInt();
//             int Decimal = OctaltoDecimal(Octal);
//             System.out.println("The binary conversion of the given octal number is "+DecimaltoBinary(Decimal));
//         }
//       }
// }

//       ****************⭐⭐⭐⭐⭐⭐⭐*************

// 6.Problem Statement: Given an Octal Number, convert it into a Decimal Number.

// Examples:

// Example 1:
// Input: 345
// Output: 229
// Explanation: Decimal equivalent of given Octal expressionis 229

// Example 2:
// Input: 170
// Output: 121
// Explanation: Decimal equivalent of given Octal expression is121

// import java.util.*;
// public class TCS_day_10 {
//       public static int OctaltoDecimal(int Octal) {
//         int Decimal = 0;
//         int i = 0;
//         while (Octal != 0) {
//           int rem = Octal % 10;
//           Decimal += rem * Math.pow(8, i);
//           i++;
//           Octal /= 10;
//         }
//         return Decimal;
//       }
//       public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int Octal = sc.nextInt();
//             int Decimal = OctaltoDecimal(Octal);
//             System.out.println("The binary conversion of the given octal number is "+ OctaltoDecimal(Decimal));
//         }
//       }
//}

//      *************⭐⭐⭐⭐⭐⭐**************

// 7.Problem Statement: Given a number, convert it into the form of words.

// Note:- Consider maximum no. of digits in the number as 4.

// Examples:

// Example 1:
// Input: 7824
// Output: seven thousand eight hundred twenty four
// Explanation: 7824 in words can be written as seven thousand eight hundred twenty four.

// Example 2:
// Input: 370
// Output: three hundred seventy
// Explanation: 370 in words can be written as three hundred seventy.


// public class TCS_day_10 {
//   public static void convertnumintoword(String str)
//   {
//       String []singledigit = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//   String []twodigits=new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen", "twelve"};
//   String []tensmultiple = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};
//   String []tenspower =new String[] {"hundred", "thousand"};
//   if(str.length()==0)
//   {
//       System.out.println("");
//       return;
//   }
//   else if(str.length()==1)
//   {
//       System.out.println(str.charAt(0)-'0');
//       return;
//   }

//   int len=str.length();

//   for(int i=0;i<str.length();i++)
//   {
//       if(len>2)
//       {
//           if(str.charAt(i)-'0'!=0)
//           {
//               System.out.print(singledigit[str.charAt(i)-'0']+" ");
//               System.out.print(tenspower[len-3]+" ");
//           }
//           len--;
//       }
//       else
//       {
//           if(str.charAt(i)-'0'==1)
//           {
//               System.out.print(twodigits[str.charAt(i+1)-'0']+" ");
//               return;
//           }
//           else if(str.charAt(i)-'0'!=0)
//           {
//               System.out.print(tensmultiple[str.charAt(i)-'0']+" ");
//               if(str.charAt(i+1)-'0'!=0)
//               System.out.print(singledigit[str.charAt(i+1)-'0']);
//               return;
//           }
//       }
//   }
//   }

//   public static void main(String args[]) {
//     String str="9090";
//     convertnumintoword(str);
//   }
// }