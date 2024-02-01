package Homeworks;

// templated class
class IntQueue
{
    IntQueue(int capacity)
    {
        queue = new int[capacity];
        right = 0;
    }

    void enqueue(int value)
    {
        queue[right++] = value;
    }

    int dequeue()
    {
        int ret = queue[0];

        right--; // decrement the right pointer so that the loop below doesn't go out of bounds

        // Copy the rest of the array to the left
        // for (int i = 0; i < right; i++)
        // {
        // queue[i] = queue[i + 1];
        // }

        // Arraycopy is faster than the loop above
        // Copy from queue[1] to queue[0] for right elements
        System.arraycopy(queue, 1, queue, 0, right);

        return ret;
    }

    boolean isEmpty()
    {
        return right == 0;
    }

    private int[] queue;
    private int right;

}

public class QueueHomeworks
{
    public static void HW4(String[] args)
    {
        IntQueue queue = new IntQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        while (!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }
    }
}
