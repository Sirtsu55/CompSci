package Homeworks;

public class DebuggingHomeworks
{
    public static void HW2(String[] args)
    {
        int[] observations =
        { 1, 2, 3, 4 };
        int[] frequencies =
        { 7, 4, 11, 9 };
        double[] relFreqs = new double[observations.length];

        int count = 0;
        for (int i = 0; i < frequencies.length; i++)
            count += frequencies[i];

        for (int i = 0; i < frequencies.length; i++)
        {
            double val = frequencies[i] / (double) count;
            relFreqs[i] = val;
        }

        for (int i = 0; i < observations.length; i++)
            System.out.println(observations[i] + ": " + relFreqs[i]);
    }
}