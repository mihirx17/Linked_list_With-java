import java.awt.*;

public class Link_list{
    public static class  Node {
        int data;
        Node next;

        public Node(int data) {
           this.data=data;
            this.next = null;
        }
    }
public static Node head;
public static Node tail;
    public void add_first(int data)
    {

        Node newnode=new Node(data);
        if (head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void last_node(int data)
    {
        Node newnode=new Node(data);
        if (head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print()
    {
        Node temp= head;
        while (temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
Link_list ll =new Link_list();
ll.add_first(13);
ll.last_node(21);
ll.add_first(123);
ll.print();

    }
}