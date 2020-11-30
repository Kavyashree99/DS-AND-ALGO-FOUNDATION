// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Diver
{
    public static void main(String args[])throws IOException
    {
        //Taking input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //Reading total testcases count
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
             //reading the String
            String str = read.readLine();
            
            //calling the caseConversion method
            //of ToLowerCase class and passing
            //the String and printing the result
            System.out.println(new ToLowerCase().caseConversion(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class ToLowerCase
{
    public static String caseConversion(String str)
    {
       //Complete this function
       str=str.toLowerCase();
       return str;
    }
}
