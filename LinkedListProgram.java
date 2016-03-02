class Node {
    private int datum;
    private Node next;
  
    public Node(){
        next = null;
    }

    public Node(int d){
        datum = d;
        next = null;
    }

    public int getDatum(){
        return datum;
    }

    public void setDatum(int d){
        datum = d;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n){
        next = n;
    }
}


class LinkedList {
    private Node head;
    private int length;

    public LinkedList(){
        head = null;
        length = 0;
    }

    public int getLength(){
        return length;
    }

    // public boolean is_empty(){
    //     return true; //todo --> add this logic
    // }

    public void add(int datum){
        Node cur = head;
        Node created = new Node(datum);

        if(cur == null){
            head = created;
            created.setNext(null);
            ++length;
        }else{

            while(cur.getNext() != null){
                cur = cur.getNext();
            }

            cur.setNext(created);
            ++length;
        }
    }

    public void print(){
        Node cur = head;

        while(cur != null){
            System.out.println(cur.getDatum());
            cur = cur.getNext();
        }
    }
}

class LinkedListProgram{

    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.add(1111111111);
        list.add(20);
        list.add(4);
        list.add(1);
        list.add(59);

        list.print();
        System.out.println("Length: " + list.getLength());

        //todo: add pop, push, remove, is_empty and sorting methods, then add use case examples here

        //list.sort();
        //list.print();
    }

}