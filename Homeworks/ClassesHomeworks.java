package Homeworks;

import ibio.Helpers;

public class ClassesHomeworks
{
    public static void HW1(String[] args)
    {
        for (int i = 0; i < 11; i++)
        {
            double alpha = (Math.PI * i) / 5;
            System.out.print(alpha + " ");
            System.out.print(Math.sin(alpha) + " ");
            System.out.print(Math.cos(alpha) + "\n");
        }
    }

    public static void HW2(String[] args)
    {
        boolean running = true;
        while (running)
        {
            String op = Helpers.inputString("Enter an operation: ");

            if (op.equals("end"))
            {
                running = false;
                continue;
            }

            int a = Helpers.inputInt("Enter first number: ");
            int b = Helpers.inputInt("Enter second number: ");

            if (op.equals("add"))
            {
                System.out.println(a + b);
            } else if (op.equals("sub"))
            {
                System.out.println(a - b);
            } else
            {
                System.out.println("Unknown operation");
            }

        }
    }

    public static void HW3(String[] args)
    {
        String leftover = args[0];

        while (true)
        {
            int next = leftover.indexOf(args[1]);
            if (next == -1)
            {
                System.out.println(leftover);
                break;
            }

            String piece = leftover.substring(0, next);
            System.out.print(piece + " ");

            leftover = leftover.substring(next + args[1].length());
        }
    }

}
