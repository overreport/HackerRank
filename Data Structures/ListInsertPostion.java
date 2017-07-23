/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node n = new Node();
    n.data=data;

    if(position==0) {
        n.next=head;
        return n;
    }

    else {
        int ctr=0;
        Node track1 = head;
        
        while(ctr < position-1 && track1.next!=null) {
            track1=track1.next;
            ctr++;
        }

        Node track2= track1.next; 
        track1.next=n; // track1's Pointer asigned ---> n
        n.next=track2; // n's Pointer assigned ---> track2 
        return head;
    }
}
