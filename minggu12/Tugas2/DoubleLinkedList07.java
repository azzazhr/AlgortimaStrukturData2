package minggu12.Tugas2;

public class DoubleLinkedList07 {
    Node07 head;
    int size;

    public DoubleLinkedList07() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Film07 item, int pos) throws Exception {
        if (pos < 1 || pos > size + 1) {
            throw new Exception("Posisi data film di luar batas");
        } else if (pos == 1) {
            addFirst(item);
        } else if (pos == size + 1) {
            addLast(item);
        } else {
            Node07 current = head;
            int currentPos = 1;
            while (currentPos < pos - 1) {
                current = current.next;
                currentPos++;
            }
            Node07 newNode = new Node07(current, item, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void addFirst(Film07 item) {
        if (isEmpty()) {
            head = new Node07(null, item, null);
        } else {
            Node07 newNode = new Node07(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film07 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node07 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node07 newNode = new Node07(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node07 tmp = head;
            int index = 1;
            while (tmp != null) {
                Film07 film = tmp.data;
                System.out.println("--------------------------------");
                System.out.println("Film ke-" + index);
                System.out.println("--------------------------------");
                System.out.println("ID: " + film.id);
                System.out.println(" Judul Film: " + film.judul);
                System.out.println(" Rating: " + film.rating);
                tmp = tmp.next;
                index++;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void remove(int position) throws Exception {
        if (position < 1 || position > size) {
            throw new Exception("Posisi data film di luar batas");
        } else if (position == 1) {
            removeFirst();
        } else if (position == size) {
            removeLast();
        } else {
            Node07 current = head;
            int currentPosition = 1;
            while (currentPosition < position) {
                current = current.next;
                currentPosition++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            Film07 film = current.data;
            System.out.println("Film " + film.judul + " telah berhasil dihapus!");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            Film07 film = head.data;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Film " + film.judul + " telah berhasil dihapus!");
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node07 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Film07 film = current.next.data;
        current.next = null;
        size--;
        System.out.println("Film " + film.judul + " telah berhasil dihapus!");
    }

    public Film07 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public Film07 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node07 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film07 get(int id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node07 current = head;
        int index = 1;
        while (current != null) {
            if (current.data.id == id) {
                Film07 film = current.data;
                System.out.println("Data ID Film: " + film.id + " berada di node ke-" + index);
                System.out.println("IDENTITAS:");
                System.out.println("ID: " + film.id);
                System.out.println(" Judul Film: " + film.judul);
                System.out.println(" Rating: " + film.rating);
                return current.data;
            }
            current = current.next;
            index++;
        }
        throw new Exception("Film dengan ID " + id + " tidak ditemukan.");
    }

    public DoubleLinkedList07 dataAsli() {
        DoubleLinkedList07 listAsli = new DoubleLinkedList07();
        if (!isEmpty()) {
            Node07 tmp = head;
            while (tmp != null) {
                listAsli.addLast(tmp.data);
                tmp = tmp.next;
            }
        }
        return listAsli;
    }

    public void sort() {
        if (isEmpty() || size == 1) {
            print();
        }
        DoubleLinkedList07 dataUrut = dataAsli();
        if (dataUrut.size == 1) {
            dataUrut.print();
            return;
        }
        for (int i = 0; i < dataUrut.size - 1; i++) {
            Node07 current = dataUrut.head;
            for (int j = 0; j < dataUrut.size - 1 - i; j++) {
                if (current.data.rating < current.next.data.rating) {
                    Film07 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }
        }
        dataUrut.print();
    }

}
