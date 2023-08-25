package Homeworks;

import java.lang.Math;

public class AnalysisHomeworks
{
    public static void HW2(String[] args)
    {
        int res = 0, x = 5, y = -7;
        int negative = y > 0 ? 1 : -1;
        y = Math.abs(y);

        while (y > 0)
        {
            if (y % 2 == 0)
            {
                x += x;
                y /= 2;
            } else
            {
                res += x;
                y--;
            }
        }

        res *= negative;
        System.out.println(res);

    }
}
