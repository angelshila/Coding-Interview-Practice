/**
 * Created by Anushila on 1/23/16.
 */
public class MinHeapcopy {

    int size,capacity;
    int Heap[];

    private static final int FRONT=1;

    public MinHeapcopy(int c){

        this.capacity=c;
        Heap = new int[capacity+1];
        this.size=0;
        Heap[0] = Integer.MIN_VALUE;

    }

    public int parent(int i){

        return i/2;
    }

    public int leftChild(int i){

        return 2*i;

    }

    public int rightChild(int i){

        return 2*i+1;

    }

    private boolean isLeaf(int index) {

        if(index>=size/2 && index<=size)
            return true;
        return false;
    }

    public void swap(int index1, int index2){

        int temp = Heap[index1];
        Heap[index1]=Heap[index2];
        Heap[index2]=temp;

    }

    public void minHeapify(int index){

        if(!isLeaf(index)){

            if(Heap[index]>Heap[leftChild(index)] || Heap[index]>Heap[rightChild(index)]){

                if(Heap[leftChild(index)]<Heap[rightChild(index)]){

                    swap(index,leftChild(index));
                    minHeapify(leftChild(index));

                }

                else{

                    swap(index,rightChild(index));
                    minHeapify(rightChild(index));

                }

            }



        }


    }


    public void insert(int data){


        Heap[++size]=data;
        int current = size;

        while(Heap[current]<Heap[parent(current)]){

            swap(current,parent(current));
            current=parent(current);


        }

    }

    public void print(){

        for(int i =1;i<=size/2;i++){
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]
                    + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();
        }
    }


    public int remove(){
        int temp = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return temp;
    }

//    public static void main(String...arg)
//    {
//        System.out.println("The Min Heap is ");
//        MinHeap minHeap = new MinHeap(15);
//        minHeap.insert(5);
//        minHeap.insert(3);
//        minHeap.insert(17);
//        minHeap.insert(10);
//        minHeap.insert(84);
//        minHeap.insert(19);
//        minHeap.insert(6);
//        minHeap.insert(22);
//        minHeap.insert(9);
//        //minHeap.minHeap();
//
//        minHeap.print();
//        System.out.println("The Min val is " + minHeap.remove());
//    }



}
