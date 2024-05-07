package minggu11.Tugas1;

import java.util.Scanner;

public class SLLMainTugas107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedListTugas107 singLL = new SingleLinkedListTugas107();

        singLL.print();

        // Penambahan data mahasiswa
        singLL.addFirst(113, "Yusuf"); // Mhs3
        singLL.print(); // Output: Isi Linked List: 113

        singLL.addLast(115, "Sari"); // Mhs5
        singLL.print(); // Output: Isi Linked List: 113, 115

        singLL.addFirst(111, "Anton"); // Mhs1
        singLL.print(); // Output: Isi Linked List: 111, 113, 115

        singLL.insertAfter(111, 112, "Prita"); // Mhs2
        singLL.print(); // Output: Isi Linked List: 111, 112, 113, 115

        singLL.insertAt(3, 114, "Doni"); // Mhs4
        singLL.print(); // Output: Isi Linked List: 111, 112, 113, 115
    }
}
