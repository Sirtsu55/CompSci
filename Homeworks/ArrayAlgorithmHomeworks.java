package Homeworks;

import Homeworks.HelperFunctions;
import ibcsutils.ReadViaURL;

public class ArrayAlgorithmHomeworks
{

    public static void HW1(String[] args)
    {
        int arr[] =
        { -2, 9, 11, 12, 13, 14, 15, 22, 142 };
        int target = 13;
        HelperFunctions.BinarySearch(arr, target);
    }

    public static void HW2(String[] args)
    {
        String names[] =
        { "Alissa", "Ben", "Charlie", "Dianna" };
        String grades[] =
        { "B", "D", "B", "A" };

        String name = "Ben";

        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals(name))
            {
                System.out.println(names[i] + "'s grade is " + grades[i]);
                break;
            }
        }
    }

    public static void HW3(String[] args)
    {
        int arr[] =
        { 9, 7, 2, 1 };

    }

    public static void HW4(String[] args)
    {
        String addr = "https://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr, true, true, true);
        String target = "lapidification";
        System.out.println(words[(words.length - 1) / 2]);
        System.out.println("Searching for: " + target + "...");

        int idx = HelperFunctions.BinarySearch(words, target);

        System.out.println("Word at index: " + idx + " is: " + words[idx]);
    }

    public static void HW5(String[] args)
    {
        int arr[] =
        { 9, 7, 2, 11 };

        for (int i = 0; i < arr.length; i++)
        {
            
        }
    }

}
