package Homeworks;

public class ImperativeHomeworks
{

    public static void HW6(String[] args)
    {
        final int weight = 7;
        final int startPrice = 3;
        final int fiveKGprice = startPrice + (5 - 2) * 2;
        int price = 0;

        if (weight <= 2)
            price = startPrice;
        else if (weight <= 5)
            price = startPrice + (weight - 2) * 2;
        else
            price = fiveKGprice + (weight - 5) * 3;

        System.out.println(price);
    }

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

        int base = 5;

        for (int i = 0; i < a; i++)
        {
            res *= base;
        }

        System.out.println(res);
    }
}
