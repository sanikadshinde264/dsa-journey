class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {2, 5, 1, 3, 0};
        boolean isSorted=true;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
                break;
            }
        }
        System.out.println("Check if an Array is Sorted:"+isSorted);
    }
}
