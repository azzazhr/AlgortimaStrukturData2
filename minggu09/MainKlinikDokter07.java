package minggu09;

import java.util.Scanner;

public class MainKlinikDokter07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianPasien07 data = new PencarianPasien07();
        int jumlahPasien = 3;

        while (true) {
            System.out.println("=========================================================");
            System.out.println("               MENU PROGRAM KLINIK DOKTER                ");
            System.out.println("=========================================================");
            System.out.println("1. Menampilkan Deret Data Secara Ascending");
            System.out.println("2. Menampilkan Deret Data Secara Descending");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = s1.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                    Masukkan Data Pasien                   ");
                    System.out.println("-----------------------------------------------------------");
                    for (int i = 0; i < jumlahPasien; i++) {
                        System.out.print("Nama Pasien \t: ");
                        String namaPasien = s.nextLine();
                        System.out.print("Nomor Pasien \t: ");
                        int nomorPasien = s1.nextInt();
                        System.out.print("Alamat    \t: ");
                        String alamat = s.nextLine();
                        System.out.print("Penyakit \t: ");
                        String penyakit = s.nextLine();
                        System.out.print("Nama Dokter  \t: ");
                        String dokter = s.nextLine();

                        Pasien07 p = new Pasien07(namaPasien, nomorPasien, alamat, penyakit, dokter);
                        data.tambah(p);

                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------");
                    System.out.println("        Data Keseluruhan Pasien Secara Ascending:       ");
                    System.out.println("--------------------------------------------------------");
                    data.bubbleSortAscending();
                    data.tampil();
                    System.out.println("--------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                    Masukkan Data Pasien                   ");
                    System.out.println("-----------------------------------------------------------");
                    for (int i = jumlahPasien - 1; i >= 0; i--) {
                        System.out.print("Nama Pasien \t: ");
                        String nama = s.nextLine();
                        System.out.print("Nomor Pasien \t: ");
                        int nomorPasien = s1.nextInt();
                        System.out.print("Alamat    \t: ");
                        String alamat = s.nextLine();
                        System.out.print("Penyakit \t: ");
                        String penyakit = s.nextLine();
                        System.out.print("Nama Dokter \t: ");
                        String dokter = s.nextLine();

                        Pasien07 p = new Pasien07(nama, nomorPasien, alamat, penyakit, dokter);
                        data.tambah(p);

                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------");
                    System.out.println("        Data Keseluruhan Pasien Secara Descending:      ");
                    System.out.println("--------------------------------------------------------");
                    data.bubbleSortDescending();
                    data.tampil();
                    System.out.println("--------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("                      Pencarian Data                      ");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Masukkan Nomor Pasien Yang Dicari ");
                    System.out.print("Nomor Pasien : ");
                    int cari = s1.nextInt();
                    System.out.println("-----------------------------");
                    System.out.println("Menggunakan Sequential Search");
                    System.out.println("-----------------------------");
                    int posisi = data.FindSeqSearch(cari);
                    data.TampilPosisi(cari, posisi);
                    data.TampilData(cari, posisi);
                    System.out.println("-------------------------");
                    System.out.println("Menggunakan Binary Search");
                    System.out.println("-------------------------");
                    int posisi2 = data.FindBinarySearch(cari, 0, jumlahPasien - 1);
                    data.TampilPosisi(cari, posisi2);
                    data.TampilData(cari, posisi2);
                    break;

                case 4:
                    System.out.println("Keluar dari program...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");

            }
        }
    }
}