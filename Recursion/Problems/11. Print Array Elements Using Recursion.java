// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            int arr[] = new int[N];
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            new PrintArray().printArrayRecursively(arr, N);
            System.out.println();
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class PrintArray
{
    // Complete the function
    // arr[]: input array
    // n: size of inout array
    public static void printArrayRecursively(int arr[], int n)
    {
        // Print the array elements recursively
    }
}
