public class MyList {
    Node head;

    public void reverse() {
        Node prev = null;
        Node curr = head;
 
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
 
        head = prev;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }
}
