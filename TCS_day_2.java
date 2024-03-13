// 1. Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

// Note : 1st element of the array should be considered in the count of the result.

// For example,
// Arr[]={7,4,8,2,9}
// As 7 is the first element, it will consider in the result.
// 8 and 9 are also the elements that are greater than all of its previous elements.
// Since total of  3 elements is present in the array that meets the condition.
// Hence the output = 3.
// Example 1:

// Input 
// 5 -> Value of N, represents size of Arr
// 7-> Value of Arr[0]
// 4 -> Value of Arr[1]
// 8-> Value of Arr[2]
// 2-> Value of Arr[3]
// 9-> Value of Arr[4]

// Output :
// 3

// Example 2:
// 5   -> Value of N, represents size of Arr
// 3  -> Value of Arr[0]
// 4 -> Value of Arr[1]
// 5 -> Value of Arr[2]
// 8 -> Value of Arr[3]
// 9 -> Value of Arr[4]

// Output : 
// 5

// Constraints

// 1<=N<=20
// 1<=Arr[i]<=10000

// import java.util.Scanner;

// public class TCS_day_2 
// {
//      public static void main(String[] args)
//      {
//         try (Scanner sc = new Scanner(System.in)) {
//             int count=0;
//             int n=sc.nextInt();
//             int arr[]=new int[n];
//             for(int i=0;i<n;i++)
//                     {
//                         if(arr[i]<arr[i+1])
//                         count++;
//                     }
//                     System.out.println(count);
//         }
//      }
// }

// 2. A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

// Note :
// RxC- Size of the matrix
// Elements of the matrix M should be only 0 or 1.

// Example 1:
// Input :
// 3   -> Value of R(row)
// 3    -> value of C(column)
// [0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
// Output :
// 3  -> Row 3 has maximum number of 1’s

// Example 2:
// input :
// 4 -> Value of R(row)
// 3 -> Value of C(column)
// [0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
// Output :
// 4  -> Row 4 has maximum number of 1’s

// import java.util.Scanner;

// class TCS_day_2
// {
//      public static void main(String[] args)
//      {
//         try (Scanner sc = new Scanner(System.in)) {
//             int row=sc.nextInt();
//             int col=sc.nextInt();
//             int arr[][]=new int[row][col];
//             for(int i=0;i< row;i++)
//                 for(int j=0;j< col;j++)
//                     arr[i][j]=sc.nextInt();
            
//                   int max=0,count=0,index=0;
//                   for(int i=0;i< row;i++)
//                     { 
//                         count=0;
//                         for(int j=0;j< col;j++)
//                         {
//                             if(arr[i][j]==1)
//                             count++;
//                         }
//                             if(count>max)
//                         {
//                             max=count;
//                             index=i+1;
//                         }
//                      }
//                      System.out.println(index);
//         }
       
//     }
// }