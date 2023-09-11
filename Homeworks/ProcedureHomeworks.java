package Homeworks;

public class ProcedureHomeworks
{

    public static void printArray(int[] arr)
    {
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static int supUpTo(int n)
    {
        return (n * (n + 1)) / 2;
    }

    public static int[] alternate(int[] arr)
    {
        int[] result = new int[arr.length];

        // result[0] = arr[0];
        // result[1] = arr[arr.length - 1];
        // result[2] = arr[1];
        // result[3] = arr[arr.length - 2];
        // result[4] = arr[2];

        for (int i = 0; i < arr.length; i++)
        {
            int idx = i % 2 == 0 ? i / 2 : arr.length - (i + 1) / 2;
            result[i] = arr[idx];
        }
        return result;
    }

    public static void HW2(String[] args)
    {
        for (int i = 1; i < 21; i++)
            System.out.print(supUpTo(i) + " ");
    }

    public static void HW3(String[] args)
    {
        int arr[] =
        { 2, 5, -3, 11, 193, 78 };

        printArray(alternate(arr));

    }

}
