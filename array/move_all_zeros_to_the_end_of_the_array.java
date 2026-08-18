class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int index=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while(index < arr.length)
        {
            arr[index] = 0;
            index++;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Move all Zeros to the end of the array:"+arr[i]);
        }
    }
}
