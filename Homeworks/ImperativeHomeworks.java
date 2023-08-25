package Homeworks;

public class ImperativeHomeworks
{

    public static void HW7(String[] args)
    {
        boolean found = false;
        int n = 0;

        while (!found)
        {
            int val = (n * n * n) + 91;

            if (val % 47 == 0)
            {
                found = true;
                break;
            }
            n++;
        }

        System.out.println(n);
    }

    public static void HW8(String[] args)
    {
        int a = 10;

        int res = 1;

        for (int i = 0; i < a; i++)
        {
            res *= 3;
        }

        System.out.println(res);
    }
}
