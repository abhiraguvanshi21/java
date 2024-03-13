// 1.Problem Statement: Find all the repeating elements present in an array.

// Examples:

// Example 1:
// Input:
// Arr[] = [1,1,2,3,4,4,5,2]
// Output:
// 1,2,4
// Explanation:
// 1,2 and 4 are the elements which are occurring more than once.

// Example 2:
// Input:
// Arr[] = [1,1,0]
// Output:
// 1
// Explanation:
// Only 1 is occurring more than once in the given array.

// import java.util.Arrays;
// import java.util.Scanner;

// public class TCS_day_7 {
// static void findRepeatingElements(int arr[]) {
// Arrays.sort(arr);

// System.out.print("The repeating elements are: ");
// for(int i=0;i<arr.length-1;i++)
// if(arr[i] == arr[i+1])
// System.out.print(arr[i]+" ");
// }
// public static void main(String[] args) {
// try (Scanner sc = new Scanner(System.in)) {
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i =0;i<n;i++)
// {
// arr[i] = sc.nextInt();
// }
// findRepeatingElements(arr);
// }
// }
// }

// *************************************

// 2.Problem Statement: Find all the non-repeating elements for a given array.
// Outputs can be in any order.

// Examples:

// Example 1:
// Input:
// Nums = [1,2,-1,1,3,1]
// Output:
// 2,-1,3
// Explanation:
// 1 is the only element in the given array which occurs thrice in the array.
// -1,2,3 occurs only once and hence, these are non-repeating elements of the
// given array.

// Example 2:
// Input:
// Nums = [1,2,3]
// Output:
// 1,2,3
// Explanation:
// All elements present in the array occur once. Hence, every element is
// non-repeating.

// import java.util.*;

// public class TCS_day_7 {
// static void findNonRepeatingElement(int nums[]) {
// Arrays.sort(nums);

// if (nums[0] != nums[1])
// System.out.print(nums[0] + " ");

// for (int i = 1; i < nums.length - 1; i++)
// if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1])
// System.out.print(nums[i] + " ");

// if (nums[nums.length - 2] != nums[nums.length - 1])
// System.out.print(nums[nums.length - 1]);
// }

// public static void main(String[] args) {
// try (Scanner sc = new Scanner(System.in)) {
// int n = sc.nextInt();
// int nums[] = new int[n];
// for (int i = 0; i < n; i++) {
// nums[i] = sc.nextInt();
// }
// System.out.println("Non-repeating numbers are: ");
// findNonRepeatingElement(nums);
// }
// }
// }

// ********************************

// 3.Problem Statement: Given an array of pairs, find all the symmetric pairs in
// the array.

// Examples:

// Example 1:
// Input: (1,2),(2,1),(3,4),(4,5),(5,4)
// Output: (2,1) (5,4)
// Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4)
// are symmetric pairs.

// Example 2:
// Input: (1,5),(2,3),(4,2),(5,1),(2,4)
// Output: (2,4) (5,1)
// Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2)
// are symmetric pairs

// public class TCS_day_7{
// public static void main(String args[]) {
// int n = 5;
// int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
// System.out.println("The symmetric pairs are: ");
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
// System.out.print("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
// break;
// }
// }
// }
// }
// }

// *****************************

// 4.Maximum Product Subarray in an Array
// Problem Statement: Given an array that contains both negative and positive
// integers, find the maximum product subarray.

// Examples
// Example 1:
// Input:
// Nums = [1,2,3,4,5,0]
// Output:
// 120
// Explanation:
// In the given array, we can see 1×2×3×4×5 gives maximum product value.

// Example 2:
// Input:
// Nums = [1,2,-3,0,-4,-5]
// Output:
// 20
// Explanation:
// In the given array, we can see (-4)×(-5) gives maximum product value.

// import java.util.*;

// public class TCS_day_7 {

// public static int subarrayWithMaxProduct(int []arr){
// int n=arr.length;
// int ans=Integer.MIN_VALUE;
// int prefix=1;
// int suffix=1;
// for(int i=0; i<n; i++){
// if(prefix==0) prefix=1;
// if(suffix==0) suffix=1;
// prefix=prefix*arr[i];
// suffix=suffix * arr[n-i-1];
// ans=Math.max(ans,Math.max(prefix,suffix));
// }
// return ans;
// }
// public static void main(String[] args) {
// try (Scanner sc = new Scanner(System.in)) {
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i =0;i<n;i++)
// {
// arr[i] = sc.nextInt();
// }
// int answer = subarrayWithMaxProduct(arr);
// System.out.println("The maximum product subarray is: " + answer);
// }
// }
// }

/// *******************************************

// 5.Check if array is subset of another array
// Check if array is subset of another array.

// Write a program to find whether an array is a subset of another array or not.

// Given arr1[] and arr2[], we need to find whether arr1[] is a subset of
// arr2[]. An array is called a subset of another if all of its elements are
// present in the other array.

// Note: Array elements are assumed to be unique.

// Examples:

// Example 1:
// Input: arr1[]= [1,3,4,5,2]
// arr2[]= [2,4,3,1,7,5,15]
// Output: arr1[] is a subset of arr2[]

// Example 2:
// Input: arr1[]= [1,3,4,5,2]
// arr2[]= [4,5,2]
// Output: arr1[] is not a subset of arr2[]

// import java.util.*;

// class TCS_day_7 {
// static boolean isSubset(int arr1[], int m, int arr2[], int n) {
// if (m > n)
// return false;
// for (int i = 0; i < m; i++) {
// boolean present = false;
// for (int j = 0; j < n; j++) {
// if (arr2[j] == arr1[i]) {
// present = true;
// break;
// }
// }
// if (present == false)
// return false;
// }
// return true;
// }

// public static void main(String[] args) {
// try (Scanner sc = new Scanner(System.in)) {
// int m = sc.nextInt();
// int arr1[] = new int[m];
// for (int i = 0; i < m; i++) {
// arr1[i] = sc.nextInt();
// }
// int n = sc.nextInt();
// int arr2[] = new int[n];
// for (int j = 0; j < n; j++) {
// arr2[j] = sc.nextInt();
// }

// boolean ans = isSubset(arr1, m, arr2, n);

// if (ans == true)
// System.out.print("arr1[] is a subset of arr2[]");
// else
// System.out.print("arr1[] is not a subset of arr2[]");
// }

// }
// }

// *************************************

// 6.Search an Element in an Array : Program CPP Java
// Problem Statement: Search an element in an array and return its position

// Examples:

// Example 1:
// Input: array[] = {1,2,3,4,5} k=3 Output: 2 Explanation: The answer is 2
// because 3 is present at 2nd index.

// Example 2:
// Input: array[]={6,7,9,5,3,10} k=10
// Output: 5
// Explanation: The answer is 5 because 10 is present at 5th index

// import java.util.Scanner;

// public class TCS_day_7 {
// public static void main(String args[]) {
// try (Scanner sc = new Scanner(System.in)) {
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i =0;i<n;i++)
// {
// arr[i] = sc.nextInt();
// }
// int k = 10;
// int ans = -1;
// for (int i = 0; i < n; i++) {
// if (arr[i] == k) {
// ans = i;
// break;
// }
// }
// System.out.print("The element is present in "+ans+" index");
// }
// }
// }

// *****************************

// 7.Sort Elements of an Array by Frequency
// Sort Elements of an Array by Frequency

// Problem Statement: Given an array of integers, having some duplicate
// elements, sort the array by frequency.

// Examples:

// Example 1:
// Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
// Output: 2 2 2 1 1 3 3 4
// Explanation: Since 2 is present 3 times in an array , so print it 3 times
// ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it
// will be printed at last.

// Example 2:
// Input: N = 6, array[] = {-199,6,7,-199,3,5}
// Output: -199 -199 3 5 6 7
// Explanation: Since -199 is present 2 times so it will be printed at first ,
// then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted
// order.

// import java.util.*;
// public class TCS_day_7 {
// // Function to swap elements
// public static void swap(int[][] arr, int i, int j) {
// int temp1 = arr[0][i];
// arr[0][i] = arr[0][j];
// arr[0][j] = temp1;

// int temp2 = arr[1][i];
// arr[1][i] = arr[1][j];
// arr[1][j] = temp2;
// }
// // Function to sort 2d array by frequency
// public static void sort2darray(int[][] array2d, int k) {
// for (int i = 0; i < k - 1; i++) {
// for (int j = 0; j < k - 1 - i; j++) {
// if (array2d[1][j] < array2d[1][j + 1]) {
// swap(array2d, j, j + 1);
// }
// }
// }
// }
// // Function to sort elements of array by frequency
// public static void Sortele(int[] arr, int n) {
// // Step 1: Sort the array
// Arrays.sort(arr, 0, n);
// // Step 2: Create a 2d array
// int[][] arr2d = new int[2][100];
// int k = 0;
// int count = 0;
// for (int i = 0; i < n; i++) {
// if (i == 0) {
// arr2d[0][k] = arr[i];
// count = 1;
// } else if (arr[i] == arr[i - 1]) {
// count++;
// } else {
// arr2d[1][k] = count;
// count = 1;
// k++;
// arr2d[0][k] = arr[i];
// }
// }
// arr2d[1][k] = count;
// k++;

// // Step 3: sort the 2d array according to frequency
// sort2darray(arr2d, k);

// // Step 4: Store the answer in original array
// k = 0;
// int i = 0;
// while (i < n) {
// while (arr2d[1][k] > 0) {
// arr[i] = arr2d[0][k];
// i++;
// arr2d[1][k]--;
// }
// k++;
// }
// }
// public static void main(String args[]) {
// int n = 8;
// int[] arr = {1,2,3,2,4,3,1,2};
// Sortele(arr, n);
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }