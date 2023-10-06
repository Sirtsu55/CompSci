package Homeworks;

public class NestedLoops
{
    public static void HW1(String[] args)
    {
        System.out.print("1. ");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(j + " ");
            }
            System.out.print("\n   ");
        }

        System.out.print("\n2. ");

        for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j < i + 5; j++)
            {
                System.out.print(j + " ");
            }
            System.out.print("\n   ");
        }

    }

    public static void HW2(String[] args)
    {
        int m[] =
        { 34, 8, 0, 89, 76 };
        int n[] =
        { 1, 2, 3, 4, 5 };

        boolean found = false;
        for (int a : m)
        {
            for (int b : n)
            {
                if (a == b)
                {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found);
    }

    public static void HW3(String[] args)
    {
        int m[] =
        { 1, 2 };

        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m.length; j++)
            {
                if (m[i] != m[j])
                {
                    System.out.println(10 * m[i] + m[j]);
                }
            }
        }
    }

    public static void HW4(String[] args)
    {
        System.out.print("1. \n");
        char c = '*';
        char a = '-';

        for (int i = 0; i < 6; i++)
        {
            for (int j = 6; j > i; j--)
            {
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.print("2. \n");
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (j <= i)
                    System.out.print(c);
                else
                    System.out.print(a);
            }
            System.out.println();

        }
    }

}
