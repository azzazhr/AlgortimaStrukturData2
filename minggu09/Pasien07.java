package minggu09;

public class Pasien07 {
    String nama07;
    int nomorPasien07;
    String alamat07;
    String penyakit07;
    String dokter07;

    public Pasien07(String nama07, int nomorPasien07, String alamat07, String penyakit07, String dokter07) {
        this.nama07 = nama07;
        this.nomorPasien07 = nomorPasien07;
        this.alamat07 = alamat07;
        this.penyakit07 = penyakit07;
        this.dokter07 = dokter07;

    }

    public void tampilDataPasien() {
        System.out.println("Nama Pasien: " + nama07);
        System.out.println("Nomor Pasien: " + nomorPasien07);
        System.out.println("Alamat: " + alamat07);
        System.out.println("Penyakit: " + penyakit07);
        System.out.println("Nama Dokter: " + dokter07);
        System.out.println();
    }
}
