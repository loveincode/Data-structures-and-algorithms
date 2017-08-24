package data_structures.data03_linkedlist;

public class DoubleLinkedList {
	// 哨兵节点nil(作为表头指针)
    private Node nil;
    // 初始化一个链表
    DoubleLinkedList(){
        nil = new Node();
        nil.next = nil;
        nil.prev = nil;
        count = 0;
    }
    // 链表长度
    private int count;
    private static class Node{
        int item;
        Node next;
        Node prev;

        Node(){
            item = 0;
            next = null;
            prev = null;
        }
        Node(int item, Node next, Node prev){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    //返回当前链表的长度
    public int length(){
        return count;
    }

    //获取value为k的节点
    public Node listsearch(int k){
        Node result = null;
        Node head = nil;
        while(head.next != nil){
            if(head.next.item == k){
                result = head.next;
                break;
            }
            else
                head = head.next;
        }
        return result;
    }

    //插入一个节点在队首
    public void listinsert(Node node){
            node.next = nil.next;
            nil.next.prev = node;
            nil.next = node;
            node.prev = nil;
            count++;
    }
    //根据value删除一个节点
    public Node listdelete(Node node){
        Node head = nil;
        Node nodetodelete;
        while(head.next!=nil){
            if(head.next.item == node.item){
                nodetodelete = head.next; //将要删除的节点
                head.next = nodetodelete.next;
                nodetodelete.next.prev  = head;
                nodetodelete = null;

                count--;
            }
            else{
                head = head.next;
            }
        }
        return node;
    }
    //输出链表
    public void traverse(){
        Node head = nil;
        while( head.next!= nil){
            System.out.println(head.next.item);
            head = head.next;
        }
    }
    
    
}
