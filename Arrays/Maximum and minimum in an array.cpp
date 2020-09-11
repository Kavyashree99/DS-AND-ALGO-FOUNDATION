//Complete the below functions
int maximumElement(int arr[],int n)
{
    //Your code here
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max)
            max=arr[i];
    }
    return max;
}

int minimumElement(int arr[],int n)
{
    //Your code here
    int min=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<min)
            min=arr[i];
    }
    return min;
    
}
