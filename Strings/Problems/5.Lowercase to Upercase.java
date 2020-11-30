/ { Driver Code Starts
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
            //of ToUpperCase class and passing
            //the String and printing the result
            System.out.println(new ToUpperCase().caseConversion(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class ToUpperCase
{
    public static String caseConversion(String str)
    {
        //Complete this function
        /*
        Check if the character's ASCII value is bteween 97 and 122,
        if it is then subtract 32 from it to make it uppercase.
        char[] ch= str.toCharArray();
        */
        str=str.toUpperCase();
        return str;
    }
}
