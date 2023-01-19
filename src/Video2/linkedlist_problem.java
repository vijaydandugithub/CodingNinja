
package Video2;

public class linkedlist_problem {
    public static void main(String[] args) {
        System.out.println("vijay");
    }}/*
        LinkedListNode oldnode = head;
        LinkedListNode newnode = null;

    }
}
*/
/*
import java.util.* ;
        import java.io.*;

*//*

*/
/*************************************************************************

 Following is the class structure of the LinkedListNode class:

 public class LinkedListNode {
 int data;
 LinkedListNode next;

 LinkedListNode(int data) {
 this.data = data;
 this.next = null;
 }
 };

 *************************************************************************//*
*/
/*

public class Solution {

    public static LinkedListNode moveToFront(LinkedListNode head) {
        // Write your code here
        if(head==null || head.next==null)
            return head;
        LinkedListNode oldnode = head;
        LinkedListNode newnode = null;
        while(head.next.next!=null){
            head=head.next;
        }
        newnode=head.next;
        head.next=null;
        newnode.next=oldnode;
        return newnode;

    }

}
*/

