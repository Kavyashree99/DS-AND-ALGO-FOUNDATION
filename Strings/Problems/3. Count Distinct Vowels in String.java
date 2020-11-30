/ { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

public class Driver {

    public static void main(String[] args)throws IOException {
        //Reading input using class BufferedReader
        BufferedReader read = new BufferedReader((new InputStreamReader(System.in)));
        
        //taking testcases count
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            //reading the string
            String str = read.readLine();
            
            //calling countVowels() method
            //of class Distinct
            //and printing the results
            System.out.println(new Distinct().countVowels(str));

        }
    }

}// } Driver Code Ends


//User function Template for Java


class Distinct
{
    // Complete the function
    // str: input string
    public static int countVowels(String str)
    {
        // count distinct vowels present in string
        /*
        use a boolean array to store if vowel is counted or not 

            if(arr[str[i] - 'a'] == false){
                arr[str[i] - 'a'] = true;
                cnt++;
        int cnt=0;
        char[] ch= str.toCharArray();//creates array and Storing the array
        for (int i=0;i<str.length();i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'i')
                cnt++;
        
        }
        */
        int vowelCount = 0;

        vowelCount += str.contains("a") ? 1 : 0;
        vowelCount += str.contains("e") ? 1 : 0;
        vowelCount += str.contains("i") ? 1 : 0;
        vowelCount += str.contains("o") ? 1 : 0;
        vowelCount += str.contains("u") ? 1 : 0;
        
        return vowelCount;
        
    }
}
