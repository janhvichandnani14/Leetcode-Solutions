class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Handle single node
        if (head.next == null) {
            return null;
        }

        // Step 1: Find size
        int size = 0;
        ListNode currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }

        // Step 2: If we remove the head
        if (n == size) {
            return head.next;
        }

        // Step 3: Move to the node just before the one we want to remove
        int indexToSearch = size - n;
        ListNode curr = head;
        for (int i = 1; i < indexToSearch; i++) {
            curr = curr.next;
        }

        // Step 4: Skip the target node
        curr.next = curr.next.next;

        return head;
    }
}
