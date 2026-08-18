class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 1, 0, 1, 1, 1};

        int consecutive_number=0;
        int count=0;
        int max_streak=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }

            if(count>max_streak)
            {
                max_streak=count;
                consecutive_number=arr[i];
            }
        }
        System.out.println(consecutive_number + " occurs consecutively " + max_streak + " times");
    }
}
