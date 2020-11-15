//User function Template for C++

int median(int A[],int N)
{
    
    sort(A,A+N);
    if(N%2!=0){
        return (int)A[N/2];
    }
    else{
        return ((int)A[(N-1)/2]+(int)(A[N/2]))/2;
    }
    
    //your code here
    //If median is in fraction then convert it to integer and return
}

int mean(int A[],int N)
{
    //your code here
    int sum=0,mean1;
    for(int i=0;i<N;i++){
        sum+=A[i];
    }
    mean1=sum/N;
    return mean1;
}
