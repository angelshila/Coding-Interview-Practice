public class minHeap
{
    private int[] Heap;
    private int size;
    private int maxsize;

    private static final int FRONT = 1;

    public minHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos)
    {
        return (2 * pos);
    }

    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void minHeapify(int pos)
    {
        if (!isLeaf(pos))
        {
            if ( Heap[pos] > Heap[leftChild(pos)]  || Heap[pos] > Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int element)
    {
        Heap[++size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }
    }

    public void print()
    {

        if(size>1) {
            for (int i = 1; i <= size / 2; i++) {
                System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i]
                        + " RIGHT CHILD :" + Heap[2 * i + 1]);
                System.out.println();
            }
        }
        else{
            System.out.print(" PARENT : " + Heap[size]);
        }
        System.out.println();
    }

    public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1 ; pos--)
        {
            minHeapify(pos);
        }
    }

    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        Heap[size+1]=0;
        minHeapify(FRONT);
        return popped;
    }

    public static void main(String...arg)
    {
        System.out.println("The Min Heap is ");
        minHeap minHeap = new minHeap(15);
        minHeap.insert(5);
        minHeap.print();
        minHeap.insert(3);
        minHeap.print();
        minHeap.insert(17);
        minHeap.print();
        minHeap.insert(10);
        minHeap.print();
        minHeap.insert(84);
        minHeap.print();
        minHeap.insert(19);
        minHeap.print();
        minHeap.insert(6);
        minHeap.print();
        minHeap.insert(22);
        minHeap.print();
        minHeap.insert(9);
        minHeap.print();
        minHeap.minHeap();
        minHeap.print();

        minHeap.print();
        System.out.println("The Min val is " + minHeap.remove());
        minHeap.print();
    }
}