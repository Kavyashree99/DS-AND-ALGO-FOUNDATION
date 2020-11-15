//User function Template for C++


// arr[]: input array
// n: size of the array
// x: element for which you need to return the count
int greaterThanX(int arr[],int n,int x)
{
    // your code here
    int cnt=0;
    for(int i=0;i<n;i++){
        if(arr[i]>x)
            cnt++;
    }
    return cnt;
}
