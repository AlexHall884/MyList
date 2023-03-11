

public class Programm {


    public static void main(String[] args) {
        
        MyList list = new MyList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
 
        System.out.println("Исходный список:");
        list.printList();
 
        list.reverse();
 
        System.out.println("\nPазвёрнyтый список:");
        list.printList();


    }
}

