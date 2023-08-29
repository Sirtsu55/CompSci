package Homeworks;

public class BooleanHomeworks
{
    public static void LeapYear(String[] args)
    {
        final int year = 2400;
        boolean isLeapYear = false;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            isLeapYear = true;
        }

        System.out.println("Is " + year + " a leap year? " + isLeapYear);

    }
}
