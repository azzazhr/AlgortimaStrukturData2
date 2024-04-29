package minggu10;

import java.util.Scanner;

public class QueueMainLatihan07 {
    public static void menu() {
        System.out.println("============ MENU ============");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian paling belakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Pencarian nama");
        System.out.println("7. Data seluruh pembeli");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue: ");
        int n = sc.nextInt();
        Pembeli07 antri = new Pembeli07(n);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String noHP = sc.nextLine();
                    Pembeli07 nb = new Pembeli07(nama, n);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;

                case 2:
                    Pembeli07 data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.noHP)) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;

                case 5:
                    antri.print();
                    break;

                case 6:
                    System.out.println("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                    break;

                case 7:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}