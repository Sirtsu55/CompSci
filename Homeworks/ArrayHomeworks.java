package Homeworks;

public class ArrayHomeworks
{

    public static void HW1(String[] args)
    {
        int arr[] =
        { 2, 5, -3, 11, 193 };

        int sum = 0;

        for (int i : arr)
        {
            sum += i;
            System.out.print(i + " ");
        }

        System.out.println("\nSum is " + sum);
    }

    public static void HW4(String[] args)
    {
        int arr[] =
        { 5, 4, -7, -2, -1 };

        int reverse[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            reverse[i] = arr[arr.length - i - 1];
            System.out.print(reverse[i] + " ");
        }

    }

    public static void HW5(String[] args)
    {
        int arr[] =
        { -3, 2, 6, -11 };

        int culmulative[] = new int[arr.length];

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            culmulative[i] = sum;
        }

        for (int i : culmulative)
            System.out.print(i + " ");
    }

}
