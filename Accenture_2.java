//1. Perform the function Int calculate(int m, int n). This function needs two positive integers.
//Calculate the sum of numbers between these two numbers that are divisible by 3 and 5.
//Assumption
//m > n > = 0
//Example
//Input:
//m: 12
//n: 50
//Output:
//   90

//import java.util.*;
//public class Accenture_2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(calculate(m,n));
//    }
//    public static int calculate(int m, int n){
//        int sum = 0;
//        for(int i =m;i <n;i++)
//        {
//            if(i%3==0 && i%5==0)
//            {
//                sum = sum+i;
//            }
//        }
//        return sum;
//    }
//}

// 2. Create a matrix and mention the elements in it. Now, divide the main matrix into two halves in such a way that the
//elements in index 0 are even, the elements in index 1 are odd, and so on.Then arrange the values in ascending order
//for even and odd. After this, calculate the sum of the second largest numbers from both even and odd matrices.
//Example
//The size of the array is 5.
//Element at 0 index: 3
//Element at 1 index: 4
//Element at 2 index: 1
//Element at 3 index: 7
//Element at 4 index: 9
//
//Even array: 1,3,9
//Odd array: 4,7

//import java.util.*;
//public class Accenture_2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] matrix = new int[size];
//        for (int i = 0; i < size; i++) {
//            matrix[i] = scanner.nextInt();
//        }
//        int evenMax = Integer.MIN_VALUE, evenSecondMax = Integer.MIN_VALUE;
//        int oddMax = Integer.MIN_VALUE, oddSecondMax = Integer.MIN_VALUE;
//        for (int num : matrix) {
//            if (num % 2 == 0) {
//                if (num > evenMax) {
//                    evenSecondMax = evenMax;
//                    evenMax = num;
//                } else if (num > evenSecondMax) {
//                    evenSecondMax = num;
//                }
//            } else {
//                if (num > oddMax) {
//                    oddSecondMax = oddMax;
//                    oddMax = num;
//                } else if (num > oddSecondMax) {
//                    oddSecondMax = num;
//                }
//            }
//        }
//        int sum = (evenSecondMax > Integer.MIN_VALUE ? evenSecondMax : 0) + oddSecondMax;
//        System.out.print(sum);
//    }
//}

//3.. Perform the function Checkpassword (char str[], int n)
//Execute the function which happens to be 1 if the str is a valid password or it remains 0.
//Conditions for a valid password:
//The password should have at least 4 characters.
//It should have at least 1 digit.
//It should have one capital letter.
//It should not have any spaces or obliques (/).
//The first character should not be a number.
//Assumption
//The input is not empty.
// Example
//Input:
//aA1_67
//Output:
//1

//import java.util.*;
//public class Accenture_2
//{
//    public static int checkPassword (String str, int n)
//    {
//        if (n < 4)
//            return 0;
//        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
//            return 0;
//        int num = 0, cap = 0;
//        for (int i = 0; i < n; i++)
//        {
//            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
//                return 0;
//            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
//                cap++;
//            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
//                num++;
//        }
//        if (cap > 0 && num > 0)
//            return 1;
//        else
//            return 0;
//    }
//    public static void main (String[]args)
//    {
//        Scanner sc = new Scanner (System.in);
//        String str = sc.next ();
//        System.out.println (checkPassword (str, str.length ()));
//    }
//}

//4. Execute this function Void MaxInArray(int arr[], int length)
//This function helps in finding the maximum element in the array. Execute this function to print
//the maximum element in the array with its index.
//Assumptions
//The index in the array for all the elements starts at 0.
//The maximum element is in a different line in the output.
//There has to be only one maximum element.
//The function prints only what is required.
//Example
//Input:
//  23 45 82 27 66 12 78 13 71 86
//Output:
//  86
//  9

//import java.util.*;
//public class Accenture_2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(maxInArray(n,arr));
//    }
//    public static int maxInArray(int n , int[] arr){
//        int max = Integer.MIN_VALUE;
//        int maxIndex = -1;
//        for(int i = 0;i<n;i++){
//                if(arr[i]>max){
//                    max = arr[i];
//                    maxIndex = i;
//                }
//        }
//        System.out.println(max);
//        return maxIndex;
//    }
//}

//5. Change frequent character
//The function to execute is
//ChatFrequentcharacter(Char str, char x)
//This function has a string and a character. This function requires replacing the most used character in the str
//with the ‘x’ character.
// Note: If two characters have the same frequency, then we will have to consider the frequency which has the lower ASCII value.
//Example
//Input:
//str: bbadbbababb
//char x: t
//Output:
//ttadttatatt

//import java.util.*;
//public class Accenture_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char x = sc.nextLine().charAt(0);
//        int[] freq = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i) - 'a']++;
//        }
//        int mostUsed = 0;
//        char ch = 'a';
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] > mostUsed) {
//                mostUsed = freq[i];
//                ch = (char) (i + 'a');
//            }
//        }
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ch) {
//                res.append(x);
//            }
//            else {
//                res.append(s.charAt(i));
//            }
//        }
//        System.out.println(res);
//    }
//}


//6.Write a function mergeArrays which merges two sorted arrays to create one
//single sorted array. Complete the function int* mergeArrays(int a[], int b[], int asize, int bsize)
//below which takes the pointers to the first element of the two sorted arrays and the size of the arrays,
// and returns the base address of the final sorted array.
//
//Input:
//        4 // Size of 1st array
//        1 2 3 6 // Elements of 1st array
//        3 // Size of 2nd array
//        4 5 7 // Elements of 2nd array
//Output:
//        1
//        2
//        3
//        4
//        5
//        6
//        7

//import java.util.*;
//public class Accenture_2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//        for(int i = 0;i<n;i++)
//        {
//            arr1[i] = sc.nextInt();
//        }
//        int m = sc.nextInt();
//        int[] arr2 = new int[m];
//        for(int j = 0;j<m;j++)
//        {
//            arr2[j] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(mergeArrays(arr1, arr2, n, m)));
//    }
//    public static int[] mergeArrays(int[] arr1, int[] arr2, int n, int m) {
//        int[] merged = new int[n+m];
//        int i = 0, j = 0, k = 0;
//        while (i < n && j < m) {
//            if (arr1[i] <= arr2[j]) {
//                merged[k++] = arr1[i++];
//            } else {
//                merged[k++] = arr2[j++];
//            }
//        }
//        while (i < n) {
//            merged[k++] = arr1[i++];
//        }
//        while (j < m) {
//            merged[k++] = arr2[j++];
//        }
//        Arrays.sort(merged);
//        return merged;
//    }
//}


//7.Create web access management to the kth largest number. It will accept
//an integer k and an array arr as its conditions and has to return the greatest
//element based on the value of k. That is, if k = 0, return the greatest element.
//        If k = 1, return the second greatest element, and so on.
//Example
//Suppose the array contains values like {74, 85, 102, 99, 101, 56, 84} and
//the integer k is 2. The method will return 99, the third greatest element,
//as there are only two (according to the value of k) values greater than 99 (101 and 102).

//import java.util.*;
//public class Accenture_2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        System.out.println(largestNumber(arr,k,n));
//    }
//    public static int largestNumber(int[] arr , int k,int n){
//        Arrays.sort(arr);
//        for(int i=0;i<n;i++) {
//            System.out.print(arr[i]+" ");
//        }
//        return arr[n-k-1];
//    }
//}
//

//8.Find the sum of the divisors for the N integer number.
//Example 1
//Input:
//6
//Output:
//12

//import java.util.*;
//public class Accenture_2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(sumOfDivisior(n));
//    }
//    public static int sumOfDivisior(int n){
//        int sum = 0;
//        for(int i =1;i<=n;i++){
//            if(n%i==0) {
//                sum = sum + i;
//            }
//        }
//        return sum;
//    }
//}

//9.Find a string of a length of 1000 for a large number. Output is the modulo of
//11. The output specification is to return the remainder modulo 11 of the input.
//Input:
//121
//Output:
//0

//import java.util.*;
//public class Accenture_2{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(moduleOf(n));
//    }
//    public static int moduleOf(int n){
//        return n%11;
//    }
//}

//10. Write a function to find if the given string is a palindrome or not.
//Return 1 if the input string is a palindrome, else return 0.
//Input:
//level
//Output:
//1

import java.util.*;
public class Accenture_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }
    public static int isPalindrome(String str)
    {
        if (str == null || str.isEmpty())
        {
            return 0;
        }
        int left = 0, right = str.length() - 1;
        str = str.toLowerCase();
        while (left < right)
        {
            if (str.charAt(left) != str.charAt(right))
            {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
}
















