package LinkedListBasics;

/**
 * Created by Anushila on 3/13/16.
 */
public class LinkedList<T> {


    public Node head;
    public int size;


    public LinkedList(){

        this.size=0;


    }


    //Append
    public void appendToTail(T d){

        Node temp = new Node(d);

        if(head == null){

            head = temp;
            size++;
            return;
        }

        Node current = head;

        while(current.next!=null){
            current = current.next;
        }

        current.next=temp;

        size++;

    }

    //Add to the beginning
    public void addHead(T data){



        Node temp = new Node(data);

        if(head == null){

            head = temp;
            size++;
            return;

        }

        temp.next = head;
        head = temp;

        size++;

    }

    public void addAt(T data, int position){

        Node temp = new Node(data);

        if(position <0){
            return;
        }
        else if(position>size){

            position = size+1;
        }

        if(head == null){

            head = temp;

        }
        else if(position == 0){

            temp.next = head;
            head = temp;
        }

        else{

            Node current = head;

            for(int i=0;i<position-1 && current.next!=null;i++){

                current = current.next;

            }

            temp.next = current.next;
            current.next = temp;

        }

        size++;

    }

    public Node get(int position){

        if(position<0 || position>size){

            return null;

        }

        Node current = head;

        for(int i =0; i<position && current.next!=null;i++){


            current = current.next;


        }

        return current;
    }

    public int getPos(Node n){
//
//
//        if(head == null){
//            return -1;
//        }

        Node current = head;

        for(int i =0;i<size && current.next!=null; i++){

            if(current.data == n.data){
                return i;
            }

            current = current.next;


        }

        return -1;

    }


    public Node deleteTail(){

        if(head == null){
            return null;
        }


        Node current = head;

        while(current.next.next!=null){

            current= current.next;

        }

        Node deleted = current.next;
        current.next = null;
        size--;

        return deleted;


    }

    public Node deleteHead(){

        if(head == null){
            return null;
        }

        Node deleted = head;
        head = head.next;
        size--;

        return deleted;

    }

    public void deleteMatched(T data){

        if(head == null){
            return;
        }

        else if(head.data == data){
            head = head.next;
            size--;
            return;
        }


        Node current = head;

        while(current.next!=null){

            if(current.next.data == data){
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;


        }



    }

    public Node deletePos(int position){

        if(position<0 || position>size){
            return null;
        }

        if(position == 0){

            Node deleted = head;
            head = head.next;
            size--;
            return deleted;

        }

        Node current = head;
        for(int i=0;i<position-1 && current.next!=null;i++){

            current = current.next;

        }

        Node deleted = current.next;
        current.next= current.next.next;
        size--;

        return deleted;




    }


    public String toString(){

        String result="[";

        if(head == null){
            result+="]";
            return result;
        }

        result+=head.data;
        Node current = head.next;

        while(current!=null){

            result+=","+current.data;
            current= current.next;


        }

        result+="]";
        return  result;


    }






}
