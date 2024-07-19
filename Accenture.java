//1.def differenceofSum(n.m)
//        The function takes two integrals m and n as arguments. You are required to obtain the total of all
//        integers ranging between 1 to n (both inclusive) which are not divisible by m. You must also return
//        the distinction between the sum of integers not divisible by m with the sum of integers divisible by m.
//        Assumption
//        m > 0 and n > 0
//        Sum lies within the integral range
//        Example
//        Input:
//        m = 6
//        n = 30
//        Output:
//        285

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Accenture {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int sum1 = 0;
//        int sum2 = 0;
//        for(int i = 1; i<=n; i++)
//        {
//            if(i%m==0)
//            {
//                sum1 = sum1 + i;
//            }
//            else {
//                sum2 = sum2 + i;
//            }
//        }
//        System.out.println(sum2-sum1);
//    }
//}

//2.def LargeSmallSum(arr)
//
//The function takes an integral arr which is of the size or length of its arguments. Return the sum of the
//second smallest element at odd position ‘arr’ and the second largest element at the even position.
//        Assumption
//Every array element is unique.
//Array is 0 indexed.
//        Note:
//If the array is empty, return 0.
//If array length is 3 or <3, return 0.
//Example
//Input:
//Arr: 3 2 1 7 5 4
//Output:
//        7

//import java.util.Arrays;
//public class Accenture {
//    public static void main(String[] args) {
//        int[] arr = {3, 2, 1, 7, 5, 4};
//        int result = LargeSmallSum(arr);
//        System.out.println("Output: " + result); // Output: 7
//    }
//    public static int LargeSmallSum(int[] arr) {
//        if (arr.length == 0 || arr.length < 3) {
//            return 0;
//        }
//        int[] oddPositions = new int[(arr.length + 1) / 2];
//        int[] evenPositions = new int[arr.length / 2];
//        int oddIndex = 0;
//        int evenIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                evenPositions[evenIndex++] = arr[i];
//            } else {
//                oddPositions[oddIndex++] = arr[i];
//            }
//        }
//        Arrays.sort(oddPositions);
//        int secondSmallestOdd = oddPositions[1];
//        Arrays.sort(evenPositions);
//        int secondLargestEven = evenPositions[evenPositions.length - 2];
//        return secondSmallestOdd + secondLargestEven;
//    }
//}

//3. Write a function to validate if the provided two strings are anagrams or not. If the two strings are
//anagrams, then return ‘yes’. Otherwise, return ‘no’.
//Input:
//Input 1: 1st string
//Input 2: 2nd string
//Output:
//        (If they are anagrams, the function will return ‘yes’. Otherwise, it will return ‘no’.)
//Example
//Input 1: Listen
//Input 2: Silent
//Output:
//Yes

//import java.util.*;
//public class Accenture {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        if (areAnagrams(str1, str2)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//    public static boolean areAnagrams(String str1, String str2) {
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        return Arrays.equals(arr1, arr2);
//    }
//}

//4.def Productsmallpair(sum,arr)
//This function accepts the integers sum and arr. It is used to find the arr(j) and arr(k), where k ! = j.
//arr(j) and arr(k) should be the smallest elements in the array.
//Keep this in mind:
//If n<2 or empty, return –1.
//If these pairs are not found, then return to zero.
//Make sure all the values are within the integer range.
//Example
//Input:
//Sum: 9
//Arr: 5 4 2 3 9 1 7
//Output:
//2

//import java.util.*;
//public class Accenture {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = sc.nextInt();
//        int[] arr= new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        int result = Productsmallpair(sum, arr);
//        System.out.println("Output: " + result);
//    }
//
//    public static int Productsmallpair(int sum, int[] arr) {
//        if (arr.length < 2) {
//            return -1;
//        }
//        int min1 = Integer.MAX_VALUE;
//        int min2 = Integer.MAX_VALUE;
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min1) {
//                min2 = min1;
//                min1 = arr[i];
//            } else if (arr[i] < min2) {
//                min2 = arr[i];
//            }
//            if (min1 + min2 == sum) {
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            return 0;
//        } else {
//            return min1 * min2;
//        }
//    }
//}


//5.When the sum of the digits exceeds a total of 9, a carry digit is added to the right-left of the digit.
//Execute the function: Int Numberofcarry(Integer num 1, Integer num 2)
//Assumption
//num1, num2 > = 0
//Example
//Input:
//num1: 451
//num2: 349
//Output:
// 2

//import java.util.*;
//public class Accenture {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.print(numberOfCarries(num1,num2));
//    }
//    public static int numberOfCarries(int num1, int num2) {
//        int carry = 0;
//        int count = 0;
//        while (num1 != 0 || num2 != 0) {
//            int digit1 = num1 % 10;
//            int digit2 = num2 % 10;
//            int sum = digit1 + digit2 + carry;
//            if (sum > 9) {
//                carry = 1;
//                count++;
//            } else {
//                carry = 0;
//            }
//            num1 /= 10;
//            num2 /= 10;
//        }
//        return count;
//    }
//}

//6.The given function has a string (str) and two characters, ch1 and ch2. Execute the function in such a way that
//str returns to its original string, and all the events in ch1 are replaced by ch2, and vice versa.
//Replacecharacter(Char str1, Char ch1, Int 1, Char ch2)
//Assumption
//This string has only alphabets that are in lower case.
//Example
//Input:
//str: apples
//ch1: a
//ch2: p
//Output:
//paales

//import java.util.*;
//public class Accenture{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char ch1 = sc.next().charAt(0);
//        char ch2 = sc.next().charAt(0);
//        System.out.print(replaceCharacter(str,ch1,ch2));
//    }
//    public static String replaceCharacter(String str, char ch1, char ch2) {
//        StringBuilder newStr = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//            if (currentChar == ch1) {
//                newStr.append(ch2);
//            } else if (currentChar == ch2) {
//                newStr.append(ch1);
//            } else {
//                newStr.append(currentChar);
//            }
//        }
//        return newStr.toString();
//    }
//}

//7. Perform the function: Int operationchoices(int c, int n, int a, int b). This function considers three
//positive inputs of a, b and c.
//Execute the function to get:
// (a + b), if c = 1
// (a / b), if c = 4
// (a – b), if c = 2
// (a x b), if c = 3
//
//Example:
//Input:
//a: 12
//b: 16
//c: 1
//Output:
//  28

import java.util.*;
public class Accenture {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(operationChoice(a, b, c));
    }
    public static int operationChoice(int a , int b , int c)
    {
        if(c==1)
            return a+b;
        else if (c==2)
            return a-b;
         else if (c==3)
            return a * b;
        else
            {
                return a / b;
            }
        }
}

