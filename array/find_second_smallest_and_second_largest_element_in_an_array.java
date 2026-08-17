class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {2, 5, 1, 3, 0};
        int length=arr.length;
        System.out.println("Length of array:"+length);

        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        // Sorted array
        for(int i=0;i<length;i++)
        {
            System.out.println(arr[i]);
        }

        int second_smallest=arr[1];
        System.out.println("Second Smallest Element in an array:"+second_smallest);
      
        int second_largest=arr[length-2];
        System.out.println("Second largest Element in an array:"+second_largest);
    }
}
