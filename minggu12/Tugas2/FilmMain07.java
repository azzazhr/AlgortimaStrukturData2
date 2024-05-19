package minggu12.Tugas2;

import java.util.Scanner;

public class FilmMain07 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        DoubleLinkedList07 list = new DoubleLinkedList07();
        int idF;
        String judul;
        float rating;
        boolean run = true;

        do {
            System.out.println("====================================");
            System.out.println("        DATA FILM LAYAR LEBAR       ");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Posisi Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("====================================");
            int input = scan.nextInt();
            System.out.println("====================================");
            switch (input) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("====================================");
                    System.out.println("ID Film:");
                    idF = scan.nextInt();
                    System.out.println("Judul Film:");
                    scan.nextLine();
                    judul = scan.nextLine();
                    System.out.println("Rating Film:");
                    rating = scan.nextFloat();
                    Film07 filmAwal = new Film07(idF, judul, rating);
                    System.out.println("====================================");
                    list.addFirst(filmAwal);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("====================================");
                    System.out.println("ID Film:");
                    idF = scan.nextInt();
                    System.out.println("Judul Film:");
                    scan.nextLine();
                    judul = scan.nextLine();
                    System.out.println("Rating Film:");
                    rating = scan.nextFloat();
                    Film07 filmAkhir = new Film07(idF, judul,
                            rating);
                    System.out.println("====================================");
                    list.addLast(filmAkhir);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Urutan Ke-");
                    System.out.println("====================================");
                    System.out.println("ID Film:");
                    idF = scan.nextInt();
                    System.out.println("Judul Film:");
                    scan.nextLine();
                    judul = scan.nextLine();
                    System.out.println("Rating Film:");
                    rating = scan.nextFloat();
                    System.out.println("Data Film Ini Akan Masuk Diurutan Ke-");
                    int urutan = scan.nextInt();
                    Film07 filmUrutan = new Film07(idF, judul, rating);
                    System.out.println("====================================");
                    list.add(filmUrutan, urutan);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.println("Film Urutan Berapa Yang Ingin Anda Hapus?");
                    System.out.println("====================================");
                    list.print();
                    System.out.println("====================================");
                    System.out.print("Masukkan urutan film: ");
                    int hapusUrutan = scan.nextInt();
                    list.remove(hapusUrutan);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    list.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film Yang Dicari:");
                    System.out.println("====================================");
                    int cariId = scan.nextInt();
                    list.get(cariId);
                    break;
                case 9:
                    System.out.println("Urutan Film Terbaik Berdasarkan Rating:");
                    list.sort();
                    break;
                case 10:
                    System.out.println("Keluar Dari Program\nTerimakasih!");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (run);
    }
}
