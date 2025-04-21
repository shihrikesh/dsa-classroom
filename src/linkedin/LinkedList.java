package linkedin;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public static class Node {
        int value;
        Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

    }

    public LinkedList() {
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            // head updated only when linkedList is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /**
     * assign temp and pre with head,
     * as we first check if linkedList is empty or not
     * <p>
     * if not empty, find if next node of Head is null if null, point head and tail to null deleting node
     * reduce length
     * <p>
     * if next element is not null keep iterating until we fine and assign pre to current temp.next
     * so when we do find last element , pre would be pointing to second last element
     * now point tail to pre and tail.next to null
     * reduce length
     */
    public Node removeLastItem() {
        Node temp = head;
        Node pre = head;
        if (length != 0) {
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;

            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
        return null;
    }

    /**
     * two conditions,
     * one if existing linkedList having value
     * then point head to new node and next to old head
     * <p>
     * if not values create node assign head and tail.
     *
     * @param value
     */
    public void prePendItem(int value) {

        Node newHead = new Node(value);
        if (length == 0) {
            head = newHead;
            tail = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        length++;

        // use below as well

        /*if(length==0){
            append(value);
        } else{
            Node newNode = new Node(value);
            newNode.next=head;
            head= newNode;
            length++;
        }*/

    }

    /**
     * check if list is not empty
     * then check with it contains only one value
     * assign head and tail to null if only one element
     * <p>
     * if more than one element
     * then assign head to temp.next. next element of Head
     * reduce length
     */
    public Node removeFirst() {
        if (length != 0) {
            Node temp = head;
            if (length == 1) {
                head = null;
                tail = null;
            } else {
                head = temp.next;
            }
            length--;
            // return node next element should not be pointing to node rather null
            temp.next = null;
            return temp;
        }
        return null;
    }

    /**
     * check if list is empty, index is less than 0 or greater or equal to length return null
     * for loop till index retrun index
     *
     * @param index
     * @return
     */
    public Node get(int index) {

        if (length == 0 || index < 0 || index >= length) return null;
        if (index == 0)
            return head;
        if (index == length - 1)
            return tail;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    /**
     * get node with get() methos
     * check if null ot not
     * if not null set new vlaue to current temp node
     * return true
     * else return false
     *
     * @param index
     * @param value
     * @return
     */
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    /**
     * check empty and index validity
     * if index 0, then use prePendItem
     * if last index, use append to insert
     * find element with get(index-1) // as we need element one node before index
     * create new node and replace new node next with Node received from get(index) call
     * now change node.next value of get(index-1) with new node.
     * we have added node successfully
     *
     * @param index
     * @param value
     * @return
     */
    public boolean insert(int index, int value) {
        if (length == 0 || index < 0 || index > length) return false;
        if (index == 0) {
            prePendItem(value);
            return true;
        }
        if (index == length - 1) {
            append(value);
            return true;
        }
        Node temp = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    /**
     * check index validity
     * if index 0, removeFirst()
     * if last index(length-1) , removeLast()
     * <p>
     * use get(index-1) to get pre Node
     * temp node using pre.next , node to be removed
     * <p>
     * point preNode to temp.next node
     * reduce length of list by 1
     * make temp.next point to null
     * return temp node
     *
     * @param index
     * @return
     */
    public Node remove(int index) {
        if (length == 0 || index < 0 || index >= length) return null;
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLastItem();
        }

        Node pre = get(index - 1);
        Node temp = pre.next;//get(index);
        pre.next = temp.next;
        length--;
        temp.next = null;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    /**
     * find middle node
     * Slow and fast pointer
     * <p>
     * loop over fast and fast.next !null
     * increment slow.next and fast to fast.next.next;
     *
     * @return
     */
    public Node findMiddleNode() {
        if (length == 0) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    /**
     * find loop in list
     * <p>
     * slow and fast pointer
     * keep the loop just check if anytime slow and fast pointer matches
     *
     * @return
     */
    public boolean hasLoop() {
        if (length == 0) return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node mergeSortedList(Node node1, Node node2) {
        Node head = new Node();
        Node tail = head;

        while (node1 != null && node2 != null) {
            if (node1.value < node2.value) {
                tail.next = node1;
            } else {
                tail.next = node2;
            }
            tail = tail.next;
        }

        if (node1 != null) {
            tail.next = node1;
        } else {
            tail.next = node2;
        }
        return head.next;
    }

    public Node findKthFromEnd(int index) {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;

        int length = 1;
        if(index==length) return null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            length = length + 2;
        }
        if (index > length) {
            return null;
        }
        int newIndex = length - index;
        Node temp = head;
        for (int i = 0; i < newIndex; i++) {
            temp = temp.next;

        }
        return temp;
    }

    public Node findKthFromLast2(int k){
        Node slow= head;
        Node fast=head;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public void getHead() {
        System.out.println("Head " + head.value);
    }

    public void getTail() {
        System.out.println("Tail " + tail.value);
    }

    public void getLength() {
        System.out.println("Length " + length);
    }
}
