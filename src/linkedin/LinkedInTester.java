package linkedin;

public class LinkedInTester {

    public static void main(String[] args) {

        // Test append and delete last
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.removeLastItem();
        //linkedList.removeLastItem();
        //linkedList.removeLastItem();
        linkedList.printList();

        linkedList.getLength();

        // test pre -pend

        System.out.println(" Test Prepend ");
        LinkedList prependList = new LinkedList(1);
        prependList.append(2);
        prependList.append(3);
        prependList.printList();
        prependList.prePendItem(4);
        prependList.printList();
        prependList.getLength();

        System.out.println(" Using default constructor");
        LinkedList prependList1 = new LinkedList();
        prependList1.printList();
        prependList1.prePendItem(4);
        prependList1.printList();
        prependList1.getLength();
        prependList1.getHead();
        prependList1.getTail();


        System.out.println(" Check remove first");
        LinkedList removeFirst = new LinkedList();
        removeFirst.printList();
        removeFirst.removeFirst();
        System.out.println("With element");
        LinkedList removeFirst1 = new LinkedList(1);
        //removeFirst1.append(2);
        //removeFirst1.append(3);
        removeFirst1.printList();
        removeFirst1.removeFirst();
        removeFirst1.getLength();
        //removeFirst1.getHead();
        //removeFirst1.getTail();


        System.out.println(" get element via index");
        LinkedList getList = new LinkedList();
        getList.append(1);
        getList.append(2);
        getList.append(4);
        getList.append(4);
        getList.append(3);
        System.out.println(getList.get(0).value);

        System.out.println(" set element via index");
        LinkedList setList = new LinkedList();
        setList.append(1);
        setList.append(2);
        setList.append(4);
        setList.append(3);
        System.out.println(setList.set(2,68));
        setList.printList();

        System.out.println(" insert element via index");
        LinkedList insertList = new LinkedList();
        insertList.append(1);
        insertList.append(2);
        insertList.append(4);
        insertList.append(3);
        insertList.printList();
        System.out.println(insertList.insert(2,68));
        System.out.println("after insert");
        insertList.printList();


        System.out.println(" remove element via index");
        LinkedList removeList = new LinkedList();
        removeList.append(1);
        removeList.append(2);
        removeList.append(4);
        removeList.append(3);
        removeList.printList();
        System.out.println("removed element "+removeList.remove(2).value);
        System.out.println("after insert");
        removeList.printList();

        System.out.println(" reverse linked list");
        LinkedList reverseList = new LinkedList();
        reverseList.append(1);
        reverseList.append(2);
        reverseList.append(4);
        reverseList.append(3);
        reverseList.printList();
        System.out.println(" Reverse list ");
        reverseList.reverse();
        reverseList.printList();


    }
}
