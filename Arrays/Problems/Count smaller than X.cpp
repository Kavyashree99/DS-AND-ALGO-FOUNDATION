int smallerThanX(int arr[],int n,int x)
{
    // your code here
    int cnt=0;
    for(int i=0;i<n;i++){
        if(arr[i]<x)
            cnt+=1;
    }
    return cnt;
}
