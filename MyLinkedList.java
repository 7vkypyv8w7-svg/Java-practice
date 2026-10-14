
public class MyLinkedList {

    private Node head;
    private Node tail;
    private int count;

    public MyLinkedList(){
        head = null;
        tail = null;
        count = 0 ;
    }

    public void PrintList()
{
    if (head == null)
    {
        System.out.println("The list is empty");
    }
    else
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.println(temp.getData() + " ");
            temp = temp.getNext();
        }
    }
}
    public void addFirst(Node newNode){
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
        count++ ; 
    }
    public Node removeFirst(){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        count--;
        if ( head == null){
            tail = null;
        }
        return temp;
    }
    public void addAfter(Node current , Node newNode){
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        if(current == tail){
            tail = newNode;
        }
        count++;        
    }
    public Node removeLast(){
        if(head == null){
            return null;
        }
        if(head == tail){
            Node temp = head;
            head = null;
            tail = null;
            count-- ;
            return temp;
        }
        Node current = head;
        while(current.getNext() != tail){
        current = current.getNext();
        }
        tail = current;
        tail.setNext(null);
        count--;
        return tail;
    }
    public void removeAfter(Node current){
        if(current == null){
             return null;
        }
        Node temp = current.next;
        if(temp == null){
            return null;
        }else{
            current.next = temp.next;
        }
        count--;
    } 
}

