// 2.Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

// Note : Keep the first of the array unaltered. 

// Example 1:

// 5  —Value of N
// {10, 20, 30, 40, 50}  —Element of Arr[ ]
// 2  —–Value of K
// Output :

// 40 50 10 20 30

// Example 2:

// 4  —Value of N
// {10, 20, 30, 40}  —Element of Arr[]
// 1  —–Value of K
// Output :

// 40 10 20 30

// public class TCS_day_4 {
//     static int[] rotate(int nums[], int n, int k) {
//         if (k > n)
//         k = k % n;
        
//         int[] ans = new int[n];
        
//         for (int i = 0; i < k; i++) {
//         ans[i] = nums[n - k + i];
//         }
        
//         int index = 0;
//         for (int i = k; i < n; i++) {
//         ans[i] = nums[index++];
//         }
//         return ans;
//         }
//         public static void main(String[] args) {
//         int Array[] = { 1, 2, 3, 4, 5 };
//         int N = 5;
//         int K = 2;
        
//         int[] ans = rotate(Array, N, K);
//         for (int i = 0; i < N; ++i) {
//         System.out.println(ans[i]);
//         }
//         }
// }


// 2. Problem Statement –

// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

// Example 1 :

// N=8 and arr = [4,5,0,1,9,0,5,0].

// There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

// Input :

// 8  – Value of N

// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

// Output:

// 4 5 1 9 5 0 0 0

// Example 2:

// Input:

// 6 — Value of N.

// [6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline

// Output:

// 6 1 8 2 0 0

// import java.util.*;
// class TCS_day_4
// {
//     public static void main(String[] args)
//     {
//             try (Scanner sc = new Scanner(System.in)) {
//                 int n=sc.nextInt();
//                 int arr[]=new int[n];
//                 for(int i=0;i< n;i++)
//                       arr[i]=sc.nextInt();
//                 int count=0;
//                 for(int i=0;i< n;i++)
//                     if(arr[i]!=0)
//                         arr[count++]=arr[i];
//                  for(int i=count;i < n;i++)
//                      arr[i]=0;
//                  for(int i=0;i< n;i++)
//                         System.out.print(arr[i]+" ");
//             }
//     }
// }