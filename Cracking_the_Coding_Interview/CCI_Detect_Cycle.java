/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node ahead, behind;
    
    if(head == null)
        return false;
    
    ahead = behind = head;
    
    while(head != null){
        
        behind = behind.next;
        
        if(ahead.next != null)
            ahead = ahead.next.next;
        else
            return false;
        
        if(ahead == null || behind == null)
            return false;
        
        if(ahead == behind)
            return true;
    }
    return false; 
}

