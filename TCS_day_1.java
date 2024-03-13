//1. Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

// 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
// 2nd data, Total number of wheels = W
// The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
// Example :

// Input :
// 200  -> Value of V
// 540   -> Value of W

// Output :
// TW =130 FW=70

// import java.util.*;
// public class TCS
// {
//     public static void main(String[] args)
//     {
//              try (Scanner sc = new Scanner(System.in)) {
//                 int v=sc.nextInt();
//                  int w=sc.nextInt();
//                  float res=((4*v)-w)/2;
//                  if(w>=2 && (w%2==0) && v<w)              
//                  System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
//                  else                
//                  System.out.println("INVALID INPUT");
//             }
//     }
// }

// 2. Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable.
//  The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal.
//   The ‘*’ and ‘#’ can be at any position in the string.
// Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

// (*>#): positive integer
// (#>*): negative integer
// (#=*): 0
// Example 1:
// Input 1:

// ###***   -> Value of S
// Output :

// 0   → number of * and # are equal


// public class TCS
// {
//  	/**
//  	 * @param args
//  	 */
//  	public static void main(String[] args)
//  	{
        		
//         String str="Hello";
//         int count1=0,count2=0;
//         for(int i=0;i< str.length();i++)
//     	{
//             if(str.charAt(i)=='*')
//         		count1++;
//             else if(str.charAt(i)=='#')
//          		count2++;
//     		}
//         System.out.println(count1-count2);
// 	}
// }