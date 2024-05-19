package minggu12.Tugas1;

import java.util.Scanner;

public class PengantriMain07 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList07 list = new DoubleLinkedList07();
        boolean run = true;

        do {
            System.out.println("\n++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EKSTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian: ");
                    int no = scan.nextInt();
                    System.out.println("Nama Penerima: ");
                    scan.nextLine();
                    String nama = scan.nextLine();
                    Pengantri07 antrian = new Pengantri07(no, nama);
                    list.addLast(antrian);
                    break;
                case 2:
                    list.removeFirst();
                    break;
                case 3:
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++");
                    list.print();
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("Keluar Dari Program\nTerimakasih!");
                    System.out.println("---------------------------------");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (run);
    }
}
