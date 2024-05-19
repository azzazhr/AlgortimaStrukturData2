package minggu12.Tugas1;

public class Node07 {
    Pengantri07 data;
    Node07 prev, next;

    Node07(Node07 prev, Pengantri07 item, Node07 next) {
        this.prev = prev;
        data = item;
        this.next = next;
    }
}
