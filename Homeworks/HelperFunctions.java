package Homeworks;

public class HelperFunctions
{
    public static int SequentialSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int SequentialSearch(String[] arr, String target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].equals(target))
                return i;
        }
        return -1;
    }

    public static void Swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void InsertionSort(int[] arr)
    {

        for (int i = 1; i < arr.length; i++)
        {
            int val = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > val; j--)
            {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = val;
        }

    }

    public static int BinarySearch(String[] arr, String target)
    {

        int top = arr.length - 1;
        int low = 0;
        int iterations = 0; // Just a metric for performance

        while (top >= low)
        {
            iterations++;

            final int loc = (top + low) / 2;
            final String mid = arr[loc];

            if (mid.equals(target))
            {
                System.out.println("Binary Search Iterations: " + iterations);
                return loc;
            }
            if (mid.compareTo(target) < 0)
                low = loc + 1;
            else
                top = loc - 1;
        }

        return -1;

    }

    public static int BinarySearch(int[] arr, int target)
    {
        int top = arr.length - 1;
        int low = 0;
        int iterations = 0; // Just a metric for performance

        while (top >= low)
        {
            iterations++;
            final int loc = (top + low) / 2;
            final int mid = arr[loc];
            if (mid == target)
            {
                System.out.println("Binary Search Iterations: " + iterations);
                return loc;
            }
            if (mid < target)
                low = loc + 1;
            else
                top = loc - 1;
        }
        return -1;
    }
}
