package Homeworks;

import java.util.ArrayList;
import java.util.List;

public class RecursiveHomeworks
{

    public static int RecursiveF(int n)
    {
        return n == 1 ? 1 : n * RecursiveF(n - 1);
    }

    public static int NormalF(int n)
    {
        int p = 1;

        for (int i = 1; i <= n; i++)
            p *= i;

        return p;
    }

    public static int RecurseiveT(int N)
    {
        if (N < 2)
            return 1;

        return RecurseiveT(N - 1) + (N - 1) * RecurseiveT(N - 2);
    }

    public static int NormalT(int N)
    {
        int t0 = 1;
        int t1 = 1;

        for (int i = 2; i <= N; i++)
        {
            int temp = t1;
            t1 = t1 + (i - 1) * t0;
            t0 = temp;
        }

        return t1;
    }

    public static int RecursiveSequential(int arr[], int key, int start)
    {
        if (start == arr.length)
            return -1;
        else if (start < arr.length && key != arr[start])
            return RecursiveSequential(arr, key, start + 1);
        return start;
    }

    public static void HW1(String[] args)
    {
        int N = 4;
        System.out.println(RecursiveF(N));
        System.out.println(NormalF(N));
    }

    public static void HW3(String[] args)
    {
        System.out.println(NormalT(10));
    }

    public static void HW4(String[] args)
    {
        int arr[] =
        { 0, -68, 18932, 32, 12, 890 };
        System.out.println(RecursiveSequential(arr, 32, 0));
    }

    public static boolean RecursivePalindrome(int arr[], int start, int end)
    {
        if (start >= end)
            return true;
        else if (arr[start] != arr[end])
            return false;
        return RecursivePalindrome(arr, start + 1, end - 1);
    }

    public static void HW5(String[] args)
    {
        int isntPalindrome[] =
        { 0, 12, 18932, 32, 12, 0 };
        System.out.println(RecursivePalindrome(isntPalindrome, 0, isntPalindrome.length - 1));

        int isPalindrome[] =
        { 0, 12, 18932, 32, 18932, 12, 0 };

        System.out.println(RecursivePalindrome(isPalindrome, 0, isPalindrome.length - 1));
    }

    public static void ListAllPossibleCombinations(int arr[])
    {
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();

        System.out.println("Possible Combinations:");

        for (int i = 0; i < arr.length; i++)
            A.add(arr[i]);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println((i + 1) + ": ");

            for (int j = 0; j < A.size(); j++)
                System.out.print(A.get(j) + " ");

            System.out.print(" | ");

            for (int j = 0; j < B.size(); j++)
                System.out.print(B.get(j) + " ");

            System.out.println();

            B.add(arr[i]);
            A.remove(i);
        }
    }

    public static void HW7(String[] args)
    {
        int arr[] =
        { 0, -68, 18932, 32, 12, 890 };

        ListAllPossibleCombinations(arr);

    }

}
