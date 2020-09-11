class Insert
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        if(index==sizeOfArray-1)
            arr[sizeOfArray-1] = element;
       else {
            for(int i=sizeOfArray-1;i>index;i--){
                arr[i] =arr[i-1];
            }
            arr[index] = element;
        }
    }
}
