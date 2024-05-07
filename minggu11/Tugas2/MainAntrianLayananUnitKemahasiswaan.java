package minggu11.Tugas2;

import java.util.Scanner;

public class MainAntrianLayananUnitKemahasiswaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianLayananUnitKemahasiswaan antrian = new AntrianLayananUnitKemahasiswaan();

        while (true) {
            System.out.println("===============================================");
            System.out.println("    MENU ANTRIAN LAYANAN UNIT KEMAHASISWAAN    ");
            System.out.println("===============================================");
            System.out.println("1. Tambahkan antrian (Enqueue)");
            System.out.println("2. Layani Antrian (Dequeue)");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan NIM         : ");
                    int nim = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan Nama        : ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan Keperluan   : ");
                    String keperluan = sc.nextLine();

                    antrian.enqueue(nim, nama, keperluan);
                    System.out.println("Mahasiswa dengan NIM " + nim + " telah ditambahkan ke antrian.");
                    System.out.println();
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
