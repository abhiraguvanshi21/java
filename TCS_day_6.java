// 1.Problem Statement: You are given an array. The task is to reverse the array and print it. 

// Examples:

// Example 1:
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

// Example 2:
// Input: N=6 arr[] = {10,20,30,40}
// Output: {40,30,20,10}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

// import java.util.*;
// public class TCS_day_6 
// {
//             static void printArray(int ans[], int n)
//              {
//                 System.out.print("Reversed array is:- \n");
//                 for (int i = 0; i < n; i++) 
//                 {
//                    System.out.print(ans[i] + " ");
//                 }
//              }
//              //Function to reverse array using an auxiliary array
//              static void reverseArray(int arr[], int n) 
//              {
//                 int[] ans = new int[n];
//                 for (int i = n - 1; i >= 0; i--) 
//                 {
//                    ans[n - i - 1] = arr[i];
//                 }
//                 printArray(ans, n);
//              }
//              public static void main(String[] args) 
//              {
//                  Scanner sc = new Scanner(System.in);
//                     int n = sc.nextInt();
//                     int arr[] = new int[n];
//                     for(int i = 0;i<n;i++)
//                     {
//                         arr[i]=sc.nextInt();
//                     }
//                 reverseArray(arr, n);
//              }
// }

//                                 *********************

// 2.Problem statement: Given an array, we have found the number of occurrences of each element in the array.

// Examples:

// Example 1:
// Input: arr[] = {10,5,10,15,10,5};
// Output: 10  3
// 	     5  2
//         15  1
// Explanation: 10 occurs 3 times in the array
// 	         5 occurs 2 times in the array
//               15 occurs 1 time in the array

// Example2: 
// Input: arr[] = {2,2,3,4,4,2};
// Output: 2  3
// 	    3  1
//         4  2
// Explanation: 2 occurs 3 times in the array
// 	         3 occurs 1 time in the array
//              4 occurs 2 time in the array

// import java.util.*;

// public class TCS_day_6 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             countFreq(arr, n);
//         }
//     }
//     public static void countFreq(int arr[], int n) {
//         boolean visited[] = new boolean[n];
//         for (int i = 0; i < n; i++) {
//             if (visited[i] == true)
//                 continue;
//             int count = 1;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     visited[j] = true;
//                     count++;
//                 }
//             }
//             System.out.println(arr[i] + " " + count);
//         }
//     }
// }

//                                 *********************

// 3.Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

// Examples:

// Example 1:
// Input: 8 7 1 6 5 9
// Output: 1 5 6 9 8 7
// Explanation: First three elements are in the ascending order and next three elements are in the descending order.

// Example 2:
// Input: 4 2 8 6 15 5 9 20
// Output: 2 4 5 6 20 15 9 8

// import java.util.*;
// public class TCS_day_6 {
//       public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//               int arr[] = new int[n];
//               for(int i = 0;i<n;i++)
//               {
//                 arr[i] = sc.nextInt();
//               }
//               Arrays.sort(arr);
//               for(int i = 0;i<n/2;i++)
//               {
//                 System.out.print(arr[i] + " ");
//               }
//               for(int j = n-1;j>=n/2;j--)
//               {
//                 System.out.print(arr[j]+" ");
//               }
//         }
//       }
// }

//                                 *********************

// 4.Problem Statement: Given an array, we have to find the sum of all the elements in the array.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 15
// Explanation: Sum of all the elements is 1+2+3+4+5 = 15

// Example 2:
// Input:  N=6, array[] = {1,2,1,1,5,1}
// Output: 11
// Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11

// import java.util.*;
// public class TCS_day_6 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for(int i = 0;i<n;i++)
//             {
//                 arr[i]= sc.nextInt();
//             }
//             int sum = 0;
//             for(int i =0;i<n;i++)
//             {
//                 sum = sum+arr[i];
//             }
//             System.out.println(sum);
//         }
//     }
// }

//                                 *********************

// 5.Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
// Explanation: Rotate the array to right by 2 elements.

// Example 2:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
// Output: {4,5,6,7,1,2,3}
// Explanation: Rotate the array to right by 3 elements.

// public class TCS_day_6 {

//     public static void swap(int[] arr, int a, int b, int k) {
//         for (int i = 0; i < k; i++) {
//           int temp = arr[a + i];
//           arr[a + i] = arr[b + i];
//           arr[b + i] = temp;
//         }
//       }
//       public static void BlockSwap(int[] arr, int i, int k, int n) {
//         if (k == 0 || k == n)
//           return;
//         if (k == n - k) {
//           swap(arr, i, n - k + i, k);
//           return;
//         }
//         else if (k < n - k) {
//           swap(arr, i, n - k + i, k);
//           BlockSwap(arr, i, k, n - k); 
//         }
//         else {
//           swap(arr, i, k, n - k);
//           BlockSwap(arr, n - k + i, 2 * k - n, k);
//         }
//       }
//       public static void main(String args[]) {
//         int[] arr = {1,2,3,4,5,6,7};
//         int n = 7;
//         int k = 2;
//         BlockSwap(arr, 0, k, n);
//         System.out.println("After Rotating the array ");
//         for (int i = 0; i < n; i++)
//           System.out.print(arr[i] + " ");
//     }
// // }

//                                 *********************

// 6.Problem Statement: Given an array, we have to find the average of all the elements in the array.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 3
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

// Example 2:
// Input:  N=6, array[] = {1,2,1,1,5,1}
// Output: 1.8
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8

// import java.util.*;

// public class TCS_day_6 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             double sum = 0;
//             for (int i = 0; i < n; i++) {
//                 sum =sum + (double) arr[i];
//             }
//             double average = sum/n;
//             System.out.println(average);
//         }
//     }
// }

//                                 *********************

// 7.Find Median of the given Array
// Problem Statement: Given an unsorted array, find the median of the given array.

// Examples:

// Example 1:
// Input: [2,4,1,3,5]
// Output: 3

// Example 2:
// Input: [2,5,1,7]
// Output: 3.5

// import java.util.Arrays;
// import java.util.Scanner;
// class TCS_day_6
// {
// static private void getMedian(int[] arr, int n)
// {
// 	Arrays.sort(arr);

// 	if (n % 2 == 0)
// 	{
// 		int i1 = (n / 2) - 1;
// 		int i2 = (n / 2);
// 		System.out.print((double)(arr[i1] + arr[i2]) / 2);
// 	}
// 	else
// 	{
// 		System.out.print(arr[(n / 2)]);
// 	}
// }
// public static void main(String[] args)
// {
// 	try (Scanner sc = new Scanner(System.in)) {
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i =0;i<n;i++)
//         {
//             arr[i] =  sc.nextInt();
//         }
//         System.out.print("The median of the array is: ");
//         getMedian(arr, n);
//     }
// }
// }

//                                 *********************

// 8.Remove Duplicates in-place from Sorted Array
// Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

// Note: Return k after placing the final result in the first k slots of the array.

// Examples
// Example 1: 

// Input: arr[1,1,2,2,2,3,3]

// Output: arr[1,2,3,_,_,_,_]

// Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

// Example 2: 

// Input: arr[1,1,1,2,2,3,3,3,3,4,4]

// Output: arr[1,2,3,4,_,_,_,_,_,_,_]

// Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

// import java.util.*;

// public class TCS_day_6 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             int k = removeDuplicates(arr);
//             System.out.println("The array after removing duplicate elements is:- ");
//             for (int i = 0; i < k; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//     }
//     public static int removeDuplicates(int []arr) {
//         int i = 0;
//         for (int j = 1; j < arr.length; j++) {
//             if (arr[i] != arr[j]) {
//                 i++;
//                 arr[i] = arr[j];
//             }
//         }
//         return i + 1;
//     }
// }

//                     **********************

// 9.Remove Duplicates From an Unsorted Array
// Problem Statement: Given an unsorted array, remove duplicates from the array.

// Examples:

// Example 1:
// Input: arr[]={2,3,1,9,3,1,3,9}
// Output:  {2,3,1,9}

// Explanation: Removed all the duplicate elements

// Example 2:
// Input: arr[]={4,3,9,2,4,1,10,89,34}
// Output: {3,4,9,2,1,10,34,89}
// Explanation: Removed all the duplicate elements

// import java.util.*;

// public class TCS_day_6 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             int k = removeDuplicates(arr);
//             System.out.println("The array after removing duplicate elements is:- ");
//             for (int i = 0; i < k; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//     }
//     public static int removeDuplicates(int []arr) {
//         Arrays.sort(arr);
//         int i = 0;
//         for (int j = 1; j < arr.length; j++) {
//             if (arr[i] != arr[j]) {
//                 i++;
//                 arr[i] = arr[j];
//             }
//         }
//         return i + 1;
//     }
// }

//               *********************

// 10.Adding Element in an Array
// Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

// Example:
// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(6)
// insertending(7)
// insertatpos(8,4)
// Output: 6,1,2,8,3,4,5,7
// Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 

// import java.util.*;

// class TCS_day_6 {
//     static void insertatbegin(int[] arr, int n, int value) {
//         for (int i = n - 1; i >= 0; i--) {
//             arr[i + 1] = arr[i];
//         }
//         arr[0] = value;
//     }

//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             int value = sc.nextInt();
//             System.out.println("Before inserting the value at beginning:");
//             for(int i=0;i<n;i++)
//            {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//            insertatbegin(arr,n,value);
//            System.out.println("After inserting the value at beginning:");
//            for(int i=0;i<=n;i++)
//            {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
           
//     }
// }
// }