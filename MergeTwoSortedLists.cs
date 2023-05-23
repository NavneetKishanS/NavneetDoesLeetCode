//LeetCode Solution
//Problem : Merge Two Sorted Lists (21)
//Author: Navneet Kishan Srinivasan
//Date: 23 May 2023
//Runtime: 78  ms
//Memory: 39.9  MB
public class Solution {
    public ListNode MergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        else if(list1 == null){ return list2; }
        else if(list2 == null){ return list1; }

        ListNode Merged = new ListNode();
        ListNode p = Merged, p1 = list1, p2 = list2;

        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                p.next = p1;
                p1 = p1.next;
            }
            else{
                p.next = p2;
                p2 = p2.next;
            }
            p=p.next;

             if(p1 != null){
                p.next = p1;
            }
        
            if(p2 != null){
                p.next = p2;
            }
        }
        return Merged.next;
    }
}
