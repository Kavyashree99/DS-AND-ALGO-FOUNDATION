// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

public class Driver {

    public static void main(String[] args)throws IOException {
        
        //Reading input using BufferedReader
        BufferedReader read = new BufferedReader((new InputStreamReader(System.in)));
        
        //taking total count of testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            //Reading the String
            String str = read.readLine();
            
            //Calling countWords() method of
            //class WordCount and printing the result
            System.out.println(new WordCount().countWords(str));

        }
    }

}// } Driver Code Ends


//User function Template for Java

class WordCount
{
    // Complete the function
    // str: input string
    public static int countWords(String str)
    {
        // find and return the number of words 
        // present in the string
        int cntwords=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')cntwords++;
        }
        return cntwords+1;
    }
}
