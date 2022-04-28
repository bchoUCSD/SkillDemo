class skillDemo
{
    private static int[] arr = {1,2};

    public static int getAt(int index)
    {
        if(index > arr.length-1 && index > -1)
        {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
}
