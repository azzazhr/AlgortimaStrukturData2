package minggu11.Tugas1;

public class NodeTugas107 {
    String nama;
    int nim;
    NodeTugas107 next;

    NodeTugas107(int nim, String nama, NodeTugas107 berikutnya) {
        this.nim = nim;
        this.nama = nama;
        next = berikutnya;
    }

    NodeTugas107(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}
