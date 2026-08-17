class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {2, 5, 1, 4, 0};
        int search_ele=4;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==search_ele)
            {
                System.out.println("Search element:"+search_ele+" and their index position:"+i);
            }
        }
    }
}
