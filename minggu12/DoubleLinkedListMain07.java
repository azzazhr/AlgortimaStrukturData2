package minggu12;

import java.util.Scanner;

public class DoubleLinkedListMain07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        doublelinkedlist07 dll = new doublelinkedlist07();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.celar();
        dll.print();
        System.out.println("Size : " + dll.size());

    }
}
