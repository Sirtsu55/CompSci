package Homeworks;

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

    public static void HW1(String[] args)
    {
        int N = 4;
        System.out.println(RecursiveF(N));
        System.out.println(NormalF(N));
    }
}
