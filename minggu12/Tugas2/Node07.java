package minggu12.Tugas2;

public class Node07 {
    Film07 data;
    Node07 prev, next;

    Node07(Node07 prev, Film07 item, Node07 next) {
        this.prev = prev;
        data = item;
        this.next = next;
    }
}
