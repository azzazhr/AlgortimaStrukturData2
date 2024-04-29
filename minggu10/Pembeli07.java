package minggu10;

public class Pembeli07 {
    String nama;
    int noHP;

    Pembeli07(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    Pembeli07[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Pembeli07(int n) {
        max = n;
        antrian = new Pembeli07[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Pembeli07 dt) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Pembeli07[] data;
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli07 Dequeue() {
        Pembeli07 dt = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = 0; i < antrian.length; i++) {
                if (antrian[i].nama.equalsIgnoreCase(nama)) {
                    System.out.println("Anda urutan ke" + i);
                }
            }
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama);
            System.out.println("Jumlah Antrian = " + size);
        }
    }
}