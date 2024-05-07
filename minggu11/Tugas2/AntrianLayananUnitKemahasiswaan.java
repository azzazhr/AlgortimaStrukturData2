package minggu11.Tugas2;

public class AntrianLayananUnitKemahasiswaan {
    NodeTugas207 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int nim, String nama, String keperluan) {
        NodeTugas207 newNode = new NodeTugas207(nim, nama, keperluan);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        NodeTugas207 front = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        System.out.println("Mahasiswa yang dilayani: ");
        System.out.println("NIM: " + front.nim);
        System.out.println("Nama: " + front.nama);
        System.out.println("Keperluan: " + front.keperluan);
        System.out.println();
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Daftar antrian: ");
        NodeTugas207 temp = head;
        while (temp != null) {
            System.out.println("NIM: " + temp.nim + ", Nama: " + temp.nama + ", Keperluan: " + temp.keperluan);
            temp = temp.next;
        }
    }
}
