package data_structures.data03_linkedlist;

import data_structures.data04_stack.Stack;

public class LinkedList {
	private Node head;
	private Stack s;

	LinkedList() {
		head = null;
		s = new Stack();
	}

	private static class Node {
		int item;
		Node next;

		Node() {
			this.item = 0;
			this.next = null;
		}

		Node(int item, Node next) {
			this.item = item;
			this.next = next;
		}
	}

	public void insert(int x) {
		Node node = new Node(x, null);
		Node p = head;
		// 注意链表为空的时候的插入
		if (head == null) {
			head = node;
		}
		// 尾插法
		else {
			while (p.next != null) {
				p = p.next;
			}
			p.next = node;
		}
	}

	public void travese(Node head) {
		Node p = head;
		while (p != null) {
			System.out.println(p.item);
			p = p.next;
		}
	}

	/*
	 * 从尾到头打印链表
	 * 
	 * 题目：输入一个链表的头节点，从尾到头打印出来每个节点的值。 解法：遍历，每遍历到的元素存到栈，然后输出栈即可。
	 */
	public void reveaseoutput(Node head) {
		Node p = head;
		if (p == null) {
			System.out.println("empty list");
		}
		while (p != null) {
			s.push(p.item);
			p = p.next;
		}
		while (s.stackempty() != true) {
			int n = s.pop();
			System.out.println(n);
		}
	}

	/*
	 * O(1)时间删除链表节点
	 * 
	 * 题目：给定单链表的头指针和一个节点指针，O(1)时间删除该链表节点 解法：下一个节点的内容复制到需要删除的点，即覆盖。然后删该店的下一个节点。
	 * 这里需要考虑两个边界条件 1 要删除的点位于尾部 2 链表只有一个节点 要考虑鲁棒性。
	 */
	public void deleteNode(Node head, Node pToDeleted) {
		if (head != null) {
			// 要删除的是尾节点
			if (pToDeleted.next == null) {
				// 如果要删除的是链表唯一的节点
				if (head.next == null) {
					head = null;
					System.out.println(head);
					pToDeleted = null;
				} else {
					Node p = head;
					while (p.next != pToDeleted) {
						p = p.next;
					}
					p.next = null;
					pToDeleted = null;
				}
			}
			// 要删除的不是尾节点，且节点数大于1
			else {
				pToDeleted.item = pToDeleted.next.item;
				pToDeleted.next = pToDeleted.next.next;
				pToDeleted = null;
			}

		} else {
			System.out.println("the linklist is empty");
		}
	}

	/*
	 * 倒数第k个节点
	 * 
	 * 题目：输入一个链表，输出该链表第倒k个节点。（链表从1开始计数）
	 * 解法：定义两个指针，第一个指针从链表的head指针开始遍历，向前走k-1步的时候，第二个指针开始和它一起走。当第一个指针的next指向null的时候，
	 * 第二个指针指向了倒数第k个。（这种一次遍历，对时间要求比较高的程序，就需要借助空间，再开辟一个指针） 要考虑鲁棒性。
	 * 
	 */
	// 遍历链表一次，删除倒数第K个元素
	public Node FindKthToTail(Node head, int k) {
		Node p = head;
		Node q = head;
		int i;
		if (head == null || k == 0) {
			return null;
		}
		for (i = 0; i < k - 1; i++) {
			if (p.next != null) {
				p = p.next;
			} else {// 当k大于链表的长度的时候
				System.out.println("error k");
				return null;
			}

		}

		while (p.next != null) {
			p = p.next;
			q = q.next;
		}
		return q;
	}

	/*
	 * 反转链表
	 * 
	 * 题目：定义一个函数，输入链表头节点，反转该链表并输出反转后链表的头节点。 解法：借助三个指针，prev, p, next. 避免指针断裂。 （
	 * 为了正确的反转一个链表，需要调整链表中指针的方向【指针反向】。注意，在单链表中，将一个节点的指向后继的指针指向它的前驱，将会导致链表的断裂。
	 * 导致无法在单链表中遍历它的后继节点，因此，在调整某一节点的 next 指针时，需要首先将其的后继节点保存下来。）
	 */
	public Node reverse() {
		Node p = head;
		try {
			if (p != null) {
				Node pnext = p.next;
				p.next = null;
				while (pnext != null) {
					Node r = pnext.next;
					pnext.next = p;
					p = pnext;
					pnext = r;
				}
			} else {
				throw new Exception("empty list");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return p;
		}
	}

	/*
	 * 合并链表
	 * 
	 * 题目：输入两个增序的链表，合并这两个链表并使新链表仍然增序。 解法：重点强调鲁棒性：两个链表一个或者两个都是null,两个链表只有一个节点。
	 */
	public Node merge(Node head1, Node head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		} else {
			Node newhead;
			Node r;
			Node p = head1;
			Node q = head2;
			if (head1.item <= head2.item) {
				newhead = head1;
				p = p.next;
			} else {
				newhead = head2;
				q = q.next;
			}
			r = newhead;

			while (p != null && q != null) {
				if (p.item <= q.item) {
					r.next = p;
					p = p.next;
					r = r.next;
				} else {
					r.next = q;
					q = q.next;
					r = r.next;
				}
			}

			if (p != null) {
				r.next = p;
			}
			if (q != null) {
				r.next = q;
			}
			return newhead;
		}
	}

	/**
	 * 复杂链表的复制 题目： 请实现函数ComplexListNode* Clone(ComplexListNode *pHead)，
	 * 复制一个复杂链表。在复杂链表中，每个结点除了有一个m_pNext指针指向下一个结点外， 还有一个m_pSibing指向链表中的任意结点或者NULL。
	 * 结点的C++定义如下：
	 *
	 * 
	 * //1. 根据原始链表的每个节点创建对应的copy节点 public void CloneNode(ComplexNode head){
	 * ComplexNode p = head; while(p!=null){ ComplexNode node = new
	 * ComplexNode(p.item,null,null); node.next = p.next; p.next = node; p =
	 * node.next; } } //2. 设置复制出来的节点的sibling public void
	 * connectsiblingnodes(ComplexNode head){ ComplexNode p = head;
	 * 
	 * while(p!=null){ ComplexNode q = p.next; if(p.sibling!=null) { q.sibling =
	 * p.sibling.next; } p = q.next;
	 * 
	 * } } //3. 拆分链表 public ComplexNode ReconnectNodes(ComplexNode head){
	 * ComplexNode p = head; if(p!=null){ ComplexNode newhead = p.next; ComplexNode
	 * q = newhead; while(q.next!=null){ p.next = q.next; p = q.next; q.next =
	 * p.next; q = p.next; } return newhead; } else{ return null; } } }
	 */
	/*
	 * 寻找第一个公共节点
	 * 
	 * 题目：输入两个链表，找出第一个公共节点。 解法：Y形 代码：
	 */
	public Node findfirstcommonnode(Node head1, Node head2){
        Node p = head1;Node q = head2;
        int length=0,length1=0,length2= 0;
        while(p!=null){
            length1 = length1 + 1;
            p = p.next;
        }
        while(q!=null){
            length2 = length2 + 1;
            q = q.next;
        }

        p = head1;q = head2;

        if(length1>length2){
            length = length1 - length2;
            while(length>0){
                p = p.next; length--;
            }
        }
        if(length1<length2){
            length = length2 - length1;
            while(length>0){
                q = q.next; length--;
            }
        }
        while(p!=null&&q!=null&&p.item != q.item){
                p = p.next; q = q.next;
            }
        return p;
    }
}
