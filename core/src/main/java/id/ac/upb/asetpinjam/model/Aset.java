package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.kontrak.DapatDipinjam;

/**
 * Aset yang dapat dipinjam.
 *
 * <p>Kelas abstrak: tiap jenis aset wajib mengimplementasikan hitungDenda().
 * Aturan bisaDipinjam() berlaku sama untuk semua jenis aset.
 */
public abstract class Aset implements DapatDipinjam {

    private final String kode;
    private String nama;
    private StatusAset status = StatusAset.TERSEDIA;
    private Kondisi kondisi = Kondisi.BAIK;

    public Aset(String kode, String nama) {
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("Kode tidak boleh kosong");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public StatusAset getStatus() {
        return status;
    }

    public Kondisi getKondisi() {
        return kondisi;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }

    public void setStatus(StatusAset status) {
        if (status == null) {
            throw new IllegalArgumentException("Status tidak boleh null");
        }
        this.status = status;
    }

    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) {
            throw new IllegalArgumentException("Kondisi tidak boleh null");
        }
        this.kondisi = kondisi;
    }

    /** true hanya jika status TERSEDIA dan kondisi bukan RUSAK_BERAT. */
    @Override
    public boolean bisaDipinjam() {
        return status == StatusAset.TERSEDIA && kondisi != Kondisi.RUSAK_BERAT;
    }

    /** TODO minggu 3: dioverride tiap subclass agar mengembalikan jenis yang benar. */
    public JenisAset getJenis() {
        throw new UnsupportedOperationException("TODO minggu 3");
    }

    /** Denda keterlambatan. Dioverride tiap subclass (aturan di docs/aturan-bisnis.md). */
    public abstract long hitungDenda(int hariTerlambat);
}