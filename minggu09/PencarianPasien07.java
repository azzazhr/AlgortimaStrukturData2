package minggu09;

public class PencarianPasien07 {

    Pasien07 listPasien07[] = new Pasien07[3];
    int idx;

    void tambah(Pasien07 p) {
        if (idx < listPasien07.length) {
            listPasien07[idx] = p;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < listPasien07.length; i++) {
            Pasien07 pasien = listPasien07[i];
            pasien.tampilDataPasien();
        }
    }

    void bubbleSortAscending() {
        int n = listPasien07.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listPasien07[j].nomorPasien07 > listPasien07[j + 1].nomorPasien07) {
                    // Tukar posisi jika diperlukan
                    Pasien07 temp = listPasien07[j];
                    listPasien07[j] = listPasien07[j + 1];
                    listPasien07[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortDescending() {
        int n = listPasien07.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listPasien07[j].nomorPasien07 < listPasien07[j + 1].nomorPasien07) {
                    // Tukar posisi jika diperlukan
                    Pasien07 temp = listPasien07[j];
                    listPasien07[j] = listPasien07[j + 1];
                    listPasien07[j + 1] = temp;
                }
            }
        }
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan nomor pasien " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan nomor pasien " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nama Pasien\t: " + listPasien07[pos].nama07);
            System.out.println("Nomor Pasien\t: " + listPasien07[pos].nomorPasien07);
            System.out.println("Alamat       \t: " + listPasien07[pos].alamat07);
            System.out.println("Penyakit\t: " + listPasien07[pos].penyakit07);
            System.out.println("Nama Dokter\t: " + listPasien07[pos].dokter07);
        } else {
            System.out.println("Data dengan nomor pasien " + x + " tidak ditemukan");
        }
    }

    public int FindSeqSearch(int cari) {
        for (int i = 0; i < listPasien07.length; i++) {
            if (listPasien07[i].nomorPasien07 == cari) {
                return i;
            }
        }
        return -1;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listPasien07[mid].nomorPasien07 == cari) {
                return mid;
            }
            if (listPasien07[mid].nomorPasien07 < cari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}