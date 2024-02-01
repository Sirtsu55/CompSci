package Homeworks;

import java.util.Scanner;

class IntStack
{
    IntStack(int capacity)
    {
        stack = new int[capacity];
        top = 0;
    }

    void push(int value)
    {
        if (top >= stack.length)
        {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);

            stack = newStack;
        }
        stack[top++] = value;
    }

    boolean isEmpty()
    {
        return top == 0;
    }

    boolean isFull()
    {
        return top == stack.length;
    }

    int pop()
    {
        return stack[--top];
    }

    private int[] stack;
    private int top = 0;
}

public class StackHomeworks
{
    public static void HW3(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int nNormal = 0;
        int nSquare = 0;
        int nCurly = 0;

        String s = scanner.next().strip();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (c == '(')
            {
                nNormal++;
            } else if (c == ')')
            {
                nNormal--;
            } else if (c == '[')
            {
                nSquare++;
            } else if (c == ']')
            {
                nSquare--;
            } else if (c == '{')
            {
                nCurly++;
            } else if (c == '}')
            {
                nCurly--;
            }

        }

        if (nNormal == 0 && nSquare == 0 && nCurly == 0)
        {
            System.out.println("The brackets are balanced.");
        } else
        {
            System.out.println("The brackets are not balanced.");
        }
    }

    public static void HW4(String[] args)
    {
        IntStack stack = new IntStack(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
