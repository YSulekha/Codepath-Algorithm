package Checkpoint4;

import java.util.Stack;

/**
 * Created by salse on 7/4/17.
 */
public class SubtractLinkedList {

    public ListNode subtract(ListNode a) {
        Stack<Integer> st = new Stack<Integer>();
        ListNode fastPtr = a;
        ListNode slowPtr = a;
        ListNode mid = null;
        ListNode start = a;

        if(a != null && a.next != null){
            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
        }
        mid = slowPtr;
        while(slowPtr != null){
            st.push(slowPtr.val);
            slowPtr = slowPtr.next;
        }
        while(start.next != null){
            int val = st.pop() - start.val;
            start.val = val;
            start = start.next;
            if(start == mid){
                break;
            }
        }
        return a;
    }
    class ListNode {
             public int val;
             public ListNode next;
             ListNode(int x) { val = x; next = null; }
         }
}
