class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {2, 5, 1, 4, 0};
        int first=arr[0];

        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=first;

        // left rotate the array by one
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

