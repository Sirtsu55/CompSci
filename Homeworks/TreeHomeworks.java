package Homeworks;

class Node
{
    Node(int value)
    {
        this.value = value;
    }

    public void Insert(int value)
    {
        if (value < this.value)
        {
            if (left == null)
                left = new Node(value);
            else
                left.Insert(value);
        } else
        {
            if (right == null)
                right = new Node(value);
            else
                right.Insert(value);
        }
    }

    Node left;
    Node right;
    int value;
}

public class TreeHomeworks
{
    public static void Example2(String[] args)
    {
        Node root = new Node(5);
        root.Insert(3);
        root.Insert(7);
        root.Insert(2);
        root.Insert(4);
        root.Insert(6);
        root.Insert(8);

        InOrder(root);
        System.out.println("Minimum: ");
        Minimum(root);

    }

    public static void InOrder(Node root)
    {
        if (root == null)
            return;
        InOrder(root.left);
        System.out.println(root.value);
        InOrder(root.right);
    }

    public static void Minimum(Node root)
    {
        if (root.left == null)
            System.out.println(root.value);
        else
            Minimum(root.left);
    }
}
