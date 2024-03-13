// 1.Problem Statement: Given an array, we have to find the smallest element in the array.

// Examples:

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 0
// Explanation: 0 is the smallest element in the array. 

// Example2: 
// Input: arr[] = {8,10,5,7,9};
// Output: 5
// Explanation: 5 is the smallest element in the array.

// import java.util.Arrays;
// public class TCS_day_5 
// {
//     public static void main(String[] args) 
//     {
//          int arr1[] =  {2,5,1,3,0};
//     System.out.println("The smallest element in array is: " + sort(arr1));
   
//     int arr2[] =  {8,10,5,7,9};
//     System.out.println("The smallest element in array is: " + sort(arr2));
//   }
//   static int sort(int arr[]) {
//     Arrays.sort(arr);
//     return arr[0];
//     }
// }

// 2.Problem statement
// Given an array ‘arr’ of size ‘n’ find the largest element in the array.



// Example:

// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

// Output: 5

// Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample input 1:
// 6
// 4 7 8 6 7 6 
// Sample output 1:
// 8
// Explanation of sample input 1:
// The answer is 8.
// From {4 7 8 6 7 6}, 8 is the largest element.
// Sample input 2:
// 8
// 5 9 3 4 8 4 3 10 
// Sample output 2:
// 10
// Expected Time Complexity:
// O(n), Where ‘n’ is the size of an input array ‘arr’.
// Constraints :
// 1 <= 'n' <= 10^5
// 1 <= 'arr[i]' <= 10^9

// Time Limit: 1 sec

// import java.util.Arrays;
// import java.util.*;
// public class TCS_day_5
//  {
//    public static void main(String[] args) {
//     try (Scanner sc = new Scanner(System.in)) {
//         int n = sc.nextInt();
//         int a[]= new int[n];
//         for(int i = 0;i<n;i++)
//         {
//             a[i]= sc.nextInt();
//         }
//       Arrays.sort(a);
//         System.out.println(a[n-1]);
//     }
//    }
// }

// 3.Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

// Examples
// Example 1:
// Input: [1,2,4,7,7,5]
// Output: Second Smallest : 2
// 	Second Largest : 5
// Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

// Example 2:
// Input: [1]
// Output: Second Smallest : -1
// 	Second Largest : -1
// Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

// import java.util.*;

// public class TCS_day_5 {
//     static private int secondSmallest(int[] arr, int n)
//     {
//         if (n < 2)
//         {
//             return -1;
//         }
//         int small = Integer.MAX_VALUE;
//         int second_small = Integer.MAX_VALUE;
//         int i;
//         for (i = 0; i < n; i++)
//         {
//            if (arr[i] < small)
//            {
//               second_small = small;
//               small = arr[i];
//            }
//            else if (arr[i] < second_small && arr[i] != small)
//            {
//               second_small = arr[i];
//            }
//         }
//        return second_small;
//     }
//     static private int secondLargest(int[] arr, int n)
//     {
//         if(n<2)
//         return -1;
//         int large = Integer.MIN_VALUE;
//         int second_large = Integer.MIN_VALUE;
//         int i;
//         for (i = 0; i < n; i++)
//         {
//             if (arr[i] > large)
//             {
//                 second_large = large;
//                 large = arr[i];
//             }
    
//             else if (arr[i] > second_large && arr[i] != large)
//             {
//                 second_large = arr[i];
//             }
//         }
//         return second_large;
//     }
    
//     public static void main(String[] args)
//     {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             final int arr[] = new int[n];
//             for(int i = 0;i<n;i++)
//             {
//                 arr[i] = sc.nextInt();
//             }
//                 int sS = secondSmallest(arr, n);
//                 int sL = secondLargest(arr, n);
//             System.out.println("Second smallest is "+sS);
//             System.out.println("Second largest is "+sL);
//         }
//     }
// }