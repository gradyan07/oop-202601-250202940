package id.ac.upb.asetpinjam.jadwal;

import id.ac.upb.asetpinjam.model.Peminjaman;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JadwalPeminjaman {

    private final List<Peminjaman> daftar = new ArrayList<>();
    private final int kuotaLaptop;

    public JadwalPeminjaman(int kuotaLaptop) {
        this.kuotaLaptop = kuotaLaptop;
    }

    protected int kuotaLaptop() {
        return kuotaLaptop;
    }

    protected List<Peminjaman> daftarMutable() {
        return daftar;
    }

    public void tambah(Peminjaman p) {
        daftar.add(p);
    }

    public boolean bentrok(Peminjaman baru) {
        if (baru == null) {
            throw new IllegalArgumentException("Peminjaman baru tidak boleh null");
        }
        String kodeBaru = baru.getAset().getKode();
        for (Peminjaman ada : daftar) {
            if (!ada.getAset().getKode().equals(kodeBaru)) {
                continue;
            }
            if (baru.getMulai().isBefore(ada.getSelesai()) && baru.getSelesai().isAfter(ada.getMulai())) {
                return true;
            }
        }
        return false;
    }

    public List<Peminjaman> semuaUrutMulai() {
        List<Peminjaman> hasil = new ArrayList<>(daftar);
        hasil.sort(Comparator.comparing(Peminjaman::getMulai));
        return hasil;
    }

    public Map<String, List<Peminjaman>> perAset() {
        Map<String, List<Peminjaman>> hasil = new LinkedHashMap<>();
        for (Peminjaman p : daftar) {
            String kodeAset = p.getAset().getKode();
            hasil.computeIfAbsent(kodeAset, k -> new ArrayList<>()).add(p);
        }
        return hasil;
    }

    public boolean hapus(String id) {
        if (id == null) {
            return false;
        }
        return daftar.removeIf(p -> p.getId().equals(id));
    }

    public void ajukan(Peminjaman baru) {
        throw new UnsupportedOperationException("TODO minggu 9: ajukan");
    }
}