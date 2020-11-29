/ { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

public class Driver {

    public static void main(String[] args)throws IOException {
        
        //using BufferedReader class to the read the input
        BufferedReader read = new BufferedReader((new InputStreamReader(System.in)));
        
        //reading total count of testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            //reading the string
            String str = read.readLine();
            
            //calling the countVowels method
            //while passing String and
            //printing the output
            System.out.println(new CountAllVowels().countVowels(str));

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class CountAllVowels
{
    // Complete the funciton
    // str: input string
    public static int countVowels(String str)
    {
        // count number of vowels present in string
        int cnt=0;
        char[] ch= str.toCharArray();//creates array and Storing the array
        for (int i=0;i<str.length();i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'i')
                cnt++;
        
        }
        return cnt;
    }
}
