package Homeworks;

public class PracticeExam
{

    public static void EX9(String[] args)
    {
        int a[] =
        { -5, 4, 7, 2, 11, -9 };
        int ordered[] = new int[a.length];
        int cursor = 0;
        for (int i = 0; i < a.length; i += 2)
        {
            ordered[cursor] = a[i];
            cursor++;
        }

        for (int i = 1; i < ordered.length; i += 2)
        {
            ordered[cursor] = a[i];
            cursor++;
        }

        for (int i = 0; i < ordered.length; i++)
        {
            System.out.print(ordered[i] + " ");
        }
    }
}
