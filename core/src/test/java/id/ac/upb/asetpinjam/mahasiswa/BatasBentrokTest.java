package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static org.assertj.core.api.Assertions.assertThat;

import id.ac.upb.asetpinjam.TestSupport;
import id.ac.upb.asetpinjam.config.Varian;
import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import id.ac.upb.asetpinjam.model.Peminjaman;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("week7")
class BatasBentrokTest {

    @Test
    void selesaiSamaDenganMulai() {
        JadwalPeminjaman jadwal = new JadwalPeminjaman(Varian.aktif().kuotaLaptop);
        
        // Peminjaman pertama jam 9 sampai 11
        jadwal.tambah(pinjam("1", TestSupport.peminjam("P1"), TestSupport.ruang("R-1"), 9, 11));

        // Peminjaman kedua jam 11 sampai 13 (mulai pas peminjaman pertama selesai)
        Peminjaman sesudah = pinjam("2", TestSupport.peminjam("P2"), TestSupport.ruang("R-1"), 11, 13);
        
        // Peminjaman ketiga jam 7 sampai 9 (selesai pas peminjaman pertama mulai)
        Peminjaman sebelum = pinjam("3", TestSupport.peminjam("P3"), TestSupport.ruang("R-1"), 7, 9);

        // Pastikan keduanya tidak dianggap bentrok
        assertThat(jadwal.bentrok(sesudah)).isFalse();
        assertThat(jadwal.bentrok(sebelum)).isFalse();
    }
}