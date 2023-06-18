class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Example 1: 342 + 465 = 807
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result); // Output: [7, 0, 8]

        // Example 2: 0 + 0 = 0
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        result = solution.addTwoNumbers(l3, l4);
        printLinkedList(result); // Output: [0]

        // Example 3: 9999999 + 9999 = 10009998
        ListNode l5 = new ListNode(9);
        l5.next = new ListNode(9);
        l5.next.next = new ListNode(9);
        l5.next.next.next = new ListNode(9);
        l5.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next = new ListNode(9);
        l5.next.next.next.next.next.next = new ListNode(9);

        ListNode l6 = new ListNode(9);
        l6.next = new ListNode(9);
        l6.next.next = new ListNode(9);
        l6.next.next.next = new ListNode(9);

        result = solution.addTwoNumbers(l5, l6);
        printLinkedList(result); // Output: [8, 9, 9, 9, 0, 0, 0, 1]
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();

        while (curr != null) {
            sb.append(curr.val).append(" -> ");
            curr = curr.next;
        }

        sb.append("null");
        System.out.println(sb.toString());
    }
}
