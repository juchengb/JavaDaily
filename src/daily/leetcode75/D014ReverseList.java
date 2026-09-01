package daily.leetcode75;
// 206. Reverse Linked List
public class D014ReverseList {

    public ListNode reverseList(ListNode head) {

        ListNode ans = null;
        ListNode curr = head;

        while (curr != null) { // 當 curr 還有 Node，就繼續反轉
            ListNode temp = curr.next; // 暫存下一個 Node
            curr.next = ans; // 反轉箭頭
            ans = curr; // ans 往前走
            curr = temp; // curr 往前走
        }
        return ans; // 當 curr == null 時，整個 Linked List 已經反轉完成。

    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

}
