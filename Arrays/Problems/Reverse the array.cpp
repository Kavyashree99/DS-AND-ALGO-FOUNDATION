//User function Template for C++

//Complete this function
void reverseArray(int arr[],int n)
{
   //Your code here
   int low=0,high=n-1;
   while(low<high){
       int temp=arr[low];
       arr[low]=arr[high];
       arr[high]=temp;
       low++;
       high--;
   }
}
