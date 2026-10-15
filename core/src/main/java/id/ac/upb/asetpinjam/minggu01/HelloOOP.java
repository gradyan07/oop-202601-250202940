package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;

public class HelloOOP {

    // TODO minggu 1: tambahkan field private untuk nama dan nim.
    private final String nama;
    private final String nim;

    public HelloOOP(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    /** TODO minggu 1: sapaan memuat "Aset-Pinjam", nama, dan NIM. */
    public String sapa() {
        return "Aset-Pinjam " + this.nama + " (NIM: " + this.nim + ")";
    }

    public static void main(String[] args) {
    Varian v = Varian.aktif();
    System.out.println(new HelloOOP(v.nama, v.nim).sapa());
}
}
