import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        next = null;
    }
}

public class linkedlist {
    static Node head = null;
    static Node tail = null;

    static void insertAtEnd(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }
    static void insertAtHead(int data) {
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
    static int length()
    {
       Node temp = head;
       int count =0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int n = sc.nextInt();
            int[] arr = {1,2,34,5,7};

            for(int i=0;i<arr.length;i++){
                insertAtEnd(arr[i]);
            }
            int data = sc.nextInt();
            insertAtHead(data);
        }
        System.out.println("length of linked list:" +length());
        print();

    }
}
