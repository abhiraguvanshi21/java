// 1.Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

// Examples:

// Example 1:
// Input: N = 6, array[] = {13,46,24,52,20,9}
// Output: 9,13,20,24,46,52
// Explanation: After sorting we get 9,13,20,24,46,52

// Input: N = 5, array[] = {5,4,3,2,1}
// Output: 1,2,3,4,5
// Explanation: After sorting we get 1,2,3,4,5

// import java.util.*;

// public class TCS_day_11 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             System.out.print("The array before sorting:");
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             System.out.println();
//             bubble_sort(arr, n);
//         }
//     }

//     public static void bubble_sort(int[] arr, int n) {
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i; j < n; j++) {
//                 if (arr[i] > arr[j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         System.out.print("Array after sorting:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }
// }

//          **************⭐⭐⭐⭐⭐⭐⭐⭐*************

// 2.Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

// Examples:

// Example 1:
// Input: N = 6, array[] = {13,46,24,52,20,9}
// Output: 9,13,20,24,46,52
// Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

// Example 2:
// Input: N=5, array[] = {5,4,3,2,1}
// Output: 1,2,3,4,5
// Explanation: After sorting the array is: 1, 2, 3, 4, 5

// import java.util.*;

// import java.util.Scanner;

// public class TCS_day_11 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             System.out.print("The array before sorting:");
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             System.out.println();
//             selection_sort(arr, n);
//         }
//     }
//     static void selection_sort(int arr[], int n) {
//         for (int i = 0; i < n - 1; i++) {
//             int mini = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[mini]) {
//                     mini = j;
//                 }
//             }
//             //swap
//             int temp = arr[mini];
//             arr[mini] = arr[i];
//             arr[i] = temp;
//         }

//         System.out.println("After selection sort:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }


//      ************⭐⭐⭐⭐⭐⭐⭐*************

// Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.

// Examples:

// Example 1:
// Input: N = 6, array[] = {13,46,24,52,20,9}
// Output: 9,13,20,24,46,52
// Explanation: 
// After sorting the array is: 9,13,20,24,46,52


// Example 2:
// Input: N=5, array[] = {5,4,3,2,1}
// Output: 1,2,3,4,5
// Explanation: After sorting the array is: 1,2,3,4,5

// import java.util.*;

// public class TCS_day_11 {
//     static void insertion_sort(int[] arr, int n) {
//         for (int i = 0; i <= n - 1; i++) {
//             int j = i;
//             while (j > 0 && arr[j - 1] > arr[j]) {
//                 int temp = arr[j - 1];
//                 arr[j - 1] = arr[j];
//                 arr[j] = temp;
//                 j--;
//             }
//         }

//         System.out.println("After insertion sort: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//                         int n = sc.nextInt();
//                         int arr[] = new int[n];
//                         System.out.print("The array before sorting:");
//                         for (int i = 0; i < n; i++) {
//                             arr[i] = sc.nextInt();
//                         }
//                         System.out.println();
//                         insertion_sort(arr, n);
//                     }
//                 }
//     }


//          ************⭐⭐⭐⭐⭐⭐⭐⭐⭐****************

// 4.Problem Statement:  Given an array of n integers, sort the array using the Quicksort method.

// Examples:

// Example 1:
// Input:  N = 5  , Arr[] = {4,1,7,9,3}
// Output: 1 3 4 7 9 

// Explanation: After sorting the array becomes 1, 3, 4, 7, 9

// Example 2:
// Input: N = 8 , Arr[] = {4,6,2,5,7,9,1,3}
// Output: 1 2 3 4 5 6 7 9
// Explanation: After sorting the array becomes 1, 3, 4, 7, 9

// import java.util.*;

// class Solution {
//     static int partition(List<Integer> arr, int low, int high) {
//         int pivot = arr.get(low);
//         int i = low;
//         int j = high;

//         while (i < j) {
//             while (arr.get(i) <= pivot && i <= high - 1) {
//                 i++;
//             }

//             while (arr.get(j) > pivot && j >= low + 1) {
//                 j--;
//             }
//             if (i < j) {
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(j));
//                 arr.set(j, temp);
//             }
//         }
//         int temp = arr.get(low);
//         arr.set(low, arr.get(j));
//         arr.set(j, temp);
//         return j;
//     }

//     static void qs(List<Integer> arr, int low, int high) {
//         if (low < high) {
//             int pIndex = partition(arr, low, high);
//             qs(arr, low, pIndex - 1);
//             qs(arr, pIndex + 1, high);
//         }
//     }
//     public static List<Integer> quickSort(List<Integer> arr) {
//         // Write your code here.
//         qs(arr, 0, arr.size() - 1);
//         return arr;
//     }
// }

// public class TCS_day_11 {
//     public static void main(String args[]) {
//         List<Integer> arr = new ArrayList<>();
//         arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
//         int n = arr.size();
//         System.out.println("Before Using insertion Sort: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr.get(i) + " ");
//         }
//         System.out.println();
//         arr = Solution.quickSort(arr);
//         System.out.println("After insertion sort: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr.get(i) + " ");
//         }
//         System.out.println();
//     }

// } 

//    ***********⭐⭐⭐⭐⭐⭐*********

// 5.Problem:  Given an array of size n, sort the array using Merge Sort.

// Examples:

// Example 1:
// Input: N=5, arr[]={4,2,1,6,7}
// Output: 1,2,4,6,7,


// Example 2:
// Input: N=7,arr[]={3,2,8,5,1,4,23}
// Output: 1,2,3,4,5,8,23

// import java.util.*;

// class Solution {
//     private static void merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>(); // temporary array
//         int left = low;      // starting index of left half of arr
//         int right = mid + 1;   // starting index of right half of arr

//         //storing elements in the temporary array in a sorted manner//

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }

//         // if elements on the left half are still left //

//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         //  if elements on the right half are still left //
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // transfering all elements from temporary to arr //
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//     }

//     public static void mergeSort(int[] arr, int low, int high) {
//         if (low >= high) return;
//         int mid = (low + high) / 2 ;
//         mergeSort(arr, low, mid);  // left half
//         mergeSort(arr, mid + 1, high); // right half
//         merge(arr, low, mid, high);  // merging sorted halves
//     }
// }
// public class TCS_day_11 {
//     public static void main(String args[]) {
//         int n = 7;
//         int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
//         System.out.println("Before sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         Solution.mergeSort(arr, 0, n - 1);
//         System.out.println("After sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

// }