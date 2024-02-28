package Homeworks;

class Node // Node class
{
    Node(int value)
    {
        this.value = value;
        next = null;
    }

    void add(int value)
    {
        if (next == null)
        {
            next = new Node(value);
        } else
        {
            next.add(value);
        }
    }

    void pop(int idx)
    {
        if (idx == 0)
        {
            next = next.next;
        } else
        {
            next.pop(idx - 1);
        }
    }

    void print()
    {
        System.out.println(value);
        if (next != null)
        {
            next.print();
        }
    }

    int value;
    Node next;
}

public class LinkedListHomeworks
{
    public static void HW1(String[] args)
    {
        Node list = new Node(123);

        list.add(1);
        list.add(3487);
        list.add(3);
        list.add(4);

        list.print();
    }
}
