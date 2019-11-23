
public class Sol {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public void reorderList(ListNode head) {
		if (head != null) {

			int size = 1;

			if (size != 1) {
				ListNode h = head;
				while (h.next != null) {
					h = h.next;
					size++;
				}

				int mid = size / 2;
				mid = mid - 1;
				ListNode temp = head;
				for (int i = 0; i < mid; i++) {
					temp = temp.next;
				}
				ListNode middle = temp.next;
				temp.next = null;
				temp = reverse(middle);

				ListNode a = head;
				ListNode b = head.next;
				ListNode c = temp;
				ListNode d = temp.next;
				if (size % 2 == 0) {
					while (d != null) {
						a.next = c;
						c.next = b;
						a = b;
						c = d;
						b = b.next;
						d = d.next;
					}
					a.next = c;
				} else {
					while (d != null) {
						a.next = c;
						if (b == null) {
							break;
						}
						;
						c.next = b;
						a = b;
						c = d;
						b = b.next;
						d = d.next;
					}
				}
			}
		}

	}

	public ListNode reverse(ListNode n) {
		ListNode prev = null;
		ListNode runner = n.next;

		while (n.next != null) {
			n.next = prev;
			prev = n;
			n = runner;
			runner = runner.next;
		}
		n.next = prev;
		return n;
	}

}
